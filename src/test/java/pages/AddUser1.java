package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddUser1 {

    WebDriver driver;
    By dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
    By adminbtn = By.xpath(("//*[contains(text(),'Admin')]"));
    By dropdown2 = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
    By status = By.xpath("//*[contains(text(),'Enabled')]");
    By password = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    By employeename = By.xpath("//input[@placeholder='Type for hints...']");
    By username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By confirmpassword = By.xpath("(//input[@type='password'])[2]");
    By submit=By.xpath("//button[@type='submit']");

    String uniqueUserName;

    public AddUser1(WebDriver driver) {
        this.driver = driver;
    }

    public void User() throws InterruptedException {
        String random = String.valueOf((int) (Math.random() * (100 - 50 + 1) + 50));
        uniqueUserName = "Sachin" + random;
        driver.findElement(dropdown).click();
        driver.findElement(adminbtn).click();
        driver.findElement(dropdown2).click();
        driver.findElement(status).click();
        driver.findElement(password).sendKeys("@12345678Aa");
        driver.findElement(employeename).sendKeys("Odis");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'Odis')]")).click();
        driver.findElement(username).sendKeys(uniqueUserName);
        driver.findElement(confirmpassword).sendKeys("@12345678Aa");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(3000);
         driver.findElement(submit).click();
        Thread.sleep(6000);
    }
}

