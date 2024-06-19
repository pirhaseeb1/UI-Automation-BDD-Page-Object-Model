package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class ShortLetsPage {

    private WebDriver driver;

    public ShortLetsPage(WebDriver driver) {
        this.driver = driver;
    }


    //Expected URLS
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "landlord/short-lets";
    public static String ExpectedURLQA =projectProperties.getProperty("QA_URL") + "landlord/short-lets";

    // Dummy URL have to change when page is developed
    public static String Dummy_URL = FoxtonsHooks.HOST + "landlord/short-lets#";
    //Locators
    public static String Find_me_tenants = "//button[contains(text(),'Find me tenants')]";

    public static String Contact_us = "//button[contains(text(),'Contact Us')]";

    public static String Contact_us_under_Lucrative = "//*[contains(text(),'LUCRATIVE')]/following::button[contains(text(),'Contact us')]";

    public static String Get_started_under_Increased_choice = "(//*[contains(text(),'INCREASED')]/following::button[contains(text(),'Get started')])[1]";

    public static String Get_started_under_High_calibre = "(//*[contains(text(),'HIGH')]/following::button[contains(text(),'Get started')])[1]";

    public static String Get_started_under_Short_lets = "//p[contains(text(),'Short Lets')]/..//button[contains(text(),'Get')]";

    public static String Get_started_under_Lettings = "//p[contains(text(),'Lettings')]/..//button[contains(text(),'Get')]";

    //Functions
    public void  click_Find_me_tenants(){
        driver.findElement(By.xpath(Find_me_tenants)).click();
    }
    public void click_Contact_us(){
        driver.findElement(By.xpath(Contact_us)).click();
    }
    public void click_Contact_us_under_Lucrative(){
        driver.findElement(By.xpath(Contact_us_under_Lucrative)).click();
    }
    public void click_Get_started_under_Increased_choice(){
        driver.findElement(By.xpath(Get_started_under_Increased_choice)).click();
    }
    public void  click_Get_started_under_High_calibre(){
        driver.findElement(By.xpath(Get_started_under_High_calibre)).click();
    }
    public void click_Get_started_under_Short_lets(){
        driver.findElement(By.xpath(Get_started_under_Short_lets)).click();
    }
    public void  click_Get_started_under_Lettings(){
        driver.findElement(By.xpath(Get_started_under_Lettings)).click();
    }
}
