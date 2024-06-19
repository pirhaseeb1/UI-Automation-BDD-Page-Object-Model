package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class StampDutyPage {
    private WebDriver driver;



    public StampDutyPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/stampduty";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/stampduty";
    public static String Input_Price = "//input[contains(@class,'mnn31')]";
    public static String error_message= "//input/following::p[contains(@class,'Mui-error')]";

    public static String First_time_buyer = "(//input[contains(@class,'1m9pwf3')])[1]";
    public static String Property_buy_second_home = "(//input[contains(@class,'1m9pwf3')])[2]";
    public static String Uk_Residents = "(//input[contains(@class,'1m9pwf3')])[3]";
    public static String Calculate = "//button[contains(text(),'Calculate')]";
    public static String stamp_duty = "//span[contains(@class,'6toepe')]";
    public static String Total_rate = "(//span[contains(@class,'1i8stg')])[2]";
    public static String Total_due = "(//span[contains(@class,'1i8stg')])[3]";
    public static String Recalculate = "//button[contains(text(),'Re Calculate')]";


//Functions

    public void Input_price(String price) {

        driver.findElement(By.xpath(Input_Price)).sendKeys(price);
    }

    public void click_First_time_buyer() {
        driver.findElement(By.xpath(First_time_buyer)).click();
    }
    public void click_Property_buy_second_home() {
        driver.findElement(By.xpath(Property_buy_second_home)).click();
    }
    public void click_Uk_Residents() {
        driver.findElement(By.xpath(Uk_Residents)).click();
    }
    public void click_Calculate() {
        driver.findElement(By.xpath(Calculate)).click();
    }
    public void click_Recalculate() {
        driver.findElement(By.xpath(Recalculate)).click();
    }
}
