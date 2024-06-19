package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;



public class BuyToLetMortgagePage {
    private WebDriver driver;


    public BuyToLetMortgagePage(WebDriver driver) {
        this.driver = driver;
    }

    public static String BuyToLetURLStage = projectProperties.getProperty("STAGE_URL")+ "landlord/buy-to-let-mortgages";
    public static String BuyToLetURLQA = projectProperties.getProperty("QA_URL") + "landlord/buy-to-let-mortgages";

    // This is dummy URl as this page is still in dev
    public static String Dummy_URL = FoxtonsHooks.HOST + "landlord/buy-to-let-mortgages#";
    public static String ExpectedURL_Alexander_Hall = "https://www.alexanderhall.co.uk/";

    public static String ExpectedURL_Ah_Buy_To_Let = "https://www.alexanderhall.co.uk/mortgages/buy-to-let/mortgage_best_deals";

    public static String ExpectedURL_Ah_Contact_Form = "https://www.alexanderhall.co.uk/contact?utm_source=foxtons&utm_medium=referral&utm_campaign=landlord_buy_to_let";

    public static String ExpectedURL_Find_Tenant_lettings =  FoxtonsHooks.HOST ;

    public static String ExpectedURL_Find_Tenant =  FoxtonsHooks.HOST + "landlord/find-tenants";

    public static String ExpectedURL_Property_Management =  FoxtonsHooks.HOST + "landlord/Property-Management";

    public static String ExpectedURL_Short_Let_services_for_Landlord =  FoxtonsHooks.HOST + "landlord/Short-Let-services-for-Landlord";



//    Page element

    public static String View_Alexander_Hall = "(//button[text()='Visit Alexander Hall'])[1]";

    public static String View_Alexander_Hall2 = "(//button[text()='Visit Alexander Hall'])[2]";

    public static String My_Foxtons = "//button[text()='My Foxtons']";

    public static String Foxtons_Homepage = "(//*[@title='FoxtonsFilled'])[1]";

    public static String New_Buy_To_Let_Mortgage = "(//*[contains(text(),'Mortgage')]/..//button[text()='View mortgages'])[1]";

    public static String New_Buy_To_Let_Remortgage = "(//*[contains(text(),'Remortgage')]/..//button[text()='View mortgages'])[1]";

    public static String Migrate_From_Residential_Mortgage = "//*[contains(text(),'Mortgage')]/..//button[text()='Contact form']";

    public static String Long_Let_Getting_Started = "(//div[contains(@class,'1d3bbye')]//a)[1]";

    public static String Managed_Long_Let_Getting_Started = "(//div[contains(@class,'1d3bbye')]//a)[3]";

    public static String Managed_Short_Let_Getting_Started = "(//div[contains(@class,'1d3bbye')]//a)[5]";

    public static String Managed_Short_Let = "//*[text()='Managed Short Let']/..";

    public static String Managed_Long_Let = "//*[text()='Managed Long Let']/..";

    public static String Long_Let = "//*[text()='Long Let']/..";

    public static String Long_Let_What_included = "(//div[contains(@class,'1d3bbye')]//a)[2]";

    public static String Managed_Long_Let_What_included = "(//div[contains(@class,'1d3bbye')]//a)[4]";

    public static String Managed_Short_Let_What_included = "(//div[contains(@class,'1d3bbye')]//a)[6]";

    public static String heading_Our_Company = "(//*[text()='Explore Foxtons']//following-sibling::div//*[contains(text(),'Our services')])[1]";



    public static String heading_Landlord_advice = "(//*[text()='Explore Foxtons']//following-sibling::div//*[contains(text(),'Landlord')])[1]";

    public static String heading_Landlord_Tools = "(//*[text()='Explore Foxtons']//following-sibling::div//*[contains(text(),'Landlord tools')])[1]";

    public static String Expected_Our_Company = "Our services";

    public static String Expected_Landlord_advice = "Landlord advice";

    public static String Expected_Landlord_Tools = "Landlord tools";

//  Page Actions

    public void click_Alexander_Hall()  {
        // SellConveyancingPage.clickcookie();
        CommonMethods.I_AmWait(driver, View_Alexander_Hall);
        driver.findElement(By.xpath(View_Alexander_Hall)).click();
    }

    public void click_Alexander_Hall2() {
        CommonMethods.ScrollTo(driver,0,1300);
        driver.findElement(By.xpath(View_Alexander_Hall2)).click();
    }

    public void clickMy_Foxtons() {

        driver.findElement(By.xpath(My_Foxtons)).click();
    }

    public void clickFoxtons_Homepage() {

        driver.findElement(By.xpath(Foxtons_Homepage)).click();
    }

    public void clickNew_Buy_To_Let_Mortagage() {
        // SellConveyancingPage.clickcookie();
        // SellConveyancingPage.clickcookie();
        // CommonMethods.I_AmWait(driver,"//button[text()='Accept all']");
        // driver.findElement(By.xpath(cookies)).click();
        CommonMethods.I_AmWait(driver, New_Buy_To_Let_Mortgage);
        driver.findElement(By.xpath(New_Buy_To_Let_Mortgage)).click();
    }

    public void clickNew_Buy_To_Let_Remortagage() {
        CommonMethods.I_AmWait(driver, New_Buy_To_Let_Remortgage);
        driver.findElement(By.xpath(New_Buy_To_Let_Remortgage)).click();
    }

    public void clickMigrate_From_Residential_Mortgage() {
        CommonMethods.I_AmWait(driver, Migrate_From_Residential_Mortgage);
        driver.findElement(By.xpath(Migrate_From_Residential_Mortgage)).click();
    }

    public void clickLong_Let_Getting_Started() {

        driver.findElement(By.xpath(Long_Let_Getting_Started)).click();
    }

    public void clickManaged_Long_Let_Getting_Started() {

        driver.findElement(By.xpath(Managed_Long_Let_Getting_Started)).click();
    }

    public void clickManaged_Short_Let_Getting_Started() {

        driver.findElement(By.xpath(Managed_Short_Let_Getting_Started)).click();
    }

    public void clickLong_Let_What_included() {

        driver.findElement(By.xpath(Long_Let_What_included)).click();
    }

    public void clickManaged_Long_Let_What_included() {

        driver.findElement(By.xpath(Managed_Long_Let_What_included)).click();
    }

    public void clickManaged_Short_Let_What_included() {

        driver.findElement(By.xpath(Managed_Short_Let_What_included)).click();
    }
}