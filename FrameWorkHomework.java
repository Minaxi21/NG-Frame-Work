import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

import static org.openqa.selenium.By.id;

public class FrameWorkHomework {

    WebDriver driver;
    @Test (priority = 1)
    void openBrowser() throws InterruptedException {
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        String title = driver.getTitle();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[2]/div[1]/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#termsofservice")).click();
        Actions Terms = new Actions(driver);
        Terms.doubleClick();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Tester");
       driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("TesterLastName");
       driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("tester@gmail.com");
       driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Unify");
       Select drpCounty = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
       drpCounty.selectByVisibleText("United Kingdom");
       driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
       driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("65 Tester Road");
       driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("Le1 5eh");
       driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("076523445682");
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button")).click();
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#shipping-method-buttons-container > button")).click();
       Thread.sleep(500);
        driver.findElement(By.cssSelector("#paymentmethod_1")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")).click();
        Thread.sleep(1000);
        Select drpCardType = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[1]/td[2]/select")));
        drpCardType.selectByVisibleText("Amex");
        driver.findElement(By.id("CardholderName")).sendKeys("Tester Master");
        driver.findElement(By.id("CardNumber")).sendKeys("7865 4562 5624 2655");
        Select drpMonth = new Select(driver.findElement(By.id("ExpireMonth")));
        drpMonth.selectByVisibleText("05");
        Select drpYear = new Select(driver.findElement(By.id("ExpireYear")));
        drpYear.selectByVisibleText("2023");
        driver.findElement(By.id("CardCode")).sendKeys("777");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")).click();
        System.out.println("YOU HAVE COMPLETED YOUR PURCHASE!!");

























    }

}


