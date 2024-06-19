package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //  Page Values

    public static String Username = projectProperties.getProperty("USERNAME");
    public static String User_Password = projectProperties.getProperty("PASSWORD");

    public static String env= "qa";


    //    Page Elements
    public static String Email = "//*[@id='email']";

    public static String Password = "//*[@id='password']";

    public static String SignIn_Button = "//button[contains(text(), 'Sign in')]";

    public static String ValidationBox = "//div[@class= 'MuiAlert-message css-1w0ym84']";

    String DefaultEnv = FoxtonsHooks.HOST;

    public void enterEmail(String email){
        driver.findElement(By.xpath(Email)).sendKeys(email);
    }
    public void enterInvalidEmail(){
        driver.findElement(By.xpath(Email)).sendKeys("abc"+Username);
    }
    public void enterPassword(String password){
        driver.findElement(By.xpath(Password)).sendKeys(password);
    }

    public void enterInvalidPassword(){
        driver.findElement(By.xpath(Password)).sendKeys("xyz");
    }

    public void submitLogin() {driver.findElement(By.xpath(SignIn_Button)).click(); }

    public boolean verifyValidation(){
       return driver.findElement(By.xpath(ValidationBox)).isDisplayed();

    }

    public void accessLoginPage() {
        driver.manage().deleteAllCookies(); //delete all cookies
        String newURL = FoxtonsHooks.HOST;
        if(newURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))){
           // CommonMethods.clickCookie(driver);
            driver.get(projectProperties.getProperty("STAGE_URL") + "auth/login");
        }
        else{
         //   CommonMethods.clickCookie(driver);
            driver.get(projectProperties.getProperty("QA_URL") + "auth/login");
        }
        CommonMethods.clickCookie(driver);
    }
}
