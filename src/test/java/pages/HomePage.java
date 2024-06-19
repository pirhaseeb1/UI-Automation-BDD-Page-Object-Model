package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import utilities.LoadTestProperties;
import utilities.PropertyKeys;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public static String ExpectedURL = FoxtonsHooks.HOST;
    public static String ExpectedURL_CTA = FoxtonsHooks.HOST + "myfoxtons";
    public static String ExpectedURL_Landlord = FoxtonsHooks.HOST + "landlord";
    public static String ExpectedURL_RentProperty = FoxtonsHooks.HOST + "tenant";

    public static String ExpectedURL_BuyProperty = FoxtonsHooks.HOST + "buyer";

    public static String ExpectedURL_SellProperty = FoxtonsHooks.HOST + "seller";

    //    Page Elements
    public static String Logo = "(//*[@title='FoxtonsFilled'])[1]";

    public static String CTA = "//button[contains(text(),'My Foxtons')]";
    public static String Let_Property_CTA = "//*[text() = 'WANT TO LET YOUR PROPERTY HASSLE FREE?']";
    public static String Rent_Property_CTA = "//*[contains(text(),'THE RIGHT PROPERTY TO RENT?')]";

    public static String Buy_Property_CTA = "//h3[contains(text(),'WANT TO GET AHEAD OF OTHERS?')]";

    public static String Learn_More_CTA = "//a[contains(text(),'Learn more')]";

    public static String Sell_Property_CTA  = "//h3[contains(text(),'NEED TO KNOW WHAT')]";

    //    Page Actions


    public void clickLogo() {
        // Accept the cookies first by clicking on Accept all button
      //  driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        driver.findElement(By.xpath(Logo)).click();
    }

    public void clickCTA() {
        // Accept the cookies first by clicking on Accept all button
     //   driver.findElement(By.xpath("//button[text()='Accept all']")).click();

        driver.findElement(By.xpath(CTA)).click();

        // This text should be displayed on the next page
        // This case is failing because when MyFoxtons button is clicked the next page is not displayed
        driver.findElement(By.id("when-you-need-experts")).isDisplayed();
    }

    public void clickLetProperty(){
        // Accept the cookies first by clicking on Accept all button
      //  driver.findElement(By.xpath("//button[text()='Accept all']")).click();

        driver.findElement(By.xpath(Let_Property_CTA)).click();
    }

    public void clickRentProperty() {
        // Accept the cookies first by clicking on Accept all button
      //  driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        driver.findElement(By.xpath(Rent_Property_CTA)).click();
    }

    public void clickBuyProperty(){
     //   driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        driver.findElement(By.xpath(Buy_Property_CTA)).click();
    }

    public void clickSellProperty(){
      //  driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        driver.findElement(By.xpath(Sell_Property_CTA)).click();
    }

    public void clickLearnMore(){driver.findElement(By.xpath(Learn_More_CTA)).click();}
}