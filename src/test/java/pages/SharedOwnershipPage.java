package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class SharedOwnershipPage {

    private WebDriver driver;

    public SharedOwnershipPage(WebDriver driver) {
        this.driver = driver;
    }

    //Expected URLS
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy/shared-ownership";

    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/helptobuy/shared-ownership";
    //DummyUrl
    public static String DummyURL = FoxtonsHooks.HOST + "buy/helptobuy/shared-ownership#";

    //Locators

    public static String Shared_Ownership_properties = "//button[contains(text(),'Shared Ownership')]";

    public static String Shared_Contact_us = "//button[contains(text(),'Shared Ownership')]/following::button[contains(text(),'Contact us')]";

    public static String Help_Buy_Eq_Learn_more= "//*[contains(text(),'Buy equity')]/..//p[text()='Learn more']";

    public static String Find_Buy_Agent_Learn_more = "//*[contains(text(),'Buy agent')]/..//p[text()='Learn more']";

    // Functions

    public void click_Shared_Ownership_properties(){
        driver.findElement(By.xpath(Shared_Ownership_properties)).click();
    }
    public void click_Contact_us(){
        driver.findElement(By.xpath(Shared_Contact_us)).click();
    }
    public void click_Help_Buy_Eq_Learn_more(){
        driver.findElement(By.xpath(Help_Buy_Eq_Learn_more)).click();
    }
    public void click_Find_Buy_Agent_Learn_more(){
        driver.findElement(By.xpath(Find_Buy_Agent_Learn_more)).click();
    }

}
