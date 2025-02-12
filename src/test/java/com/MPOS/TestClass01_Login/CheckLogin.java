package com.MPOS.TestClass01_Login;

import org.testng.annotations.Test;
import com.MPOS.Pages.base.BaseClass;

public class CheckLogin extends BaseClass {

    @Test
    public void checkLogin() throws InterruptedException {
    	LoginPageLocators.CheckLoginPage CLP = new LoginPageLocators.CheckLoginPage(driver);
        
        // **Scenario 1: Wrong Username, Right Password**
        String username1 = "Admin";
        String password1 = "go2meeting";
        CLP.enterUsername(username1);
        CLP.enterPassword(password1);
        CLP.Login();
        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Scenario 1: Username: " + username1 + ", Password: " + password1 + " -> Login Successful");
        } else {
            System.out.println("Scenario 1: Username: " + username1 + ", Password: " + password1 + " -> Login Failed");
        }

        // **Scenario 2: Right Username, Wrong Password**
        driver.navigate().refresh();
        String username2 = "Admin";
        String password2 = "WrongPassword";
        CLP.enterUsername(username2);
        CLP.enterPassword(password2);
        CLP.Login();
        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Scenario 2: Username: " + username2 + ", Password: " + password2 + " -> Login Successful");
        } else {
            System.out.println("Scenario 2: Username: " + username2 + ", Password: " + password2 + " -> Login Failed");
        }

        // **Scenario 3: Right Username, Right Password**
        driver.navigate().refresh();
        String username3 = "support";
        String password3 = "go2meeting";
        CLP.enterUsername(username3);
        CLP.enterPassword(password3);
        CLP.Login();
        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Scenario 3: Username: " + username3 + ", Password: " + password3 + " -> Login Successful");
        } else {
            System.out.println("Scenario 3: Username: " + username3 + ", Password: " + password3 + " -> Login Failed");
        }
    }
}
