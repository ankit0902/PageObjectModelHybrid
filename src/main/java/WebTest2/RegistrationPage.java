package WebTest2;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstName = "ankit";
    private String lastName = "dhanorkar";
    private  static String timestamp = timeStamp();

    public  void  verifyUserOnRegisterPage(){
       assertURL("register");
    }
    public void userEnterRegistrationDetails(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sendText(_firstName,firstName);
        sendText(_lastName,lastName);
        sendText(_email,"ankitdhanorkar+"+timestamp+ "@gmail.com");
        sendText(_password,"patel1234");
        sendText(_confirmPassword,"patel1234");
        clickOnElement(_registerButton);

    }

}
