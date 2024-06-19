package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class LondonNewHomesPage {
    private WebDriver driver;

    public LondonNewHomesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Expected URLS
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/buy_newhomes";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/buy_newhomes";

    public static String Dummy_URL = FoxtonsHooks.HOST + "buy/buy_newhomes#";

    // Page objects Locators
    public static String View_all_new_homes = "//button[contains(text(),'View all New homes')]";

  //  public static String Help_to_Buy_Options = "//button[contains(text(),'Help to Buy options')]";

    public static String Find_a_New_Home = "//button[contains(text(),'Find a New Home')]";

    public static String View_developments = "//button[contains(text(),'View developments')]";

    public static String View_New_Homes = "//button[contains(text(),'View New Homes')]";

    public static String Luxury_New_Homes = "//div[contains(text(),'Affordable New Homes Up')]";

    public static String Mid_range_New_Homes = "//div[contains(text(),'Mid range New Homes')]";

    public static String Affordable_New_Homes = "//div[contains(text(),'Luxury New Homes From')]";


    // Functions

    public void click_View_all_new_homes(){
        driver.findElement(By.xpath(View_all_new_homes)).click();
    }

    public void click_Help_to_Buy_Options(){
     //   driver.findElement(By.xpath(Help_to_Buy_Options)).click();
    }
    public void click_Find_a_New_Home(){
        driver.findElement(By.xpath(Find_a_New_Home)).click();
    }
    public void click_View_developments(){
        driver.findElement(By.xpath(View_developments)).click();
    }
    public void click_View_New_Homes(){
        driver.findElement(By.xpath(View_New_Homes)).click();
    }

    public void click_Luxury_New_Homes(){
        driver.findElement(By.xpath(Luxury_New_Homes)).click();
    }
    public void click_Mid_range_New_Homes(){
        driver.findElement(By.xpath(Mid_range_New_Homes)).click();
    }

    public void click_Affordable_New_Home(){
        driver.findElement(By.xpath(Affordable_New_Homes)).click();
    }
}
