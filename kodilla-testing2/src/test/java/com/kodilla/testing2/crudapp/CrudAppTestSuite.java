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

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://adamrozycki00.github.io/";
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

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_ADD_TASK_FORM = "//form[contains(@action, \"createTask\")]";
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
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(500);
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        WebElement select1 = driver.findElement(By.xpath("//select[1]"));
        Select select1Dropdown = new Select(select1);
        select1Dropdown.selectByIndex(1);

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

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
    }


}
