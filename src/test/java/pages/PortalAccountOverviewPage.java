package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

import static pages.PortalValuationPage.*;

public class PortalAccountOverviewPage {

    private WebDriver driver;

    public PortalAccountOverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "account/overview";
    public static String ExpectedURLQA =projectProperties.getProperty("QA_URL") + "account/overview";
    //Dummy URL have to change
    public static String Dummy_URL = FoxtonsHooks.HOST + "account/overview#";
    // page object locators
    public static String Expected_alerts_url = FoxtonsHooks.HOST + "account/overview";
    public static String Expected_profile_url= FoxtonsHooks.HOST + "account/overview";
    public static String Get_started_Now_Let = "(//button[contains(text(),'Get Started Now!')])[1]";

    public static String Get_started_Now_Sell = "(//button[contains(text(),'Get Started Now!')])[2]";

    public static String Get_started_Now_Rent = "(//button[contains(text(),'Get Started Now!')])[3]";

    public static String Get_started_Now_Buy = "(//button[contains(text(),'Get Started Now!')])[4]";

    public static String Start_Your_Journey_Letting = "(//button[contains(text(),'Start your journey')])[1]";

    public static String Start_Your_Journey_Renting = "(//button[contains(text(),'Start your journey')])[2]";

    public static String Start_Your_Journey_Selling = "(//button[contains(text(),'Start your journey')])[3]";

    public static String Start_Your_Journey_Buying = "(//button[contains(text(),'Start your journey')])[4]";

    public static String Learn_More_Letting = "(//button[contains(text(),'Learn More')])[1]";

    public static String Learn_More_Renting = "(//button[contains(text(),'Learn More')])[2]";

    public static String Learn_More_Selling = "(//button[contains(text(),'Learn More')])[3]";

    public static String Learn_More_Buying = "(//button[contains(text(),'Learn More')])[4]";

    public static String Learn_More_Want_Expert_Mortage = "//p[contains(text(),'Learn More')]";

    public static String Profile = "//p[contains(text(),'Profile')]";

    public static String Change_Password = "//button[contains(text(),'Change password')]";
    public static String update_Password = "//h4[text()='Update your Password']";
    public static String Alerts = "//p[text()='Alerts']";

    public static String Contacts = "//p[contains(text(),'Contact')]/..//button";
    public static String Contactdetails = "//div[contains(text(),'Roberto Freddi')]";

    public static String Search_Property = "//input[contains(@class,'1uvydh2')]";

    public static String search_button = "//button[contains(@class,'css-sb3n4h')]";

    public static String Searched = "(//input[@placeholder='Search property']/following::p)[2]";

    public static String Filtered_Properties = "//*[@title='Filter']";

    public static String click_Right_to_tent = "//input[contains(@name,'Right to Rent check for Tenant')]";

    public static String click_apply = "//button[contains(text(),'Apply')]";
    public static String Filteredproperty = "//p[contains(text(),'2a High Street South London E6 6ES')]";

    public static String All_Properties = "//p[contains(text(),'ALL')]";

    public static String Allproperties = "(//p[contains(text(),'RENT')])[2]";
    public static String Rent_Properties = "//p[contains(text(),'RENT')]";

    public static String Rentproperties = "//p[contains(text(),'13 Ellesmere Court Ellesmere Road London W4 4QJ')]";

    public static String Let_Properties = "//*[contains(text(),'LET')]";
    public static String Letproperties = "//p[contains(text(),'2a High Street South London E6 6ES')]";

    public static String Sell_Properties = "//p[contains(text(),'SELL')]";
    public static String Sellproperties = "//p[contains(text(),'1 Adelaide Court 75 Boston Road London W7 3SA')]";

    public static String Support = "//button[contains(@aria-label,'support')]";

