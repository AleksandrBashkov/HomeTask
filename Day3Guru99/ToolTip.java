import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipTest extends Option {

    @Test (priority = 6)
    public void toolTipTest () {

        driver.get("http://demo.guru99.com/test/social-icon.html");
        WebElement rssTooltip = driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div/div/div[2]/div/a[6]"));

        String expectedTooltip = "Rss";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-bar\"]/div/div/div[2]/div/a[6]")));
        String actualTooltip = rssTooltip.getAttribute("title");
        Assert.assertEquals(actualTooltip, expectedTooltip);
    }
}

