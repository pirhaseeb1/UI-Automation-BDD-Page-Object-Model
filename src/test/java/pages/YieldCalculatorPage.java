package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class YieldCalculatorPage {

    private WebDriver driver;

    public YieldCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "landlord/yield-calculator";
    public static String ExpectedURLQA =projectProperties.getProperty("QA_URL") + "landlord/yield-calculator";
    public static String ExpectedURL_lettings = FoxtonsHooks.HOST + "landlord/contact/find-tenants/lettings";
    public static String ExpectedURL_managed = FoxtonsHooks.HOST + "landlord/contact/find-tenants/managed";
    public static String ExpectedURL_shortlet = FoxtonsHooks.HOST + "landlord/contact/find-tenants/short-lets";
    public static String ExpectedURL_investments = FoxtonsHooks.HOST + "contact/form/investments";

    //Dummy URL have to change
    public static String Dummy_URL = FoxtonsHooks.HOST + "landlord/yield-calculator#";

    // page object locators
    public static String Ask_a_question = "//button[contains(text(),'Ask us a question')]";
    public static String rental_yield = "//p[contains(text(),'What is rental yield?')]";
    public static String calculate_rental_yield = "//p[contains(text(),'calculate rental yield?')]";
    public static String buy_to_let_investment = "//p[contains(text(),'buy-to-let investment?')]";
    public static String rental_yield_in_london = "//p[contains(text(),'rental yields in London?')]";
    public static String rental_question = "//p[contains(text(),'any of your rental questions')]";
    public static String get_started_long_let = "(//button[contains(text(),'Get started')])[1]";
    public static String what_included_long_let = "//span[contains(text(),'What\'s included?')]";

    public static String long_let = "(//h3[contains(text(),'Long Let')])[1]";
    public static String get_started_managed_long = "(//button[contains(text(),'Get started')])[2]";
    public static String what_included_managed_long = "((//h2[contains(text(),'Long Let')])[2]/..//a)[2]";
    public static String Managed_Long_Let = "//h3[contains(text(),'Managed Long Let')]";
    public static String get_started_managed_short = "//button[contains(text(),'Get Started')]";
    public static String what_included_managed_short = "((//h2[contains(text(),'Short Let')])[1]/..//a)[2]";
    public static String Managed_Short_Let = "//h3[contains(text(),'Managed Short Let')]";
    //scenario6
    public static String Purchase_price = "//label[contains(text(),'Purchase')]/..//input";
    public static String Other_purchase_costs = "//*[contains(text(),'Other purchase costs')]";
    public static String Stamp_duty = "//label[contains(text(),'Stamp duty')]/..//input";
    public static String Valuation_fees = "//label[contains(text(),'Valuation fees')]/..//input";
    public static String Survey_fees = "//label[contains(text(),'Survey fees')]/..//input";
    public static String Legal_fees = "//label[contains(text(),'Legal fees')]/..//input";
    public static String Mortgage_deposit = "//label[contains(text(),'Mortgage deposit')]/..//input";
    public static String Mortgage_fees = "//label[contains(text(),'Mortgage fees')]/..//input";
    public static String Refurbishment_costs = "//label[contains(text(),'Refurbishment costs')]/..//input";
    public static String Other_buying_costs = "//label[contains(text(),'Other buying costs')]/..//input";
    public static String Monthly_rent = "//label[contains(text(),'Monthly rent (£)')]/..//input";
    public static String Yearly_running = "//label[contains(text(),'Yearly running')]/..//input";
    public static String other_costs = "//*[contains(text(),'Other costs')]";
    public static String Monthly_mortgage = "//label[contains(text(),'Monthly mortgage payment')]/..//input";
    public static String Repairs_and_maintenance = "//label[contains(text(),'Repairs and maintenance')]/..//input";
    public static String Ground_rent = "//label[contains(text(),'Ground rent and service')]/..//input";
    public static String Insurance = "//label[contains(text(),'Insurance')]/..//input";
    public static String Utility_bills = "//label[contains(text(),'Utility bills payable')]/..//input";
    public static String Council_tax = "//label[contains(text(),'Council tax')]/..//input";
    public static String Vacancy_loss = "//label[contains(text(),'Vacancy loss ')]/..//input";
    public static String CalculateYield = "//button[contains(text(),'Calculate Yield')]";
    public static String result_scenario9 = "//p[contains(text(),'0.23')]";
    public static String Calculateyieldfor = "//select[@name='yieldType']";
    public static String selectcurrentvalue = "//option[contains(text(),'The current value of the property')]";
    public static String current_price = "//label[contains(text(),'Current')]/..//input";
    //Functions

    public void click_Ask_a_question(){
        driver.findElement(By.xpath(Ask_a_question)).click();
    }
    public void click_rental_yield(){
        driver.findElement(By.xpath(rental_yield)).click();
    }
    public void click_calculate_rental_yield(){
        driver.findElement(By.xpath(calculate_rental_yield)).click();
    }
    public void click_buy_to_let_investment(){
        driver.findElement(By.xpath(buy_to_let_investment)).click();
    }
    public void click_rental_yield_in_london(){
        driver.findElement(By.xpath(rental_yield_in_london)).click();
    }
    public void click_rental_question(){
        driver.findElement(By.xpath(rental_question)).click();
    }
    public void click_get_started_long_let(){
        driver.findElement(By.xpath(get_started_long_let)).click();
    }
    public void click_what_included_long_let(){
        driver.findElement(By.xpath(what_included_long_let)).click();
    }
    public void click_get_started_managed_long(){
        driver.findElement(By.xpath(get_started_managed_long)).click();
    }
    public void click_what_included_managed_long(){
        driver.findElement(By.xpath(what_included_managed_long)).click();
    }
    public void click_get_started_managed_short(){
        driver.findElement(By.xpath(get_started_managed_short)).click();
    }

    public void click_what_included_managed_short(){
        driver.findElement(By.xpath(what_included_managed_short)).click();
    }
    //scenario6
    public void EnterPurchasePrice(Integer price1){
        driver.findElement(By.xpath(Purchase_price)).sendKeys(""+price1);
    }
    public void click_Other_purchase_costs(){
        driver.findElement(By.xpath(Other_purchase_costs)).click();
    }

    public void StampDuty(Integer price2){
        driver.findElement(By.xpath(Stamp_duty)).sendKeys(""+price2);
    }
    public void ValuationFees(Integer price3){
        driver.findElement(By.xpath(Valuation_fees)).sendKeys(""+price3);
    }
    public void Surveyfees(Integer price4){
        driver.findElement(By.xpath(Survey_fees)).sendKeys(""+price4);
    }
    public void Legalfees(Integer price5){
        driver.findElement(By.xpath(Legal_fees)).sendKeys(""+price5);
    }
    public void Mortgagedeposit(Integer price6){
        driver.findElement(By.xpath(Mortgage_deposit)).sendKeys(""+price6);
    }
    public void Mortgagefees(Integer price7){
        driver.findElement(By.xpath(Mortgage_fees)).sendKeys(""+price7);
    }
    public void Refurbishmentcosts(Integer price8){
        driver.findElement(By.xpath(Refurbishment_costs)).sendKeys(""+price8);
    }
    public void Otherbuyingcosts(Integer price9){
        driver.findElement(By.xpath(Other_buying_costs)).sendKeys(""+price9);
    }
    public void Monthlyrent(Integer price10){
        driver.findElement(By.xpath(Monthly_rent)).sendKeys(""+price10);
    }
    public void Yearlyrunning(Integer price11){
        driver.findElement(By.xpath(Yearly_running)).sendKeys(""+price11);
    }

    public void click_other_costs(){
        driver.findElement(By.xpath(other_costs)).click();
    }
    public void Monthlymortgage(Integer price12){
        driver.findElement(By.xpath(Monthly_mortgage)).sendKeys(""+price12);
    }
    public void RepairsAndmaintenance(Integer price13){
        driver.findElement(By.xpath(Repairs_and_maintenance)).sendKeys(""+price13);
    }
    public void Groundrent(Integer price14){
        driver.findElement(By.xpath(Ground_rent)).sendKeys(""+price14);
    }
    public void Insurance(Integer price15){
        driver.findElement(By.xpath(Insurance)).sendKeys(""+price15);
    }
    public void Utilitybills(Integer price16){
        driver.findElement(By.xpath(Utility_bills)).sendKeys(""+price16);
    }
    public void Counciltax(Integer price17){
        driver.findElement(By.xpath(Council_tax)).sendKeys(""+price17);
    }
    public void Vacancyloss(Integer price18){
        driver.findElement(By.xpath(Vacancy_loss)).sendKeys(""+price18);
    }
    public void click_CalculateYield(){
        driver.findElement(By.xpath(CalculateYield)).click();
    }
    public void click_Calculateyieldfor(){
        driver.findElement(By.xpath(Calculateyieldfor)).click();
    }
    public void click_selectcurrentvalue(){
        driver.findElement(By.xpath(selectcurrentvalue)).click();
    }
    public void EntercurrentPrice(Integer price19){
        driver.findElement(By.xpath(current_price)).sendKeys(""+price19);
    }

}