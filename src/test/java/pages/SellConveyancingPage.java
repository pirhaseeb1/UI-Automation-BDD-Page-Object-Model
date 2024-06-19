package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class SellConveyancingPage {

    private WebDriver driver;

    public SellConveyancingPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "sell/conveyancing";
    public static String ExpectedURLQA =projectProperties.getProperty("QA_URL") + "sell/conveyancing";
    public static String conveyancingTitle = "//h1[@id='conveyancing']";
    public static String conveyancingTitleText = "CONVEYANCING";
    public static String conveyancingSubTitleOne = "//p[text()='Be Sale Ready']";
    public static String conveyancingSubTitleOnetext = "Be Sale Ready";
    public static String conveyancingSubTitleTwo = "//p[text()='Solicitors hand-picked for their expertise, speed & efficiency']";
    public static String conveyancingSubTitleTwotext = "Solicitors hand-picked for their expertise, speed & efficiency";
    public static String getAQuote = "//button[contains(text(),'Get a quote')]";
    public static String sellYourPropertyTitle = "//h2[contains(text(),'conveyancing experts')]";
    public static String sellYourPropertyTitleText = "LONDON'S CONVEYANCING EXPERTS";
    public static String sellYourPropertySubTitle = "//h3[@id='once-youve-made-the-decision-to-sell-your-property-and-appointed-your-estate-agent-one-of-the-next-things-on-your-list-will-be-to-instruct-an-experienced-conveyancing-solicitor']";
    public static String sellYourPropertySubTitleText = "Once you've made the decision to sell your property and appointed your estate agent, one of the next things on your list will be to instruct an experienced conveyancing solicitor.";
    public static String sellYourPropertySubTitleBulletOne = "//p[contains(text(),'Efficient and experienced solicitors')]";
    public static String sellYourPropertySubTitleBulletOneText = "Efficient and experienced solicitors";
    public static String sellYourPropertySubTitleBulletTwo = "//p[contains(text(),'One of the largest panels of property solicitors in London')]";
    public static String sellYourPropertySubTitleBulletTwoText = "One of the largest panels of property solicitors in London";
    public static String sellYourPropertySubTitleBulletThree = "//p[contains(text(),'Real time updates')]";
    public static String sellYourPropertySubTitleBulletThreeText = "Real time updates";
    public static String exploreFoxtonsConveyanTitle = "//h2[contains(text(),'Explore Foxtons')]";
    public static String exploreFoxtonsConveyanTitleText = "EXPLORE FOXTONS";
    public static String ourServices = "//h2[contains(text(),'Our services')]";
    public static String ourServicesText = "Our services";
    public static String homeWorth = "//h2[contains(text(),'How much is your home worth')]";
    public static String homeWorthText = "How much is your home worth?";
    public static String sellersHelp = "//h2[contains(text(),'Help for sellers')]";
    public static String sellersHelpText = "Help for sellers";
    public static String foxtonsAuctions = "//a[contains(text(),'Foxtons Auctions')]";
    public static String foxtonsAuctionsText = "Foxtons Auctions";
    public static String foxtonsPrivateOffice = "//a[contains(text(),'Foxtons Private Office')]";
    public static String foxtonsPrivateOfficeText = "Foxtons Private Office";
    public static String sellYourHome = "//a[contains(text(),'Sell your home')]";
    public static String sellYourHomeText = "Sell your home";
    public static String bookValuationAppoint = "//a[contains(text(),'Book a valuation appointment')]";
    public static String bookValuationAppointText = "Book a valuation appointment";
    public static String instantOnlineVal = "//a[contains(text(),'Instant online valuation')]";
    public static String instantOnlineValText = "Instant online valuation";
    public static String helpAndGuide = "//a[contains(text(),'Help & Guides')]";
    public static String helpAndGuideText = "Help & Guides";
    public static String contactUsConveyan = "//a[contains(text(),'Contact us')]";
    public static String contactUsConveyanTitle = "Contact us";
    public static String beSaleReadyTitle = "//h2[contains(text(),'Be sale ready with Conveyan')]";
    public static String beSaleReadyTitleText = "Be sale ready with Conveyan";
    public static String beSaleReadySubTitle = "//p[contains(text(),'instruct a solicitor until they have accepted an offer.')]";
    public static String beSaleReadySubTitleText = "Often sellers don't instruct a solicitor until they have accepted an offer.";
    public static String whyUseConveyanTitle = "//h2[@id='why-use-conveyan']";
    public static String whyUseConveyanTitleText = "Why use Conveyan";
    public static String nolegalFeeTitle = "//p[contains(text(),'No sale, no legal fee')]";
    public static String nolegalFeeTitleText = "No sale, no legal fee";
    public static String fixedlegalFeeTitle = "//p[contains(text(),'Fixed legal fee')]";
    public static String fixedlegalFeeTitleText = "Fixed legal fee";
    public static String legalFeePayableTitle = "//p[contains(text(),'Legal fees only payable on completion of sale or purchase')]";
    public static String legalFeePayableTitleText = "Legal fees only payable on completion of sale or purchase";
    public static String realTimeUpdatesTitle = "//p[contains(text(),'Real-time text updates')]";
    public static String realTimeUpdatesTitleText = "Real-time text updates";
    public static String personalRelationshipTitle = "//p[contains(text(),'Personal relationship - one solicitor to one client')]";
    public static String personalRelationshipTitleText = "Personal relationship - one solicitor to one client";
    public static String onlineCaseTitle = "//p[contains(text(),'Online case tracking 24/7')]";
    public static String onlineCaseTitleText = "Online case tracking 24/7";

    //functions
    //retrieve title of conveyancing card
    public String verify_conveyancing_card_title() {
        String conveytitle;
        CommonMethods.I_AmWait(driver,conveyancingTitle);
        conveytitle = driver.findElement(By.xpath(conveyancingTitle)).getText();
        return conveytitle;
    }
    //retrieve subtitle of conveyancing card
    public String[] verify_conveyancing_card_subtitle() {
        String[] conveySubtitle = new String[2];
        conveySubtitle[0] = driver.findElement(By.xpath(conveyancingSubTitleOne)).getText();
        conveySubtitle[1] = driver.findElement(By.xpath(conveyancingSubTitleTwo)).getText();
        return conveySubtitle;
    }

    //click on "Get a quote" button
    public void click_on_get_a_quote() {
        CommonMethods.I_AmWait(driver,getAQuote);
        driver.findElement(By.xpath(getAQuote)).click();
    }

    //retrieve title of "Marketing Fold" card
    public String verify_marketing_fold_title() {
        CommonMethods.ScrollIntoView(driver,sellYourPropertyTitle);
        String markFoldtitle;
        markFoldtitle = driver.findElement(By.xpath(sellYourPropertyTitle)).getText();
        return markFoldtitle;
    }
    //retrieve subtitle of "Marketing Fold" card
    public String verify_marketing_fold_subtitle() {
        String markFoldSubtitle;
        markFoldSubtitle = driver.findElement(By.xpath(sellYourPropertySubTitle)).getText();
        return markFoldSubtitle;
    }
    //retrieve bullets of "Marketing Fold" card
    public String[] verify_marketing_fold_bullets() {
        String[] markFoldsBullets = new String[3];
        markFoldsBullets[0] = driver.findElement(By.xpath(sellYourPropertySubTitleBulletOne)).getText();
        markFoldsBullets[1] = driver.findElement(By.xpath(sellYourPropertySubTitleBulletTwo)).getText();
        markFoldsBullets[2] = driver.findElement(By.xpath(sellYourPropertySubTitleBulletThree)).getText();
        return markFoldsBullets;
    }

    //retrieve explore foxtons titles,headings and subheadings
    public String[] verify_explore_foxtons_conveyan_page() {

        CommonMethods.ScrollIntoView(driver, exploreFoxtonsConveyanTitle);
        String[] expFoxtonsConeyan = new String[11];
        expFoxtonsConeyan[0] = driver.findElement(By.xpath(exploreFoxtonsConveyanTitle)).getText();
        expFoxtonsConeyan[1] = driver.findElement(By.xpath(ourServices)).getText();
        expFoxtonsConeyan[2] = driver.findElement(By.xpath(homeWorth)).getText();
        expFoxtonsConeyan[3] = driver.findElement(By.xpath(sellersHelp)).getText();
        expFoxtonsConeyan[5] = driver.findElement(By.xpath(foxtonsPrivateOffice)).getText();
        expFoxtonsConeyan[6] = driver.findElement(By.xpath(sellYourHome)).getText();
        expFoxtonsConeyan[7] = driver.findElement(By.xpath(bookValuationAppoint)).getText();

        expFoxtonsConeyan[9] = driver.findElement(By.xpath(helpAndGuide)).getText();
        expFoxtonsConeyan[10] = driver.findElement(By.xpath(contactUsConveyan)).getText();
        return expFoxtonsConeyan;
    }
    //retrieve title and subtitle of Be sale ready card
    public String[] verify_be_sale_ready_card() {
        CommonMethods.ScrollIntoView(driver,beSaleReadyTitle);
        String[] beSaleReady = new String[2];
        beSaleReady[0] = driver.findElement(By.xpath(beSaleReadyTitle)).getText();
        beSaleReady[1] = driver.findElement(By.xpath(beSaleReadySubTitle)).getText();
        return beSaleReady;
    }
    //retrieve title and bullets of "Why Use Conveyan" card
    public String[] verify_why_use_conveyan() {
        CommonMethods.ScrollIntoView(driver,whyUseConveyanTitle);
        String[] whyUseConveyan = new String[7];
        whyUseConveyan[0] = driver.findElement(By.xpath(whyUseConveyanTitle)).getText();
        whyUseConveyan[1] = driver.findElement(By.xpath(nolegalFeeTitle)).getText();
        whyUseConveyan[2] = driver.findElement(By.xpath(fixedlegalFeeTitle)).getText();
        whyUseConveyan[3] = driver.findElement(By.xpath(legalFeePayableTitle)).getText();
        whyUseConveyan[4] = driver.findElement(By.xpath(realTimeUpdatesTitle)).getText();
        whyUseConveyan[5] = driver.findElement(By.xpath(personalRelationshipTitle)).getText();
        whyUseConveyan[6] = driver.findElement(By.xpath(onlineCaseTitle)).getText();
        return whyUseConveyan;
    }
}