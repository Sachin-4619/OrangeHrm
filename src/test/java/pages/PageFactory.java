package pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;



public class PageFactory {
    WebDriver driver;


    private LoginPage loginpage;
    private MenuBar menuBar;
    private AddUser addUser;
    private AddUser1 addUser1;


    

    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage getLoginpage() {
        if(loginpage==null){
            loginpage=new LoginPage(driver);
        }
        return loginpage;

    }
    public  MenuBar getMenuBar() {
        if (menuBar == null) {
            menuBar = new MenuBar(driver);
        }
        return menuBar;
    }
    public AddUser getAddUser(){
        if (addUser == null) {
            addUser = new AddUser(driver);
        }
        return addUser;
        
    }
    public AddUser1 getAddUser1(){
        if (addUser1 == null) {
            addUser1 = new AddUser1(driver);
        }
        return addUser1;

    }
}
        



