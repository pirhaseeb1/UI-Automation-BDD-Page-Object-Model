package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class PortalValuationPage {

    private WebDriver driver;

    public PortalValuationPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "account/valuation";

    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "account/valuation";

    public static String ExpectedURL_signIn = FoxtonsHooks.HOST + "account";

    public static String User_name = projectProperties.getProperty("USERNAME");

    public static String Pass = projectProperties.getProperty("PASSWORD");

    //    Page Elements

    public static String username = "//*[@id='email']";

    public static String password = "//*[@id='password']";

    public static String sign_in = "//button[text()='Sign in']";

    public static String input_postcode = "//*[@id='postcode']";

    public static String Address_1 = "(//p[contains(text(),'Enter your postcode')]/following::p[contains(text(),'London')])[1]";

    public static String Address_2 = "(//p[contains(text(),'Enter your postcode')]/following::p[contains(text(),'London')])[2]";

    public static String Address_3 = "(//p[contains(text(),'Enter your postcode')]/following::p[contains(text(),'London')])[3]";

    public static String Error_message_invalid_postcode = "//p[contains(@class,'Mui-error')]";

    public static String Next = "(//button[text()='Next'])[1]";

    public static String Refocus = "//p[text()='Property Valuation']";

    public static String Back = "(//button[text()='Back'])[1]";

    public static String Log_out = "(//*[text()='Logout'])[1]";


    public static String My_properties = "//*[contains(@class,'1fx7cuk')]";

    public static String Search = "//*[contains(@class,'1w2t4ga')]";

    public static String Search_property = "(//input[contains(@class,'1uvydh2')])[1]";

    public static String heading_validate = "//p[contains(text(),'Choose your valuation date')]";
    public static String heading_validate_1 = "//p[contains(text(),'Are you the legal owner of the property?')]";
    public static String heading_validate_2 = "//p[contains(text(),'Are you looking for a sales or rental valuation?')]";
    public static String heading_validate_3 = "//p[contains(text(),'Excellent! You're nearly there.')]";
    public static String heading_validate_4 = "//p[contains(text(),'Lastly, what are the best contact details for you, Jee Sun?')]";
    public static String heading_validate_5 = "//p[contains(text(),'What is your situation?')]";
    public static String heading_validate_6 = "//p[contains(text(),'What type of valuation do you want?')]";
    public static String heading_validate_7 = "//p[contains(text(),'What type of building is it?')]";
    public static String heading_validate_8 = "//p[contains(text(),'What kind of house is it?')]";
    public static String heading_validate_9 = "//p[contains(text(),'How many bedrooms does it have?')]";
    public static String plaining_to_sell= "//label[contains(text(),'Planning to sell')]";
    public static String h1_request_done = "//p[contains(text(),'Your request has been sent to our team')]";


    public static String Online_valuation = "//p[contains(text(),'Online valuation')]";

    public static String Home_valuation = "//p[contains(text(),'Home valuation')]";

    public static String Back_under_What_type_of_valuation_do_you_want = "//button[contains(@class,'dqp88g')]";

    public static String validate_email = "//input[@name='email']";


    public static String Title = "//*[contains(@placeholder,'Title')]";

    public static String firstName_validate = "//input[@name='first_name']";

    public static String lastName_validate = "//input[@name='last_name']";

    public static String PH_Number_validate = "//input[@placeholder='Phone number']";

    public static String estimatedValuation_validate = "//p[contains(text(),'Your estimated valuation')]";

    public static String Minimum_Price = "//div[contains(@class,'1r2811i')]";

    public static String Maximum_Price = "//div[contains(@class,'133j459')]";

    public static String card_click = "//label[contains(@for,'12pm-2pm')]";

    public static String Rental_price = "//p[contains(text(),'Rental Price')]";

    public static String error = "(//div[contains(@style,'color: red')])[1]";

    public static String timing_card_one = "(//input[contains(@name,'time')]/following::label)[1]";

    public static String timing_card_two = "(//input[contains(@name,'time')]/following::label)[2]";

    public static String timing_card_three = "(//input[contains(@name,'time')]/following::label)[3]";





//Functions


    public void send_username(String username1) {

        driver.findElement(By.xpath(username)).sendKeys(username1);
    }

    public void send_pass(String Two_string) {

        driver.findElement(By.xpath(password)).sendKeys(Two_string);
    }

    public void click_signin() {
        driver.findElement(By.xpath(sign_in)).click();
    }

    public void click_input_postcode() {
        driver.findElement(By.xpath(input_postcode)).click();
    }

    public void click_Oliver_Bonas_Balham_High_Road_London() {
        driver.findElement(By.xpath(Address_1)).click();

    }

    public void Error_message_invalid_postcode() {
        driver.findElement(By.xpath(Error_message_invalid_postcode)).click();
    }

    public void click_Next_property_valuation() {
        driver.findElement(By.xpath(Next)).click();
    }

    public void click_refocus_property_valuation() {
        driver.findElement(By.xpath(Refocus)).click();
    }

    public void click_Logout() {
        driver.findElement(By.xpath(Log_out)).click();
    }

    public void click_My_properties() {
        driver.findElement(By.xpath(My_properties)).click();
    }

    public void click_Search() {
        driver.findElement(By.xpath(Search)).click();
    }

    public void click_Search_property() {
        driver.findElement(By.xpath(Search_property)).click();
    }

    public void click_Online_valuation() {
        driver.findElement(By.xpath(Online_valuation)).click();
    }

    public void click_Back_under_What_type_of_valuation_do_you_want() {
        driver.findElement(By.xpath(Back_under_What_type_of_valuation_do_you_want)).click();
    }

    public void click_Address(String Address) {
        driver.findElement(By.xpath("//p[contains(text(),'" + Address + "')]")).click();
    }


    public void click_buildingType(String building_type) {
        driver.findElement(By.xpath("//label[contains(@for,'" + building_type + "')]")).click();

    }

    public void click_houseType(String house_kind) {

        driver.findElement(By.xpath("(//div[contains(text(),'" + house_kind + "')])[1]")).click();

    }

    public void click_bedroom(String bedrooms) {
        driver.findElement(By.xpath("(//label[contains(@for,'" + bedrooms + "')])[1]")).click();

    }

    public void click_legal_Owner(String legal_owner) {
        driver.findElement(By.xpath(" //div[contains(text(),'" + legal_owner + "')]")).click();

    }

    public void click_title() {
        driver.findElement(By.xpath(Title)).click();

    }

    public void click_Titles_option(String titles) {
        driver.findElement(By.xpath("//*[contains(@placeholder,'Title')]//option[@value='" + titles + "']")).click();

    }

    public void click_your_situation(String situation) {
        driver.findElement(By.xpath(" //label[contains(text(),'" + situation + "')]")).click();

    }

    public void click_rental_price() {
        driver.findElement(By.xpath(Rental_price)).click();

    }

    public void choose_date(String date) {
        driver.findElement(By.xpath("//button[contains(@aria-label,'" + date + "')]")).click();

        //button[contains(@aria-label,'Jul 14, 2022')]

    }

    public void choose_timing_card(String card) {

        driver.findElement(By.xpath("//label[contains(@for,'" + card +"')]")).click();
        //label[contains(@for,'4pm-7pm')]
    }

    public void choose_sales_or_rental(String str) {
        driver.findElement(By.xpath("//div[contains(text(),'" + str +"')]")).click();

    }
    public void click_Home_valuation() {
        driver.findElement(By.xpath(Home_valuation)).click();

    }

}
