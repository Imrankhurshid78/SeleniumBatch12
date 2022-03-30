package SeleniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {


        public static String url = "https://www.syntaxprojects.com/basic-checkbox-demo.php";

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement dayDD=driver.findElement(By.id("select-demo"));
            Select select =new Select(dayDD);
         //select.selectByIndex(3);//indexing starts from 0
           // Thread.sleep(1000);
            //select.selectByVisibleText("Thursday");
           //Thread.sleep(1000);
            //select.selectByValue("Sunday");
            List<WebElement> allOptions=select.getOptions();
            int size=allOptions.size();
            System.out.println(size);
            for (WebElement allOption : allOptions) {
                String option = allOption.getText();
                System.out.println(option);
            }
        }
    }

