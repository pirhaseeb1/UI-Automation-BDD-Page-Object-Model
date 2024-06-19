package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class FoxtonsSellersPage {

    private WebDriver driver;

    public FoxtonsSellersPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "myfoxtons/seller";

    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "myfoxtons/seller";

    public static String ExpectedURL_fullfeatureList = FoxtonsHooks.HOST + "myfoxtons/sellers#fullFeatureList";

    public static String ExpectedURL_create_account = FoxtonsHooks.HOST + "auth/registration";

    public static String view_amazing_benefits = "//button[contains(text(),'View amazing benefits')]";

    public static String SignUpFoxtons = "//button[contains(text(),'Sign up for My')]";


    public void click_view_amazing_benefits() {

        driver.findElement(By.xpath(view_amazing_benefits)).click();
    }
    public void click_SignUpFoxtons() {

        driver.findElement(By.xpath(SignUpFoxtons)).click();
    }

}