    public static String Lettings_Terms = "//input[contains(@name,'Lettings Terms & Conditions')]";
    public static String Rent_Guarantee_Terms = "//input[contains(@name,'Rent Guarantee Terms & Conditions')]";
    public static String Preparation_for_Tenancy = "//input[contains(@name,'Preparation for Tenancy')]";
    public static String Property_Licence_Query = "//input[contains(@name,'Property Licence Query')]";
    public static String Instruction_to_Exchange = "//input[contains(@name,'Instruction to Exchange')]";
    public static String Tenancy_Agreement_signed_by_landlord= "//input[contains(@name,'Tenancy Agreement signed by Landlord')]";
    public static String Landlord_Commission_Explanation = "//input[contains(@name,'Landlord Commission Explanation')]";
    public static String Application_for_Tenancy = "//input[contains(@name,'Application for Tenancy')]";
    public static String External_Reference_Report = "//input[contains(@name,'External Reference Report')]";
    public static String Tenant_Non_Viewing_Letters = "//input[contains(@name,'Tenant Non Viewing Letters')]";
    public static String Tenancy_Agreement_signed_by_tenant = "//input[contains(@name,'Tenancy Agreement signed by Tenant')]";
    public static String Standing_Order = "//input[contains(@name,'Standing Order')]";
    public static String Compliance_Doc = "//p[contains(text(),'Compliance Doc')]";
    public static String Energy_Performance_Certificate = "//input[contains(@name,'Energy Performance Certificate')]";
    public static String Gas_Safety_Certificate = "//input[contains(@name,'Gas Safety Certificate')]";
    public static String Electrical_Installation_Condition = "//input[contains(@name,'Electrical Installation Condition Report')]";
    public static String Portable_Appliance_Test = "//input[contains(@name,'Portable Appliance Test')]";
    public static String Fire_Risk_Assessment = "//input[contains(@name,'Fire Risk Assessment')]";
    public static String Legionnaires_Risk_Assement = "//input[contains(@name,'Legionnaires Risk Assement')]";
    public static String Property_Licence_Application = "//input[contains(@name,'Property Licence Application')]";
    public static String Property_Licence_Granted = "//input[contains(@name,'Property Licence Granted')]";
    public static String AML_documents = "//input[contains(@name,'AML documents (POI & POA)')]";
    public static String Tenant_Visa = "//input[contains(@name,'Tenant Visa')]";
    public static String Inventory_Check_in = "//input[contains(@name,'Inventory Check-in')]";
    public static String Inventory_Checkout = "//input[contains(@name,'Inventory Checkout')]";
    public static String How_to_Rent_Guide = "//input[contains(@name,'How to Rent Guide')]";
    public static String Deposit_Protection_Certificate  = "//input[contains(@name,'Deposit Protection Certificate (ASTs only)')]";
    /*public static String propertyalerts = "//div[text()='Property alerts from Foxtons offices']/../..//input";
    public static String openhouse = "//div[text()='Open House event alerts']/../..//input";
    public static String Foxtonsmonthly = "//div[text()='Foxtons monthly newsletter']/../..//input";
    public static String newhomesInvestment = "//div[text()='New Homes & Investment updates']/../..//input";
    public static String FoxtonsFeedback = "//div[text()='Foxtons feedback requests']/../..//input";
    public static String Landlordtransaction = "//div[text()='Landlord transaction alerts']/../..//input";
    public static String Issuealerts = "//div[text()='Issues alerts']/../..//input";
    public static String Marketing = "//div[text()='Marketing']/../..//input";
    public static String ValuationEnquiry = "//div[text()='Valuation Enquiry Soft Opt-In']/../..//input";
    public static String selectall = "(//span[text()='Select all ']/../..//input)[1]";*/
    //Functions

    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }

    public void click_Get_started_Now_Sell(){
        driver.findElement(By.xpath(Get_started_Now_Sell)).click();
    }

    public void click_Get_started_Now_Rent(){
        driver.findElement(By.xpath(Get_started_Now_Rent)).click();
    }

    public void click_Get_started_Now_Buy(){
        driver.findElement(By.xpath(Get_started_Now_Buy)).click();
    }

    public void click_Start_Your_Journey_Letting(){
        driver.findElement(By.xpath(Start_Your_Journey_Letting)).click();
    }

    public void click_Start_Your_Journey_Renting(){
        driver.findElement(By.xpath(Start_Your_Journey_Renting)).click();
    }

    public void click_Start_Your_Journey_Selling(){
        driver.findElement(By.xpath(Start_Your_Journey_Selling)).click();
    }

    public void click_Start_Your_Journey_Buying(){
        driver.findElement(By.xpath(Start_Your_Journey_Buying)).click();
    }

    public void click_Learn_More_Letting(){
        driver.findElement(By.xpath(Learn_More_Letting)).click();
    }

    public void click_Learn_More_Renting(){
        driver.findElement(By.xpath(Learn_More_Renting)).click();
    }

    public void click_Learn_More_Selling(){
        driver.findElement(By.xpath(Learn_More_Selling)).click();
    }

    public void click_Learn_More_Buying(){
        driver.findElement(By.xpath(Learn_More_Buying)).click();
    }

    public void click_Learn_More_Want_Expert_Mortage(){
        driver.findElement(By.xpath(Learn_More_Want_Expert_Mortage)).click();
    }

    public void click_Profile(){
        driver.findElement(By.xpath(Profile)).click();
    }

    public void click_Change_Password(){
        driver.findElement(By.xpath(Change_Password)).click();
    }


    public void click_Alerts(){
        driver.findElement(By.xpath(Alerts)).click();
    }

    public void click_Contacts(){
        driver.findElement(By.xpath(Contacts)).click();
    }

    public void Search_Property(){
        driver.findElement(By.xpath(Search_Property)).click();
    }

    public void send_property(String enter_property) {

        driver.findElement(By.xpath(Search_Property)).sendKeys(enter_property);
    }
    public void Search_button(){
        driver.findElement(By.xpath(search_button)).click();
    }

    public void Filtered_Properties(){
        driver.findElement(By.xpath(Filtered_Properties)).click();
    }

    public void click_Right_to_tent(){
        driver.findElement(By.xpath(click_Right_to_tent)).click();
    }

    public void click_apply(){
        driver.findElement(By.xpath(click_apply)).click();
    }


    public void All_Properties(){
        driver.findElement(By.xpath(All_Properties)).click();
    }

    public void Rent_Properties(){
        driver.findElement(By.xpath(Rent_Properties)).click();
    }

    public void Let_Properties(){
        driver.findElement(By.xpath(Let_Properties)).click();
    }

    public void Sell_Properties(){
        driver.findElement(By.xpath(Sell_Properties)).click();
    }

    public void send_username(String username1) {

        driver.findElement(By.xpath(username)).sendKeys(username1);
    }

    public void send_pass(String Two_string) {

        driver.findElement(By.xpath(password)).sendKeys(Two_string);
    }

    public void click_signin() {
        driver.findElement(By.xpath(sign_in)).click();
    }

    public void click_support() {
        driver.findElement(By.xpath(Support)).click();
    }


    public void click_Lettings_Terms(){
        driver.findElement(By.xpath(Lettings_Terms)).click();
    }
    public void click_Rent_Guarantee_Terms(){
        driver.findElement(By.xpath(Rent_Guarantee_Terms)).click();
    }
    public void click_Preparation_for_Tenancy(){
        driver.findElement(By.xpath(Preparation_for_Tenancy)).click();
    }
    public void click_Property_Licence_Query(){
        driver.findElement(By.xpath(Property_Licence_Query)).click();
    }
    public void click_Instruction_to_Exchange(){
        driver.findElement(By.xpath(Instruction_to_Exchange)).click();
    }
    public void click_Tenancy_Agreement_signed_by_landlord(){
        driver.findElement(By.xpath(Tenancy_Agreement_signed_by_landlord)).click();
    }
    public void click_Landlord_Commission_Explanation(){
        driver.findElement(By.xpath(Landlord_Commission_Explanation)).click();
    }
    public void click_Application_for_Tenancy(){
        driver.findElement(By.xpath(Application_for_Tenancy)).click();
    }
    public void click_External_Reference_Report(){
        driver.findElement(By.xpath(External_Reference_Report)).click();
    }
    public void click_Tenant_Non_Viewing_Letters(){
        driver.findElement(By.xpath(Tenant_Non_Viewing_Letters)).click();
    }
    public void click_Tenancy_Agreement_signed_by_tenant(){
        driver.findElement(By.xpath(Tenancy_Agreement_signed_by_tenant)).click();
    }
    public void click_Standing_Order(){
        driver.findElement(By.xpath(Standing_Order)).click();
    }
    public void click_Compliance_Doc(){
        driver.findElement(By.xpath(Compliance_Doc)).click();
    }

    public void click_Energy_Performance_Certificate(){
        driver.findElement(By.xpath(Energy_Performance_Certificate)).click();
    }
    public void click_Gas_Safety_Certificate(){
        driver.findElement(By.xpath(Gas_Safety_Certificate)).click();
    }
    public void click_Electrical_Installation_Condition(){
        driver.findElement(By.xpath(Electrical_Installation_Condition)).click();
    }
    public void click_Portable_Appliance_Test(){
        driver.findElement(By.xpath(Portable_Appliance_Test)).click();
    }
    public void click_Fire_Risk_Assessment(){
        driver.findElement(By.xpath(Fire_Risk_Assessment)).click();
    }
    public void click_Legionnaires_Risk_Assement(){
        driver.findElement(By.xpath(Legionnaires_Risk_Assement)).click();
    }
    public void click_Property_Licence_Application(){
        driver.findElement(By.xpath(Property_Licence_Application)).click();
    }
    public void click_Property_Licence_Granted(){
        driver.findElement(By.xpath(Property_Licence_Granted)).click();
    }
    public void click_AML_documents(){
        driver.findElement(By.xpath(AML_documents)).click();
    }
    public void click_Tenant_Visa(){
        driver.findElement(By.xpath(Tenant_Visa)).click();
    }
    public void click_Inventory_Check_in(){
        driver.findElement(By.xpath(Inventory_Check_in)).click();
    }
    public void click_Inventory_Checkout(){
        driver.findElement(By.xpath(Inventory_Checkout)).click();
    }
    public void click_How_to_Rent_Guide(){
        driver.findElement(By.xpath(How_to_Rent_Guide)).click();
    }
    public void click_Deposit_Protection_Certificate(){
        driver.findElement(By.xpath(Deposit_Protection_Certificate)).click();
    }

    /*public void click_propertyalerts(){
        driver.findElement(By.xpath(propertyalerts)).click();
    }
    public void click_openhouse(){
        driver.findElement(By.xpath(openhouse)).click();
    }
    public void click_Foxtonsmonthly(){
        driver.findElement(By.xpath(Foxtonsmonthly)).click();
    }
    public void click_newhomesInvestment(){
        driver.findElement(By.xpath(newhomesInvestment)).click();
    }
    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }
    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }
    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }
    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }
    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }
    public void click_Get_started_Now_Let(){
        driver.findElement(By.xpath(Get_started_Now_Let)).click();
    }*/


}
