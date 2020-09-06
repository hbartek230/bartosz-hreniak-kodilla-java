package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTHDAY_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_BIRTHDAY_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_BIRTHDAY_YEAR = "//select[contains(@name, \"birthday_year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/register");
        WebElement birthdayDay = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        WebElement birthdayMonth = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        WebElement birthdayYear = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));

        while (!birthdayDay.isDisplayed());
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByIndex(2);

        while (!birthdayMonth.isDisplayed());
        Select selectMonth = new Select(birthdayMonth);
        selectMonth.selectByIndex(11);

        while (!birthdayYear.isDisplayed());
        Select selectYear = new Select(birthdayYear);
        selectYear.selectByValue("1999");


    }
}
