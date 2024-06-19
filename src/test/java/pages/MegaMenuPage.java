package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class MegaMenuPage {

    private WebDriver driver;

    public MegaMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "buyerlet/let_process";
    public static String ExpectedURLQA =   projectProperties.getProperty("QA_URL") + "buyerlet/let_process";
    public static String ExpectedURL_buyerStage = projectProperties.getProperty("STAGE_URL") + "valuation";
    public static String ExpectedURL_buyerQA = projectProperties.getProperty("QA_URL") + "valuation";
    public static String ExpectedURL_newhomesStage = projectProperties.getProperty("STAGE_URL") + "newhomes";
    public static String ExpectedURL_newhomesQA =projectProperties.getProperty("QA_URL") + "newhomes";
    public static String ExpectedURL_buy_mortgagesStage = projectProperties.getProperty("STAGE_URL") + "buy/buy_mortgages";
    public static String ExpectedURL_buy_mortgagesQA = projectProperties.getProperty("QA_URL") + "buy/buy_mortgages";
    public static String ExpectedURL_how_much_I_borrowStage = projectProperties.getProperty("STAGE_URL") + "buy/mortgages/how-much-can-i-borrow";
    public static String ExpectedURL_how_much_I_borrowQA =projectProperties.getProperty("QA_URL") + "buy/mortgages/how-much-can-i-borrow";
    public static String ExpectedURL_stampdutyStage = projectProperties.getProperty("STAGE_URL") + "buy/stampduty";
    public static String ExpectedURL_stampdutyQA = projectProperties.getProperty("QA_URL") + "buy/stampduty";
    public static String ExpectedURL_buy_to_let_mortgagesStage = projectProperties.getProperty("STAGE_URL") + "landlord/buy-to-let-mortgages";
    public static String ExpectedURL_buy_to_let_mortgagesQA = projectProperties.getProperty("QA_URL") + "landlord/buy-to-let-mortgages";
    public static String ExpectedURL_tenantStage = projectProperties.getProperty("STAGE_URL") + "tenant";
    public static String ExpectedURL_tenantQA = projectProperties.getProperty("QA_URL") + "tenant";
    public static String ExpectedURL_short_letsStage =projectProperties.getProperty("STAGE_URL") + "landlord/short-lets";
    public static String ExpectedURL_short_letsQA = projectProperties.getProperty("QA_URL") + "landlord/short-lets";
    public static String ExpectedURL_property_managementStage =projectProperties.getProperty("STAGE_URL") + "landlord/property-management";
    public static String ExpectedURL_property_managementQA = projectProperties.getProperty("QA_URL") + "landlord/property-management";
    public static String ExpectedURL_primeStage = projectProperties.getProperty("STAGE_URL") + "landlord/prime";
    public static String ExpectedURL_primeQA = projectProperties.getProperty("QA_URL") + "landlord/prime";
    public static String ExpectedURL_yield_calculatorStage = projectProperties.getProperty("STAGE_URL") + "landlord/yield-calculator";
    public static String ExpectedURL_yield_calculatorQA =projectProperties.getProperty("QA_URL") + "landlord/yield-calculator";
    //Dummy URL have to change
    public static String Dummy_URLStage = projectProperties.getProperty("STAGE_URL") +  "landlord/let/let_process#";
    public static String Dummy_URLQA = projectProperties.getProperty("QA_URL") + "landlord/let/let_process#";


    // page object locators

    public static String Buy = "//span[contains(text(),'Buy')]";
    public static String Buy_properties = "//a[contains(text(),'How much is my home worth')]";
    public static String New_build_homes = "//span[contains(text(),'New Build Homes')]";
    public static String Mortgages = "//a[contains(text(),'Mortgages')]";
    public static String Mortgage_advice = "//a[contains(text(),'Mortgage advice')]";
    public static String Mortgage_calculator = "//button[contains(text(),'Mortgage Calculator')]";
    public static String How_much_I_borrow_mortgage= "//a[contains(text(),'How much can I borrow mortgage')]";
    public static String Stamp_duty_calculator = "//a[contains(text(),'Stamp Duty Calculator')]";
    public static String Buy_to_let = "(//a[contains(text(),'Buy to let')])[1]";

    public static String Rent = "//span[contains(text(),'Rent')]";
    public static String Properties_to_rent = "//a[contains(text(),'Properties to rent')]";
    public static String Short_term_rentals = "//a[contains(text(),'Short Lets')]";
    public static String Corporate_home_rentals = "//a[contains(text(),'Corporate Relocation')]";
    public static String Student_housing = "//a[contains(text(),'Student Accommodation')]";
    public static String Lett = "//span[contains(text(),'Landlords')]";
    public static String Short_term_lets = "//a[contains(text(),'Short Lets')]";
    public static String Property_Management = "//a[contains(text(),'Property Management')]";
    public static String Prime_Lettings = "//a[contains(text(),'Prime Lettings')]";
    public static String Letting_agents = "//a[contains(text(),'Landlord Advice')]";
    public static String Buy_to_lett = "(//a[contains(text(),'Buy to Let Mortgages')])";
    public static String Rental_yeild_calculator = "//a[contains(text(),'Rental Yield calculator')] ";
    public static String Sell = "(//span[contains(text(),'Sell')])[1]";
    public static String Sell_my_home = "//a[contains(text(),'Sell your Home')]";
    public static String Sell_my_homee = "(//a[contains(text(),'Sell my home')])[1]";
    public static String Sell_my_home_fast = "//a[contains(text(),'Sell my home fast')]";
    public static String Property_Valuation = "//a[contains(text(),'Book a Valuation Appointment')]";
    public static String Property_Valuationn = "(//a[contains(text(),'Property Valuation')])[1]";
    public static String Online_Property_Valuation = "//a[contains(text(),'Online Property Valuation')]";

    //Functions

    public void click_Buy(){
        driver.findElement(By.xpath(Buy)).click();
    }
    public void click_Buy_properties(){
        driver.findElement(By.xpath(Buy_properties)).click();
    }
    public void click_New_build_homes(){
        driver.findElement(By.xpath(New_build_homes)).click();
        driver.findElement(By.xpath("//a[contains(text(),'New Homes Availability')]")).click();
    }
    public void click_Mortgages(){
        driver.findElement(By.xpath("//span[contains(text(),'Help for Buyers')]")).click();
        driver.findElement(By.xpath(Mortgages)).click();
    }
    public void click_Mortgage_advice(){
        driver.findElement(By.xpath(Mortgage_advice)).click();
    }
    public void click_Mortgage_calculator(){
        driver.findElement(By.xpath(Mortgage_calculator)).click();
    }
    public void click_How_much_I_borrow_mortgage(){
        driver.findElement(By.xpath(How_much_I_borrow_mortgage)).click();
    }
    public void click_Stamp_duty_calculator(){
        driver.findElement(By.xpath("//span[contains(text(),'Help for Buyers')]")).click();
        driver.findElement(By.xpath(Stamp_duty_calculator)).click();
    }
    public void click_Buy_to_let(){
        driver.findElement(By.xpath(Buy_to_let)).click();
    }
    public void click_Rent(){
        driver.findElement(By.xpath(Rent)).click();
    }
    public void click_Properties_to_rent(){
        driver.findElement(By.xpath(Properties_to_rent)).click();
    }
    public void click_Short_term_rentals(){
        driver.findElement(By.xpath("//span[contains(text(),'Specialist Lets')]")).click();
        driver.findElement(By.xpath(Short_term_rentals)).click();
    }
    public void click_Corporate_home_rentals(){
        driver.findElement(By.xpath("//span[contains(text(),'Specialist Lets')]")).click();
        driver.findElement(By.xpath(Corporate_home_rentals)).click();
    }
    public void click_Student_housing(){
        driver.findElement(By.xpath(Student_housing)).click();
    }
    public void click_Lett(){
        driver.findElement(By.xpath(Lett)).click();
    }
    public void click_Short_term_lets(){
        driver.findElement(By.xpath(Short_term_lets)).click();
    }
    public void click_Property_Management(){
        driver.findElement(By.xpath(Property_Management)).click();
    }
    public void click_Prime_Lettings(){
        driver.findElement(By.xpath(Prime_Lettings)).click();
    }
    public void click_Letting_agents(){
        driver.findElement(By.xpath("//span[contains(text(),'Help for Landlords')]")).click();
        driver.findElement(By.xpath(Letting_agents)).click();
    }
    public void click_Buy_to_lett(){
        driver.findElement(By.xpath("//span[contains(text(),'Help for Landlords')]")).click();
        driver.findElement(By.xpath(Buy_to_lett)).click();
    }
    public void click_Rental_yeild_calculator(){
        driver.findElement(By.xpath("//span[contains(text(),'Help for Landlords')]")).click();
        driver.findElement(By.xpath(Rental_yeild_calculator)).click();
    }
    public void click_Sell(){
        driver.findElement(By.xpath(Sell)).click();
    }
    public void click_Sell_my_home (){
        driver.findElement(By.xpath(Sell_my_home)).click();
    }
    public void click_Sell_my_homee(){
        driver.findElement(By.xpath(Sell_my_homee)).click();
    }
    public void click_Sell_my_home_fast(){
        driver.findElement(By.xpath(Sell_my_home_fast)).click();
    }
    public void click_Property_Valuation(){
        driver.findElement(By.xpath(Property_Valuation)).click();
    }
    public void click_Property_Valuationn(){
        driver.findElement(By.xpath(Property_Valuationn)).click();
    }
    public void click_Online_Property_Valuation(){
        driver.findElement(By.xpath(Online_Property_Valuation)).click();
    }



}
