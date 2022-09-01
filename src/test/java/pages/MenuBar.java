package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuBar {

    WebDriver driver;

    By admin = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");

    public MenuBar(WebDriver driver) {
        this.driver = driver;

    }

    public void Admin() {
        driver.manage().window().maximize();
        driver.findElement(admin).click();
    }
}