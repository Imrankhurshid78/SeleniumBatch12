package SeleniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2Class5 {
    public static String url = "https://www.ebay.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Actions builder = new Actions(driver);
        WebElement navigButton = driver.findElement(By.id("gh-eb-Geo"));
        builder.moveToElement(navigButton).build().perform();
        WebElement anotherButton = driver.findElement(By.cssSelector("ul[role^='navigation']"));
        Thread.sleep(2000);
        builder.moveToElement(anotherButton).build().perform();
        anotherButton.click();
        Thread.sleep(2000);
        WebElement categoriesDD = driver.findElement(By.cssSelector("select[id='gh-cat']"));
        Select select = new Select(categoriesDD);
        List<WebElement> options = select.getOptions();
        //2.Print all categories
        for(WebElement option: options){
            String optionText = option.getText();
            System.out.println(optionText);
        }
        //3. Select Computers/Tablets & Networking
        select.selectByVisibleText("Computers/Tablets & Networking");
        WebElement button = driver.findElement(By.cssSelector("input[type='submit']"));
        button.click();
        //4. Verify the header
        String header = driver.getTitle();
        if(header.equals("Computers, Tablets & Network Hardware")){
            System.out.println("The header is Present");
        }else {
            System.out.println("The header is not Present");
        }
        driver.quit();
    }
}