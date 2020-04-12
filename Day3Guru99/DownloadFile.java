import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFile extends Option {
    @Test (priority = 7)
    public void uploadFile() {

        driver.get("http://demo.guru99.com/test/upload/");
        WebElement uploadButton = driver.findElement(By.name("uploadfile_0"));
        uploadButton.sendKeys("E:/TestDownload/msgr11us.exe");

        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submitbutton\"]")));
        driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"res\"]/center")));
        WebElement successful = driver.findElement(By.xpath("//*[@id=\"res\"]/center"));
        String expectedCongrats = "1 file\n" +
                "has been successfully uploaded.";
        String actualCongrats = successful.getText();
        Assert.assertEquals(expectedCongrats, actualCongrats);
    }
}
