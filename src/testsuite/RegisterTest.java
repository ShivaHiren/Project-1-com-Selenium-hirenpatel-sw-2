package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        //click on register button
        clickOnElement(By.linkText("Register"));
        String expectedMessage = "Register";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals("Text matching succesfully:", expectedMessage, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //click on register button
        clickOnElement(By.linkText("Register"));
        //Select gender
        clickOnElement(By.id("gender-male"));
        //Enter first name
        sendTextToElement(By.name("FirstName"), "Hiren");
        //Enter second name
        sendTextToElement(By.name("LastName"), "Patel");

        //Select day, month and year:
        sendTextToElement(By.name("DateOfBirthDay"), "1");
        sendTextToElement(By.name("DateOfBirthMonth"), "January");
        sendTextToElement(By.name("DateOfBirthYear"), "2000");

        //Enter email address
        sendTextToElement(By.name("Email"), "Prime2003@gmail.com");

        //Enter password
        sendTextToElement(By.name("Password"), "prime2000");

        //Enter confirm password
        sendTextToElement(By.name("ConfirmPassword"), "prime2000");

        //Click on register button
        clickOnElement(By.id("register-button"));

        String expectedMessage = "Your registration completed";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//div[@class='result']"));
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