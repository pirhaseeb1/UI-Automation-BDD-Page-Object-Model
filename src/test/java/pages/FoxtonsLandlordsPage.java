package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class FoxtonsLandlordsPage {
    private WebDriver driver;

    public FoxtonsLandlordsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "myfoxtons/landlord";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "myfoxtons/landlord";

    public static String ExpectedURL_fullfeatureList = FoxtonsHooks.HOST + "myfoxtons/landlord#fullFeatureList";

    public static String ExpectedURL_create_account = FoxtonsHooks.HOST + "auth/registration";

    public static String view_all_features = "//button[contains(text(),'View all features')]";
    public static String signup_my_foxtons = "//button[contains(text(),'Sign up for My')]";

    public static String signup_my_foxtons_instant_rental = "//a[contains(text(),'Sign up for')]";

    public static String signInOrRegister = "//button[contains(text(),'Sign in or Register')]";

    public static String signUp_Now = "//button[contains(text(),'Sign up now')]";


    public void click_view_all_features() {

        driver.findElement(By.xpath(view_all_features)).click();
    }

    public void click_signup_my_foxtons() {

        driver.findElement(By.xpath(signup_my_foxtons)).click();
    }
    public void click_signup_my_foxtons_instant_rental() {

        driver.findElement(By.xpath(signup_my_foxtons_instant_rental)).click();
    }

    public void click_signInOrRegister() {

        driver.findElement(By.xpath(signInOrRegister)).click();
    }
    public void click_signUp_Now() {

        driver.findElement(By.xpath(signUp_Now)).click();
    }
}
