package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import utilities.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Launching browser
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessFully() {

        //loginLink.click();
        clickOnElement(By.linkText("Log in"));

        //This is requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome test element and get the text
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();
        //This is requirement
        Assert.assertEquals("Text matching succesfully:", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        //Type email to email field
        sendTextToElement(By.id("Email"), "Prime2002@gmail.com");

        //Type password to password field
        sendTextToElement(By.name("Password"), "prime2000");

        // loginButton.click();
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Log out";
        //Find the welcome test element and get the text
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.linkText("Log out"));
        String actualMessage = actualTextMessageElement.getText();
        //This is requirement
        Assert.assertEquals("Text matching succesfully:", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in"));

        //Type invalid  email to email field
        sendTextToElement(By.id("Email"), "Apple@apple.com");

        //Type invalid password to password field
        sendTextToElement(By.name("Password"), "123456");
        // loginButton.click();
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //This is requirement
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Find the welcome test element and get the text
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextMessageElement.getText();
        //This is requirement
        Assert.assertEquals("Text matching succesfully:", expectedMessage, actualMessage);

    }

    @After
    public void testDown() {
        //closing browser
        closeBrowser();
    }
}

