package org.example.paralelltesting.a1qatask2;
import org.example.datasubclass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
public class buttonInput {
    WebDriver driver;
    @BeforeClass
    public void HomePage()
    {
        System.setProperty("webdriver.safari.driver.whitelistedIps","/usr/bin/safaridriver");
        driver= new SafariDriver();
        driver.get("https://youtube.com/");
    }
    @Test(priority = 1)
    public void Input()
    {
        WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"search\"]"));
        searchbox.sendKeys ("a1qa");
        Assert.assertTrue(searchbox.isDisplayed(),"box not displayed on the page");
    }
    @Test(priority = 2)
    public void Button()
    {
        WebElement searchButton= driver.findElement(By.xpath("/[@id=\"search-icon-legacy\"]/yt-icon"));
        Assert.assertTrue(searchButton.isDisplayed(),"button not displayed on the page");
        searchButton.click();
    }
}