package WebTest2;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils {
    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail =  By.xpath("//input[@class='your-email']");
    private By _textBox = By.xpath("//*[@id='PersonalMessage']");
    private By _sendEmail = By.name("send-email");

    private String friendEmail = "sanjayshah@yahoo.co.uk";
    private String yourEmail = "ap_dhanorkar@yahoo.co.uk";
    private String message = "This is best product";
    String expected = "Your message has been sent.";
    private By _emailSuccessMessage = By.xpath("//div[@class='result']");


    public void verifyUserOnEmailAFriendPage(){
        assertURL("productemailafriend");
    }
    public  void emailAFriendDetails(){
        enterText(_friendEmail,friendEmail);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        enterText(_yourEmail,yourEmail);
        enterText(_textBox,message);
        clickOnElement(_sendEmail);
    }
    public  void verifyUserSeeSuccessMessageOfEmailAFriend(){
        assertTextMessage("Your message has not been sent",expected,_emailSuccessMessage);
    }

}
