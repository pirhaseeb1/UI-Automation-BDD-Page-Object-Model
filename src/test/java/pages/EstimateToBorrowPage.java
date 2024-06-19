package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class EstimateToBorrowPage {
    private WebDriver driver;

    public EstimateToBorrowPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/mortgages/how-much-can-i-borrow";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/mortgages/how-much-can-i-borrow";
    //dummy_url.This page is not yet developed
    public static String DummyURL = FoxtonsHooks.HOST + "buy/mortgages/how-much-can-i-borrow#";


    //    Page Elements
    public static String Logo = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-1knqsk0'][1]";

    public static String Applicant_One = "(//div//input)[1]";

    public static String Applicant_Two = "(//div//input)[2]";

    public static String error_One = "(//input[contains(@id,'applicantOne')]/following::p[contains(@class,'Mui-error')])[1]";

    public static String error_Two = "(//input[contains(@id,'applicantTwo')]/following::p[contains(@class,'Mui-error')])[1]";
    public static String Estimated_Amount = "(//span[contains(text(),'You could borrow upto')]/..//*[contains(text(),'£')])[1]";

    public static String Calculate_CTA = "//button[contains(text(),'Calculate')]";

    public static String Re_Calculate_CTA  = "//button[contains(text(),'Re Calculate')]";

    public static String View_Properties_CTA  = "//button[contains(text(),'View properties')]";

    //    Page Actions


    public void EnterAmountOne(int Amount) {

        driver.findElement(By.xpath(Applicant_One)).sendKeys(""+Amount);
    }

    public void EnterAmountTwo(int Amount) {

        driver.findElement(By.xpath(Applicant_Two)).sendKeys(""+Amount);
    }
    public void EnterStringOne(String applicant_One_string) {

        driver.findElement(By.xpath(Applicant_One)).sendKeys(applicant_One_string);
    }

    public void EnterStringTwo(String applicant_Two_string) {

        driver.findElement(By.xpath(Applicant_Two)).sendKeys(applicant_Two_string);
    }

    public void click_Calculate(){
        driver.findElement(By.xpath(Calculate_CTA)).click();
    }

    public void click_Re_Calculate(){
        driver.findElement(By.xpath(Re_Calculate_CTA)).click();
    }

    public void click_View_Properties(){
        driver.findElement(By.xpath(View_Properties_CTA)).click();
    }
}




