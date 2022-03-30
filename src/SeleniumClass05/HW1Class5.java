package SeleniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1Class5 {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement accountCreate = driver.findElement(By.linkText("Create new account"));
        accountCreate.click();
        Thread.sleep(2000);
        // verify month dd has 12 months
        WebElement monthsDD = driver.findElement(By.name("birthday_month"));
        Select selectMonths = new Select(monthsDD);
        List<WebElement> allOptions = selectMonths.getOptions();
        int size = allOptions.size();
        if (size == 12) {
            System.out.println("Verifying month  " + size + " months");
        }
        Thread.sleep(2000);
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDays = new Select(dayDD);
        List<WebElement> allOptionsDays = selectDays.getOptions();
        int daySize = allOptionsDays.size();
        if (daySize == 31) {
            System.out.println("verifying that days drop down has " + daySize + " days");
        }
        Thread.sleep(2000);
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        List<WebElement> allOptionsYear = selectYear.getOptions();
        int yearSize = allOptionsYear.size();
        System.out.println(yearSize);
        if (yearSize == 115) {
            System.out.println("verifying year drop down has " + yearSize + " years");
        } else {
            System.out.println("year drop down not verified  " + yearSize);
        }
        selectMonths.selectByVisibleText("April");
        Thread.sleep(2000);
        selectDays.selectByValue("14");
        Thread.sleep(2000);
        selectYear.selectByVisibleText("1978");
        driver.quit();
    }
}