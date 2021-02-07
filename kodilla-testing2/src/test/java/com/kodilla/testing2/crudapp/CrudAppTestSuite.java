package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        Thread.sleep(1000);

        return taskName;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();

    }


}
