package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class MyFoxtonsBuyersPage {
    private WebDriver driver;

    public MyFoxtonsBuyersPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "myfoxtons/buyer";

    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "myfoxtons/buyer";

    public static String ExpectedURL_my_foxtons = FoxtonsHooks.HOST + "myfoxtons";
    public static String ExpectedURL_login = FoxtonsHooks.HOST + "auth/login";
    public static String ExpectedURL_Registration = FoxtonsHooks.HOST + "auth/registration";

    public static String go_to_my_foxtons = "//button[contains(text(),'Go to My Foxtons')]";
    public static String sign_in = "//button[contains(text(),'Sign in')]";
    public static String register = "//button[contains(text(),'Register')]";


    public void click_go_to_my_foxtons() {

        driver.findElement(By.xpath(go_to_my_foxtons)).click();
    }

    public void click_sign_in() {

        driver.findElement(By.xpath(sign_in)).click();
    }

    public void click_register() {

        driver.findElement(By.xpath(register)).click();
    }

}
