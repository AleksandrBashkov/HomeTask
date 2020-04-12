import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends Option {

    @Test(priority = 1)
    public void alertTest () {

        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("user");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();

        String expectedAlertness = "Do you really want to delete this Customer?";
        String actualAlertness = alert.getText();
        Assert.assertEquals(actualAlertness, expectedAlertness);
        alert.accept();

        Alert alert2 = driver.switchTo().alert();
        String expectedAlertness2 = "Customer Successfully Delete!";
        String actualAlertness2 = alert2.getText();
        Assert.assertEquals(actualAlertness2, expectedAlertness2);
        alert2.accept();
    }
}
