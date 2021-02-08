package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://adamrozycki00.github.io/";
    private static final String LOGIN = System.getenv("TRELLO_EMAIL");
    private static final String PASSWORD = System.getenv("TRELLO_PASSWORD");

    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUp() {
        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        removeTaskInCrudApp(taskName);
        assertTrue(checkIfTaskExistsInTrello(taskName));
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_ADD_TASK_FORM = "//form[contains(@action, \"tasks\")]";
        final String XPATH_TASK_NAME = XPATH_ADD_TASK_FORM + "/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = XPATH_ADD_TASK_FORM + "/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = XPATH_ADD_TASK_FORM + "/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100_000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(1000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName)
                )
                .forEach(theForm -> {
                    WebElement selectBoard = theForm.findElement(By.xpath(".//select[1]"));
                    Select selectBoardDropdown = new Select(selectBoard);
                    selectBoardDropdown.selectByIndex(1);

                    WebElement selectList = theForm.findElement(By.xpath(".//select[2]"));
                    Select selectListDropdown = new Select(selectList);
                    selectListDropdown.selectByVisibleText("Things to do");

                    WebElement createCardButton =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    createCardButton.click();
                });
        Thread.sleep(2000);
    }

    private void removeTaskInCrudApp(String taskName) {
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm ->
                        theForm.findElement(By.xpath(".//div/fieldset[1]/button[4]"))
                                .click());
    }

    private boolean checkIfTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        final String XPATH_COOKIES = "/html/body/div[3]/div/button";
        boolean result;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.xpath(XPATH_COOKIES)).click();
        driverTrello.findElement(By.id("user")).sendKeys(LOGIN);
        driverTrello.findElement(By.id("password")).sendKeys(PASSWORD);
        WebElement login = driverTrello.findElement(By.id("login"));
        login.submit();

        Thread.sleep(2000);

        driverTrello.findElement(By.id("password")).sendKeys(PASSWORD);
        driverTrello.findElement(By.id("login-submit")).click();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(WebElement::click);

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));

        driverTrello.close();

        return result;
    }

}
