package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class ContactFoxtonsPage {
    private WebDriver driver;

    public ContactFoxtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    //    Contact Foxtons Form Data

    public static String Comment = "this is automation user comments";
    public static String FirstName = "automation";
    public static String LastName = "user";
    public static String Phone = "4412345678";
    public static String Email = "mazeem@csquareonline.com";
    public static String ExpectedURL = FoxtonsHooks.HOST + "contact/form/investments";

    //    WebElements

    public static String Subject = "//*[@id=':Racqlaj76:']";
    public static String GESubject = "//*[contains(text(), 'General enquiry')]";
    public static String LBSubject = "//*[contains(text(), 'Looking to buy')]";
    public static String LRSubject = "//*[contains(text(), 'Looking to rent')]";
    public static String WSSubject = "//*[contains(text(), 'Wanting to sell')]";
    public static String LPMSubject = "//*[contains(text(), 'Lettings / Property Management')]";
    public static String NHSubject = "//*[contains(text(), 'New Homes & Help to Buy')]";
    public static String PDSubject = "//*[contains(text(), 'Property development')]";
    public static String CSubject = "//*[contains(text(), 'Complaint')]";
    public static String FBSubject = "//*[contains(text(), 'Feedback')]";
    public static String Comments = "//textarea[@id='comment']";
    public static String Title = "//*[@id=':r0:']";
    public static String MrTitle = "//*[contains(text(), 'Mr')]";
    public static String FName = "//input[@id='first-name']";
    public static String LName = "//input[@id='last-name']";
    public static String PNumber = "//input[@id='phone']";
    public static String EmailID = "//input[@id='email']";
    public static String Submit = "//button[contains(text(), 'Send')]";

    public static String SuccessMessage = "//*[contains(text(),'SUCCESS')]/../..";

    //    Page Actions

    public void accessContactFoxtonsPage() {
        driver.manage().deleteAllCookies(); //delete all cookies
        driver.get(FoxtonsHooks.HOST);
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
            driver.get(projectProperties.getProperty("STAGE_URL") + "contact/form/investments");
        }
        else{
            driver.get(projectProperties.getProperty("QA_URL") + "contact/form/investments");
        }
//        String base_url = driver.getCurrentUrl();
//        driver.manage().deleteAllCookies(); //delete all cookies
//        driver.get(base_url + "/contact/form/investments");
    }

    public void clickSubjectList() {
        driver.findElement(By.xpath(Subject)).click();

    }

    public void selectGeneralEnquiry(){
        driver.findElement(By.xpath(GESubject)).click();
    }

    public void selectLookingToBuy(){
        driver.findElement(By.xpath(LBSubject)).click();
    }

    public void selectLookingToRent(){
        driver.findElement(By.xpath(LRSubject)).click();
    }

    public void selectWantingToSell(){
        driver.findElement(By.xpath(WSSubject)).click();
    }
    public void selectPropertyManagement(){
        driver.findElement(By.xpath(LPMSubject)).click();
    }
    public void selectNewHomes(){
        driver.findElement(By.xpath(NHSubject)).click();
    }
    public  void selectPropertyDevelopment(){
        driver.findElement(By.xpath(PDSubject)).click();
    }
    public void selectComplaints(){
        driver.findElement(By.xpath(CSubject)).click();
    }
    public void selectFeedbacks(){
        driver.findElement(By.xpath(FBSubject)).click();
    }
    public void addComments(){
        driver.findElement(By.xpath(Comments)).sendKeys(Comment);
    }
    public void clickTitle(){
        driver.findElement(By.xpath(Title)).click();
    }
    public void selectTitle(){
        driver.findElement(By.xpath(MrTitle)).click();
    }
    public void addFName(){
        driver.findElement(By.xpath(FName)).sendKeys(FirstName);
    }
    public void addLName(){
        driver.findElement(By.xpath(LName)).sendKeys(LastName);
    }
    public void addPhone(){
        driver.findElement(By.xpath(PNumber)).sendKeys(Phone);
    }
    public void addEmail(){
        driver.findElement(By.xpath(EmailID)).sendKeys(Email);
    }
    public void submitForm(){
        driver.findElement(By.xpath(Submit)).click();
    }
    public boolean verifyMessage(){
        return driver.findElement(By.xpath(SuccessMessage)).isDisplayed();

    }
}
