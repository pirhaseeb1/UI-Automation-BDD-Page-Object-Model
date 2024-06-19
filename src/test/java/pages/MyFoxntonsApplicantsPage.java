package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class MyFoxntonsApplicantsPage {

    public WebDriver driver;

    public MyFoxntonsApplicantsPage(WebDriver driver) {
        this.driver = driver;
    }

//    User Test Data

    public static String ExpectedURL = FoxtonsHooks.HOST + "myfoxtons/applicants";
    public static String ExpectedHomeURL = projectProperties.getProperty("STAGE_URL");
    public static String ExpectedFoxtonsURL = FoxtonsHooks.HOST + "myfoxtons";
    public static String ExpectedRegistrationURL = FoxtonsHooks.HOST + "auth/registration";


//    Web Elements

    public static String Logo = "(//a[@aria-label='Logo'])[1]";
    public static String MyFoxtonsCTA = "//button[contains(text(), 'My Foxtons')]";
    public static String BuyerRegistration = "//button[contains(text(), 'Register as a buyer')]";
    public static String TenantRegistration = "//button[contains(text(), 'Register as a tenant')]";

//    Page Actions

    public void accessApplicantsPage() {
        String base_url = driver.getCurrentUrl();
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(projectProperties.getProperty("STAGE_URL") + "myfoxtons/applicants");
        }
        else{
            driver.get(projectProperties.getProperty("QA_URL") + "myfoxtons/applicants");
        }
        CommonMethods.clickCookie(driver);
    }

    public void clickLogo(){
        driver.findElement(By.xpath(Logo)).click();
    }

    public void clickMyFoxtonsCTA(){
        driver.findElement(By.xpath(MyFoxtonsCTA)).click();
    }

    public void clickBuyerRegistration(){
        CommonMethods.I_AmWait(driver, BuyerRegistration);
        driver.findElement(By.xpath(BuyerRegistration)).click();
    }

    public void clickTenantRegistration(){
        CommonMethods.I_AmWait(driver, TenantRegistration);
        driver.findElement(By.xpath(TenantRegistration)).click();
    }
}

