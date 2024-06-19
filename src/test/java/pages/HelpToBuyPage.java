package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.util.List;

public class HelpToBuyPage {
    private WebDriver driver;

    public HelpToBuyPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/helptobuy";

    //Dummy Url.This page is not yet developed
    public static String DummyURL = FoxtonsHooks.HOST + "buy/helptobuy#";

    //locators

    public static String View_Help_to_Buy_homes = "//button[contains(text(),'View Help to Buy homes')]";

    public static String Help_to_Buy_London = "//button[text()='Help to Buy London']";

    public static String Help_to_Buy_properties = "//button[contains(text(),'Help to Buy properties')]";

    public static String Contact_us = "//button[contains(text(),'Contact us')]";

    public static String Help_to_Buy_South_East = "//a[contains(text(),'Help to Buy South East')]";

    public static String Help_to_Buy_FAQs = "//a[contains(text(),'Help to Buy FAQs')]";

    public static String Learn_more = "(//a[contains(text(),'Learn more')])[1]";

    public static String Learn_more_2 = "(//a[contains(text(),'Learn more')])[2]";


    //Functions

    public void click_View_Help_to_Buy_homes(){
        driver.findElement(By.xpath(View_Help_to_Buy_homes)).click();
    }
    public void click_Help_to_Buy_London(){
        driver.findElement(By.xpath(Help_to_Buy_London)).click();
    }
    public void click_Help_to_Buy_properties (){
        driver.findElement(By.xpath(Help_to_Buy_properties )).click();
    }

    public void click_Contact_us (){
        List<WebElement> contactUs = driver.findElements(By.xpath(Contact_us));
        contactUs.get(1).click();
    }
    public void click_Help_to_Buy_South_East (){
        driver.findElement(By.xpath(Help_to_Buy_South_East)).click();
    }
    public void click_Help_to_Buy_FAQs (){
        driver.findElement(By.xpath(Help_to_Buy_FAQs)).click();
    }
    public void click_Learn_more (){
        driver.findElement(By.xpath(Learn_more)).click();
    }
    public void click_Learn_more_2 (){
        driver.findElement(By.xpath(Learn_more_2)).click();
    }

}
