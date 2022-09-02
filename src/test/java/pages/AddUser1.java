package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
    public class AddUser1 {

        WebDriver driver;
       By dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
      By adminbtn = By.xpath(("//*[contains(text(),'Admin')]"));
       By dropdown2 = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
       By status = By.xpath("//*[contains(text(),'Enabled')]");
        By password = By.className("oxd-input oxd-input--active");
      public AddUser1(WebDriver driver)
        {
            this.driver = driver;
        }
        public void User()
        {
            driver.findElement(dropdown).click();
            driver.findElement(adminbtn).click();
//            driver.findElement(dropdown2).click();
//            driver.findElement(status).click();
//            driver.findElement(password).sendKeys("Sachin");
        }
    }

