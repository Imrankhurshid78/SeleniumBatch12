package SeleniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectDD {
    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.name("States"));
        Select select=new Select(statesDD);
        boolean isMuliple = select.isMultiple();
        System.out.println(isMuliple);

        if(isMuliple){
            List<WebElement> options =select.getOptions();
            for(WebElement option:options){
                String optiontext = option.getText();
                select.selectByVisibleText(optiontext);
                Thread.sleep(2000);

            }
        }
        select.deselectAll();
    }
}