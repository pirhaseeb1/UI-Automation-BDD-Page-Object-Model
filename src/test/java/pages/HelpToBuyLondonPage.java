package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class HelpToBuyLondonPage {
    private WebDriver driver;

    public HelpToBuyLondonPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/helptobuy/equity-loan";

    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/helptobuy/equity-loan";
    //Dummy URL have to change
    public static String Dummy_URL = FoxtonsHooks.HOST + "buy/helptobuy/equity-loan#";
    // page object locators

    public static String Help_Buy_Properties = "(//button[contains(text(),'Help to Buy properties')])[1]";

    public static String Foxtons_FAQ_sheet_Help_Buy_scheme = "//button[contains(text(),'Foxtons FAQ ')]";

    public static String Help_Buy_Properties_alongSide_contact_us = "(//button[contains(text(),'Help to Buy properties')])[2]";

    public static String Contact_us = "(//button[contains(text(),'Contact us')])[2]";

    public static String Who_is_Help_to_Buy_London = "(//div[contains(@class,'1fx8m19')])[1]";

    public static String Find_a_Help_to_Buy_Property = "(//button[contains(text(),'Find a Help to Buy Property')])[1]";

    public static String How_does_Help_to_Buy_London_work = "(//div[contains(@class,'1fx8m19')])[2]";

    public static String Find_a_Help_to_Buy_Property_under_Buy_London_work = "(//button[contains(text(),'Find a Help to Buy Property')])[2]";

    public static String What_properties_can_I_buy_with_Help_to_Buy_London = "(//div[contains(@class,'1fx8m19')])[3]";

    public static String Find_a_Help_to_Buy_Property_under_What_properties_can_I_buy = "(//button[contains(text(),'Find a Help to Buy Property')])[3]";

    public static String What_about_outside_of_London = "(//div[contains(@class,'1fx8m19')])[4]";

    public static String Find_a_Help_to_Buy_Property_under_What_about_outside_of_London = "(//button[contains(text(),'Find a Help to Buy Property')])[4]";

    public static String Pay_back_Help_to_Buy_London_equity_loan = "(//div[contains(@class,'1fx8m19')])[5]";

    public static String Find_a_Help_to_Buy_Property_under_Buy_London_equity_loan = "(//button[contains(text(),'Find a Help to Buy Property')])[5]";

    public static String Help_to_Buy_equity_loan = "(//div[contains(@class,'10p185u')])[1]";

    public static String Find_a_Help_to_Buy_agent = "(//div[contains(@class,'10p185u')])[2]";


    //Functions

    public void click_Help_Buy_Properties(){
        driver.findElement(By.xpath(Help_Buy_Properties)).click();
    }



    public void click_Foxtons_FAQ_sheet_Help_Buy_scheme(){
        driver.findElement(By.xpath(Foxtons_FAQ_sheet_Help_Buy_scheme)).click();
    }


    public void  click_Help_Buy_Properties_alongSide_contact_us(){
        driver.findElement(By.xpath(Help_Buy_Properties_alongSide_contact_us)).click();
    }

    public void click_Contact_us(){
        driver.findElement(By.xpath(Contact_us)).click();

    }
    public void click_Who_is_Help_to_Buy_London(){
        driver.findElement(By.xpath(Who_is_Help_to_Buy_London)).click();

    }
    public void click_Find_a_Help_to_Buy_Property(){
        driver.findElement(By.xpath(Find_a_Help_to_Buy_Property)).click();

    }

    public void  click_How_does_Help_to_Buy_London_work(){
        driver.findElement(By.xpath(How_does_Help_to_Buy_London_work)).click();

    }
    public void click_Find_a_Help_to_Buy_Property_under_Buy_London_work(){
        driver.findElement(By.xpath(Find_a_Help_to_Buy_Property_under_Buy_London_work)).click();

    }

    public void click_What_properties_can_I_buy_with_Help_to_Buy_London(){
        driver.findElement(By.xpath(What_properties_can_I_buy_with_Help_to_Buy_London)).click();

    }
    public void click_Find_a_Help_to_Buy_Property_under_What_properties_can_I_buy(){
        driver.findElement(By.xpath(Find_a_Help_to_Buy_Property_under_What_properties_can_I_buy)).click();

    }


    public void  click_What_about_outside_of_London(){
        driver.findElement(By.xpath(What_about_outside_of_London)).click();

    }
    public void   click_Find_a_Help_to_Buy_Property_under_What_about_outside_of_London(){
        driver.findElement(By.xpath(Find_a_Help_to_Buy_Property_under_What_about_outside_of_London)).click();

    }

    public void   click_Pay_back_Help_to_Buy_London_equity_loan(){
        driver.findElement(By.xpath(Pay_back_Help_to_Buy_London_equity_loan)).click();

    }
    public void  click_Find_a_Help_to_Buy_Property_under_Buy_London_equity_loan(){
        driver.findElement(By.xpath(Find_a_Help_to_Buy_Property_under_Buy_London_equity_loan)).click();

    }

    public void  click_Help_to_Buy_equity_loan(){
        driver.findElement(By.xpath(Help_to_Buy_equity_loan)).click();

    }
    public void  click_Find_a_Help_to_Buy_agent(){
        driver.findElement(By.xpath(Find_a_Help_to_Buy_agent)).click();

    }


}
