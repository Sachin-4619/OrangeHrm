package pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;


    private LoginPage loginpage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginpage() {
        if(loginpage==null){
            loginpage=new LoginPage(driver);
        }
        return loginpage;

    }
}
