package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageFactory;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory Pagefactory;

    public static void setup(){
        driver=new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Pagefactory=new PageFactory(driver);

    }

    public void close() {
        driver.close();
    }


}
