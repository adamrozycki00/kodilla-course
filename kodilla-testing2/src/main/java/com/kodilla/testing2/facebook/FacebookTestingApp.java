package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[@class=\"_4t2a\"]//button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_BIRTHDAY = "//span[@class=\"_5k_4\"]";
    public static final String XPATH_BIRTHDAY_DAY = XPATH_BIRTHDAY + "/span/select[1]";
    public static final String XPATH_BIRTHDAY_MONTH = XPATH_BIRTHDAY + "/span/select[2]";
    public static final String XPATH_BIRTHDAY_YEAR = XPATH_BIRTHDAY + "/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookies.click();

        WebElement newAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccount.click();

        Thread.sleep(500);

        WebElement selectDay = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        Select selectDayDropdown = new Select(selectDay);
        selectDayDropdown.selectByValue("1");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        Select selectMonthDropdown = new Select(selectMonth);
        selectMonthDropdown.selectByValue("1");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));
        Select selectYearDropdown = new Select(selectYear);
        selectYearDropdown.selectByValue("2001");
    }

}
