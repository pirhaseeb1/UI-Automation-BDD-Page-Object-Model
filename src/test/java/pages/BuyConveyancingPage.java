package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.*;
import utilities.CommonMethods;
import java.util.Properties;


public class BuyConveyancingPage {

    private WebDriver driver;
    public BuyConveyancingPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buy/conveyancing";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy/conveyancing";
    public static String conveyancingTitle = "//h1[@id='conveyancing']";
    public static String conveyancingSubTitleTwo = "//p[text()='Solicitors hand-picked for their expertise, speed & efficiency']";
    public static String conveyancingSubTitleTwotext = "Solicitors hand-picked for their expertise, speed & efficiency";
    public static String conveyancingTitleText = "CONVEYANCING";
    public static String conveyancingSubTitleOne = "//p[text()='Be Buyer Ready']";
    public static String conveyancingSubTitleOnetext = "Be Buyer Ready";

    public static String beBuyReadyTitle = "//h2[@id='be-buyer-ready-with-conveyan']";
    public static String beBuyReadyTitleText = "Be 'Buyer Ready' with Conveyan";

    public static String beBuyReadySubTitle = "//p[contains(text(),'instruct a solicitor until they have had an offer accepted.')]";
    public static String beBuyReadySubTitleText = "Often buyers don't instruct a solicitor until they have had an offer accepted.";

    //verify buy conveyancing title
    public String[] verify_conveyancing_card_subtitle_buyer() {
        String[] conveySubtitle = new String[2];
        conveySubtitle[0] = driver.findElement(By.xpath(conveyancingSubTitleOne)).getText();
        conveySubtitle[1] = driver.findElement(By.xpath(conveyancingSubTitleTwo)).getText();
        return conveySubtitle;
    }

    //verify buy conveyancing card title
    public String verify_conveyancing_card_title() {
        String conveytitle;
        CommonMethods.I_AmWait(driver,conveyancingTitle);
        conveytitle = driver.findElement(By.xpath(conveyancingTitle)).getText();
        return conveytitle;
    }

    //retrieve title and subtitle of Be sale ready card
    public String[] verify_be_buy_ready_card() {
        CommonMethods.ScrollIntoView(driver,beBuyReadyTitle);
        String[] beBuyReady = new String[2];
        beBuyReady[0] = driver.findElement(By.xpath(beBuyReadyTitle)).getText();
        beBuyReady[1] = driver.findElement(By.xpath(beBuyReadySubTitle)).getText();
        return beBuyReady;
    }
}