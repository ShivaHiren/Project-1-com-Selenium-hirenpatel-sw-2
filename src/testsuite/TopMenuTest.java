package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import utilities.Utility;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //Launch website
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computer button
        clickOnElement(By.xpath("//a[text()='Computers ']"));
        String expectedMessage = "Computers";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Computers']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on Electronic page
        clickOnElement(By.xpath("//a[text()='Electronics ']"));
        String expectedMessage = "Electronic";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Electronics']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {
        //click on apparel page
        clickOnElement(By.xpath("//a[text()='Apparel ']"));
        String expectedMessage = "Apparel";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Apparel']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        //click on Digital download button
        clickOnElement(By.xpath("//a[text()='Digital downloads']"));
        String expectedMessage = "Digital downloads";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on book button
        clickOnElement(By.xpath("//a[text()='Books ']"));
        String expectedMessage = "Books";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Books']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on jewelery button
        clickOnElement(By.xpath("//a[text()='Jewelry ']"));
        String expectedMessage = "Jewelry";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        //click on gift cards button
        clickOnElement(By.xpath("//a[text()='Gift Cards ']"));
        String expectedMessage = "Gift Cards";
        WebElement actualTextMessageElement = BaseTest.driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        //This is requirement
        String actualMessage = actualTextMessageElement.getText();
    }

    @After
    public void testDown() {
        //Closing browser
        closeBrowser();
    }
}