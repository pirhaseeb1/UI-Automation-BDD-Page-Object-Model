package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;

public class MyFoxtonsPage {

    private WebDriver driver;

    public MyFoxtonsPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String ExpectedURL_SignIn = FoxtonsHooks.HOST + "auth/login";
    public static String ExpectedURL_Register = FoxtonsHooks.HOST + "auth/registration";

    public static String ExecptedURL_Landlord = FoxtonsHooks.HOST + "myfoxtons/landlord";

    public static String ExecptedURL_Seller = FoxtonsHooks.HOST + "myfoxtons/sellers";
    public static String ExpectedURL_Rental = FoxtonsHooks.HOST + "myfoxtons/tenant";
    public static String ExpectedURL_Buyer = FoxtonsHooks.HOST + "myfoxtons/buyer";


//    Page element

    public static String SignIn_CTA = "//*[text() = 'Sign in']";
    public static String Register_CTA = "//*[text() = 'Register']";
    public static String LandLord_Card = "//p[contains(text(), 'Let')]";
    public static String Seller_Card = "//p[contains(text(), 'sell')]";
    public static String Rental_Card = "//p[contains(text(), 'rental')]";
    public static String Buyer_Card = "//p[contains(text(), 'buy')]";



//  Page Actions

    public void clickSignIn() {

        driver.findElement(By.xpath(SignIn_CTA)).click();
    }

    public void clickRegister() {

        driver.findElement(By.xpath(Register_CTA)).click();
    }

    public void clickLandLordCard() {

        driver.findElement(By.xpath(LandLord_Card)).click();
    }

    public void clickSellerCard() {

        driver.findElement(By.xpath(Seller_Card)).click();
    }

    public void clickRentalCard() {

        driver.findElement(By.xpath(Rental_Card)).click();
    }

    public void clickBuyerCard() {

        driver.findElement(By.xpath(Buyer_Card)).click();
    }
}