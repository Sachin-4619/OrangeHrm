package pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;



public class PageFactory {
    WebDriver driver;


    private LoginPage loginpage;
    private MenuBar MenuBar;
    

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginpage() {
        if(loginpage==null){
            loginpage=new LoginPage(driver);
        }
        return loginpage;

    }
    public  MenuBar getMenuBar() {
        if (MenuBar == null) {
            MenuBar = new MenuBar(driver);
        }
        return MenuBar;
    }
    public AddUser getAddUser(){
        AddUser AddUser = null;
        if (AddUser == null) {
            AddUser = new AddUser(driver);
        }
        return AddUser;
        
    }
}
        



