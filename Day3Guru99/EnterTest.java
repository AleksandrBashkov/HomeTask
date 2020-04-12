import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenTest extends Option {

    @Test (priority = 3)
    public void openTest() {

        driver.get("http://demo.guru99.com/test/upload/");

        String expectedTitle = "File Upload Demo";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
