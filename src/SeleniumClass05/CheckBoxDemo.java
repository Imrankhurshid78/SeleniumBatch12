package SeleniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        List<WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        int size = optionCheckBoxes.size();

        System.out.println(size);
        for(WebElement option:optionCheckBoxes){
            String checkBoxValue=option.getAttribute("value");
            if(checkBoxValue.equals("Option-2")){
                option.click();
                break;
            }

                }
    }
}
