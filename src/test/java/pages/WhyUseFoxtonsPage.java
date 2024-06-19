package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class WhyUseFoxtonsPage {
    private WebDriver driver;

    public WhyUseFoxtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage =  projectProperties.getProperty("STAGE_URL") + "buy";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "buy";
    public static String dummyURL = FoxtonsHooks.HOST + "auth/registration";
    public static String expUrl = FoxtonsHooks.HOST + "myfoxtons/buyer";
    public static String heroImageTitle = "//h1[@id='why-use-foxtons']";
    public static String heroImageSubTitleOne = "//p[contains(text(),'Be the first through the door of newly listed homes')]";
    public static String heroImageTitleText = "WHY USE FOXTONS";
    public static String heroImageSubTitleOneText = "Be the first through the door of newly listed homes";
    public static String RegisterNow = "//button[contains(text(),'Register Now')]";
    public static String foldTitle = "//h2[@id='get-ahead-of-other-buyers']";
    public static String foldTitleText = "GET AHEAD OF OTHER BUYERS";
    public static String foldSubTitle = "//p[contains(text(),'The property market is competitive. We give you an advantage.')]";
    public static String foldSubTitleText = "The property market is competitive. We give you an advantage.";
    public static String foldExtraPointsOne = "//p[contains(text(),'View homes before they are listed on Rightmove or Zoopla')]";
    public static String foldExtraPointsOneText = "View homes before they are listed on Rightmove or Zoopla";
    public static String foldExtraPointsThree = "//p[contains(text(),'Get called first about new homes')]";
    public static String foldExtraPointsThreeText = "Get called first about new homes";
    public static String getStartedInSeconds = "//button[contains(text(),'Get started in seconds')]";
    public static String learnMore = "//a[contains(text(),'Learn more')]";
    public static String thousandsOfProperties = "//h2[contains(text(),'Thousands of properties')]";
    public static String thousandsOfPropertiesText = "THOUSANDS OF PROPERTIES";
    public static String searchNow = "//button[contains(text(),'Search now')]";
    public static String ExpectedURLForSearchNow = FoxtonsHooks.HOST + "buy/buy-whyuse#";
    public static String safeHands = "//h2[@id = 'youre-in-safe-hands']";
    public static String SafeHandsText = "YOU'RE IN SAFE HANDS";
    public static String safeHandsSubTitle = "//p[contains(text(),'We are a member of the key governing bodies, abiding by the strictest codes of practice.')]";
    public static String getSafeHandsSubTitleText = "We are a member of the key governing bodies, abiding by the strictest codes of practice.";
    public static String londonPropExp = "//h1[@id = 'londons-property-expert']";
    public static String getLondonPropExpText = "LONDON'S PROPERTY EXPERT";
    public static String londonPrepExpSubTitle = "//p[contains(text(),'leading estate agent we are able to offer you local knowledge and expert advice whatever your requirements.')]";
    public static String getLondonPrepExpSubTitleText = "As London's leading estate agent we are able to offer you local knowledge and expert advice whatever your requirements.";
    public static String findOffice = "//button[contains(text(),'Find an office')]";
    public static String findOfficeDummyURL = FoxtonsHooks.HOST + "buy/Find%20an%20office";
    public static String propWorth = "//h1[@id='how-much-is-your-property-worth']";
    public static String getPropWorthText = "HOW MUCH IS YOUR PROPERTY WORTH?";
    public static String propWorthSubTitle = "//p[contains(text(),'Get your free online valuation')]";
    public static String getPropWorthSubTitleText = "Get your free online valuation";
    public static String instantValuation = "//a[contains(text(),'Instant Valuation')]";
    public static String instantValuationDummyURL = FoxtonsHooks.HOST + "buy/buy-whyuse#";
    public static String exploreFoxtons = "//h1[@id = 'explore-foxtons']";
    public static String exploreFoxtonsText = "EXPLORE FOXTONS";
    public static String firstTimeBuyers = "//h2[contains(text(),'First time buyers')]";
    public static String firstTimeBuyersText = "First time buyers";
    public static String movingHome = "//h2[contains(text(),'Moving home')]";
    public static String movingHomeText = "Moving home";
    public static String helpForBuyers = "//h2[contains(text(),'Help for buyers')]";
    public static String helpForBuyersText = "Help for buyers";
    public static String howMuchCanIBorrow = "//a[contains(text(),'How much can I borrow?')]";
    public static String howMuchCanIBorrowText = "How much can I borrow?";
    public static String guideToBuying = "//a[contains(text(),'Guide to buying')]";
    public static String guideToBuyingText = "Guide to buying";
    public static String helpToBuy = "//a[contains(text(),'Help to Buy')]";
    public static String helpToBuyText = "Help to Buy";
    public static String helpToBuyHomes = "//a[contains(text(),'Help to Buy homes')]";
    public static String helpToBuyHomesText = "Help to Buy homes";
    public static String homeWorth = "//a[contains(text(),'How much is my home worth?')]";
    public static String homeWorthText = "How much is my home worth?";
    public static String registerWithFoxtons = "//a[contains(text(),'Register with Foxtons')]";
    public static String registerWithFoxtonsText = "Register with Foxtons";
    public static String findProperty = "//a[contains(text(),'Find a property')]";
    public static String findPropertyText = "Find a property";
    public static String homeAvailability = "//a[contains(text(),'New Homes availability')]";
    public static String homeAvailabilityText = "New Homes availability";
    public static String advantagesFoxtons = "//a[contains(text(),'Advantages of choosing Foxtons')]";
    public static String advantagesFoxtonsText = "Advantages of choosing Foxtons";
    public static String mortages = "//a[contains(text(),'Mortgages')]";
    public static String mortagesText = "Mortgages";
    public static String conveyancing = "//a[contains(text(),'Conveyancing')]";
    public static String conveyancingText = "Conveyancing";
    public static String stampDutyCalculator = "//a[contains(text(),'Stamp Duty calculator')]";
    public static String stampDutyCalculatorText = "Stamp Duty calculator";
    public static String whyBuyNewBuild = "//a[contains(text(),'Why buy a new build?')]";
    public static String whyBuyNewBuildText = "Why buy a new build?";

    //functions
    //click on register button
    public void click_on_Register_Now() {
        CommonMethods.I_AmWait(driver,RegisterNow);
        driver.findElement(By.xpath(RegisterNow)).click();
    }


    //retrieve title of hero image
    public String verify_hero_image_title() {
        String title;
        CommonMethods.I_AmWait(driver,heroImageTitle);
        title = driver.findElement(By.xpath(heroImageTitle)).getText();
        return title;
    }

    //retrieve subtitle of hero image
    public String verify_hero_image_subtitle_one() {
        String subTitleOne;
        subTitleOne = driver.findElement(By.xpath(heroImageSubTitleOne)).getText();
        return subTitleOne;
    }

    //retrieve title of fold image
    public String verify_fold_title() {
        String foldtitle;
        CommonMethods.I_AmWait(driver,foldTitle);
        CommonMethods.ScrollTo(driver, 0, 800);
        foldtitle = driver.findElement(By.xpath(foldTitle)).getText();
        return foldtitle;
    }

    //retrieve subtitle of fold image
    public String verify_fold_subTitle() {
        String foldsubtitle;
        foldsubtitle = driver.findElement(By.xpath(foldSubTitle)).getText();
        return foldsubtitle;
    }

      //retrieve bullets of fold image
    public String[] verify_fold_extra_points() {
        String[] foldExtraPoints = new String[2];
        foldExtraPoints[0] = driver.findElement(By.xpath(foldExtraPointsOne)).getText();
        foldExtraPoints[1] = driver.findElement(By.xpath(foldExtraPointsThree)).getText();
        return foldExtraPoints;
    }


    //click on STARTED IN button
    public void click_on_Started_In_Seconds() {
        CommonMethods.I_AmWait(driver,getStartedInSeconds);
        CommonMethods.ScrollTo(driver, 0, 800);
        driver.findElement(By.xpath(getStartedInSeconds)).click();
    }

    //click on LEARN MORE button
    public void click_on_Learn_More() {
        CommonMethods.I_AmWait(driver,learnMore);
        CommonMethods.ScrollTo(driver, 0, 800);
        driver.findElement(By.xpath(learnMore)).click();
    }

    //retrieve Thousand of prop
    public String verify_thousand_of_properties_title() throws InterruptedException {
        String thousandsOfProp;
        CommonMethods.ScrollIntoView(driver,thousandsOfProperties);
        thousandsOfProp = driver.findElement(By.xpath(thousandsOfProperties)).getText();
        return thousandsOfProp;
    }
    //click on Search Now button
    public void click_on_Search_Now() {
        CommonMethods.ScrollIntoView(driver,searchNow);
        driver.findElement(By.xpath(searchNow)).click();
    }
    //retrieve title of "Safe Hands" card
    public String verify_safe_hands_title() {
        String safeHandsTitletxt;
        CommonMethods.ScrollIntoView(driver,safeHands);
        safeHandsTitletxt = driver.findElement(By.xpath(safeHands)).getText();
        return safeHandsTitletxt;
    }
    //retrieve subtitle of "Safe Hands" card
    public String verify_safe_hands_sub_title() {
        String safeHandsSubTitletxt;
        CommonMethods.ScrollIntoView(driver,safeHandsSubTitle);
        safeHandsSubTitletxt = driver.findElement(By.xpath(safeHandsSubTitle)).getText();
        return safeHandsSubTitletxt;
    }
    //retrieve title for "London Properties" card
    public String verify_london_properties_title() {
        String londonPropTitletxt;
        CommonMethods.ScrollIntoView(driver,londonPropExp);
        londonPropTitletxt = driver.findElement(By.xpath(londonPropExp)).getText();
        return londonPropTitletxt;
    }
    //retrieve subtitle of "London Properties" card
    public String verify_london_properties_sub_title() {
        String londonPropSubTitletxt;
        CommonMethods.ScrollIntoView(driver,londonPrepExpSubTitle);
        londonPropSubTitletxt = driver.findElement(By.xpath(londonPrepExpSubTitle)).getText();
        return londonPropSubTitletxt;
    }
    //click on "Register Now" button
    public void click_on_register_button() {
        driver.findElement(By.xpath(RegisterNow)).click();
    }
    //click on "Find Office" button
    public void click_on_find_office() {
        CommonMethods.ScrollIntoView(driver,findOffice);
        driver.findElement(By.xpath(findOffice)).click();
    }
    //retrieve title of "Property Worth" card
    public String verify_property_worth_title() {
        String propWorthTitletxt;
        CommonMethods.ScrollIntoView(driver,propWorth);
        propWorthTitletxt = driver.findElement(By.xpath(propWorth)).getText();
        return propWorthTitletxt;
    }
    //retrieve subtitle of "Property Worth" title
    public String verify_property_worth_sub_title() {
        String propWorthSubTitletxt;
        CommonMethods.ScrollIntoView(driver,propWorthSubTitle);
        propWorthSubTitletxt = driver.findElement(By.xpath(propWorthSubTitle)).getText();
        return propWorthSubTitletxt;
    }
    //click on "Instant Valuation" button
    public void click_on_instant_valuation() {
        CommonMethods.ScrollIntoView(driver,instantValuation);
        driver.findElement(By.xpath(instantValuation)).click();
    }
    //retrieve "Explore Foxtons" card
    public String[] verify_explore_foxtons() {
        String[] exploreFoxtonsOptionsTexts = new String[17];
        String[] exploreFoxtonsOptions = {exploreFoxtons, firstTimeBuyers, movingHome, helpForBuyers, howMuchCanIBorrow, guideToBuying, helpToBuy, helpToBuyHomes, homeWorth, registerWithFoxtons, findProperty, homeAvailability, advantagesFoxtons, mortages, conveyancing, stampDutyCalculator, whyBuyNewBuild};
        CommonMethods.ScrollIntoView(driver,exploreFoxtonsOptions[0]);
        for (int i = 0; i < exploreFoxtonsOptionsTexts.length; i++) {
            exploreFoxtonsOptionsTexts[i] = driver.findElement(By.xpath(exploreFoxtonsOptions[i])).getText();
        }
        return exploreFoxtonsOptionsTexts;
    }
}
