package SeleniumClass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Class06 {
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement firstAlert=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
        firstAlert.click();
        Alert alert1=driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();
        WebElement secondAlert = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
        secondAlert.click();
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();
        WebElement thirdAlert=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
        thirdAlert.click();
        Alert alert3=driver.switchTo().alert();
        Thread.sleep(2000);
        alert3.sendKeys("I am Prompt Box");
        alert3.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
