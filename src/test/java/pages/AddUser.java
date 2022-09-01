package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUser {
    WebDriver driver;
    By Add= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public AddUser(WebDriver driver){
        this.driver=driver;
    }
    public void Click(){
        driver.manage().window().maximize();
        driver.findElement(Add).click();
    }

}
