package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class TenantsPage {
        private WebDriver driver;

        public TenantsPage(WebDriver driver) {
            this.driver = driver;
        }

        public static String FindTenantsURLStage = projectProperties.getProperty("STAGE_URL") + "landlord/find-tenants";
        public static String FindTenantsURLQA =projectProperties.getProperty("QA_URL") + "landlord/find-tenants";

        public static String Dummy_URL = FoxtonsHooks.HOST + "landlord/find-tenants#";

        public static String ExpectedURL_Find_Tenant_lettings =  FoxtonsHooks.HOST + "landlord/contact/find-tenants/lettings";

        public static String ExpectedURL_Find_Tenant =  FoxtonsHooks.HOST + "landlord/find-tenants";

        public static String ExpectedURL_Find_Tenant_managed_long =  FoxtonsHooks.HOST + "landlord/contact/find-tenants/managed";

        public static String ExpectedURL_Find_Tenant_short = FoxtonsHooks.HOST + "landlord/contact/find-tenants/short-lets";

        public static String ExpectedURL_Property_Management =  FoxtonsHooks.HOST + "landlord/Property-Management";

        public static String ExpectedURL_Short_Let_services_for_Landlord =  FoxtonsHooks.HOST + "landlord/Short-Let-services-for-Landlord";



//    Page element


        public static String My_Foxtons = "//button[text()='My Foxtons']";

        public static String Foxtons_Homepage = "(//*[@title='FoxtonsFilled'])[1]";

        public static String Long_Let_Getting_Started = "(//div[contains(@class,'1d3bbye')]//a)[1]";

        public static String Managed_Long_Let_Getting_Started = "(//div[contains(@class,'1d3bbye')]//a)[3]";

        public static String Managed_Short_Let_Getting_Started = "(//div[contains(@class,'1d3bbye')]//a)[5]";

        public static String Managed_Short_Let = "(//*[text()='Managed Short Let']/..)[1]";

        public static String Managed_Long_Let = "(//*[text()='Managed Long Let']/..)[1]";

        public static String Long_Let = "(//*[text()='Long Let']/..)[1]";

        public static String Long_Let_What_included = "(//div[contains(@class,'1d3bbye')]//a)[2]";

        public static String Managed_Long_Let_What_included = "(//div[contains(@class,'1d3bbye')]//a)[4]";

        public static String Managed_Short_Let_What_included = "(//div[contains(@class,'1d3bbye')]//a)[6]";


//  Page Actions


        public  void clickMy_Foxtons() {

            driver.findElement(By.xpath(My_Foxtons)).click();
        }

        public  void clickFoxtons_Homepage() {

            driver.findElement(By.xpath(Foxtons_Homepage)).click();
        }


        public void clickLong_Let_Getting_Started() {

            driver.findElement(By.xpath(Long_Let_Getting_Started)).click();
        }

        public  void clickManaged_Long_Let_Getting_Started() {

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
