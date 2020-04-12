import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class DownloadFile extends Option {

    @Test(priority = 2)
    public void uploadFile() {

        driver.get("http://demo.guru99.com/test/yahoo.html");
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String link = downloadButton.getAttribute("href");

        String wgetCommand = "wget -P E:/TestDownload --no-check-certificate "+ link;
        System.out.println(wgetCommand);

        try {
            Process cmd = Runtime.getRuntime().exec(wgetCommand);
            int exitVal = cmd.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
    }


}