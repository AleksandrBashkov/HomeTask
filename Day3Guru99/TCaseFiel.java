import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseFields extends Option {

    @Test (priority = 5)
    public void testCaseFileds () throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);

        WebElement email = driver.findElement(By.id("email"));

        WebElement password = driver.findElement(By.name("passwd"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        System.out.println("Text Field Set");

        email.clear();
        password.clear();
        System.out.println("Text Field Cleared");

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SubmitLogin\"]")));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SubmitLogin\"]")));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/h3")));
        String expectedContain = "Successfully Logged in...";
        WebElement sucsesfull = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        String actualContain = sucsesfull.getText();
        Assert.assertEquals(expectedContain, actualContain);
        System.out.println("Login Done with Click");

        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl"+ Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/h3")));
        Assert.assertEquals(expectedContain, actualContain);
        System.out.println("Login Done with Enter");

        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
        driver.findElement(By.id("SubmitLogin")).submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/h3")));
        Assert.assertEquals(expectedContain, actualContain);
        System.out.println("Login Done with Submit");
    }
}

