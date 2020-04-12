import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

public class PopupTest extends Option {

    @Test (priority = 4)
    public void popupTest () {

        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.cssSelector("[href=\"../articles_popup.php\"]")).click();
        String mainWindow=driver.getWindowHandle();

        Set<String> allWindows=driver.getWindowHandles();

        for (String childWindow : allWindows)
        {

            if(!mainWindow.equalsIgnoreCase(childWindow))
            {

                driver.switchTo().window(childWindow);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).click();

                wait.until(
                        ExpectedConditions
                                .visibilityOfElementLocated(
                                        By.xpath("/html/body/table/tbody/tr[1]/td/h2")));

                WebElement userIdElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
                WebElement passwordElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]"));

                System.out.println(userIdElement.getText());
                System.out.println(passwordElement.getText());


                driver.close();
            }
        }

        driver.switchTo().window(mainWindow);
    }

}
