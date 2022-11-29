package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
    public class Task3 {
        WebDriver driver;
        @BeforeClass
        void setup()
        {
            System.setProperty("webdriver.safari.driver.whitelistedIps","/usr/bin/safaridriver");
            driver= new SafariDriver();
            driver.get("https://youtube.com/");
        }
        @org.testng.annotations.Test(priority = 1)
        void uniqueTest()
        {
            WebElement logo= driver.findElement(By.xpath("//*[@id=\"logo_holder\"]/a/img"));
            Assert.assertTrue(logo.isDisplayed()," 1. Main page is open");
        }
        @org.testng.annotations.Test(priority = 2)
        void homepagetitle()
        {
            String title= driver.getTitle();
            Assert.assertEquals("Autumn Sale", title, "Title is not matched;");
        }

        @Test(priority = 4)
        void SearchBoxClickPage()
        {
            driver.findElement(By.xpath("//*[@id=\"store_nav_search_term\"]")).sendKeys("laptop");
            driver.findElement(By.xpath("//*[@id=\"store_search_link\"]/img")).click();
            String completeURL = request.getRequestURL().toString();
            Assert.assertEquals("https://store.steampowered.com/search/?term=laptop",completeURL, "Title is not matched;");
        }

    }

}
