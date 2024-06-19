package pages;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String RegistrationURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "auth/registration";

    //    Registration User Data

    public static String UserEmail = CommonMethods.generateValidYopmailEmailID();
    public static String VerifiedUserEmail = CommonMethods.generateValidYopmailEmailID();
    public static String newPassword = projectProperties.getProperty("NEW_PASSWORD");
    public static String AlreadyExistedEmail = projectProperties.getProperty("USERNAME");

    //    WebElements

    public static String EmailXPath = "//*[@id='email']";
    public static String PasswordXPath = "//*[@id='password']";
    public static String ConfirmPasswordXPath = "//*[@id='confirmPassword']";
    public static String RegisterButtonXPath = "//button[contains(text(), 'Register')]";
    public static String PasswordValidationXPath = "//*[@id='confirmPassword-helper-text']";
    // public static String AlreadyRegValidationXPath = "//*[@class='MuiAlert-message css-1w0ym84']";
    public static String AlreadyRegValidationXPath = "//div[contains(@class,'MuiAlert-message css')]";
    public static String PasswordConditionsXPath = "//div[@style='display: block;']";
    public static String cookieLinkXPath = "//a[contains(.,'cookie')]";
    public static String privacyPolicyLinkXPath = "//a[contains(.,'privacy policy')]";

    //    Page Actions

    //    Following method enters the email id
    public void enterEmail() {
        CommonMethods.I_AmWait(driver, EmailXPath);
        driver.findElement(By.xpath(EmailXPath)).sendKeys(UserEmail);
    }

    //    Following method enters the email id that's already registered
    public void enterAlreadyExistedEmail() {
        CommonMethods.I_AmWait(driver, EmailXPath);
        driver.findElement(By.xpath(EmailXPath)).sendKeys(AlreadyExistedEmail);
    }

    //    Following method enters the password
    public void enterPassword() {
        driver.findElement(By.xpath(PasswordXPath)).sendKeys(newPassword);
    }

    //    Following method enters the mismatched password in "confirm password field"
    public void enterWrongPassword() {
        driver.findElement(By.xpath(ConfirmPasswordXPath)).sendKeys("Yahoo@1233");
    }

    //    Following method enters confirm password
    public void enterConfirmPassword() {
        driver.findElement(By.xpath(ConfirmPasswordXPath)).sendKeys(newPassword);
    }

    // Following method enters an invalid password, one that does not meet the required conditions
    public void enterInvalidPassword() { driver.findElement(By.xpath(PasswordXPath)).sendKeys("password"); }

    //    Following method submit the registration
    public void clickRegister() {
        driver.findElement(By.xpath(RegisterButtonXPath)).click();
    }

    //    Following method access registration page
    public void accessRegistrationPage() {
        driver.manage().deleteAllCookies(); //delete all cookies
        CommonMethods.clickCookie(driver);
        driver.get(RegistrationURL);
        CommonMethods.clickCookie(driver);
    }

    //    Following method returns true if passwords do not match
    public boolean passwordNotMatched() {
        return driver.findElement(By.xpath(PasswordValidationXPath)).isDisplayed();
    }

    //    Following method returns true if email id is already existed
    public boolean alreadyRegistered() {
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
            wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlreadyRegValidationXPath)));
        } catch (TimeoutException e) {}
        return driver.findElement(By.xpath(AlreadyRegValidationXPath)).isDisplayed();
    }

    //    Following method completes the registration flow
    public void completeReg() {
        driver.findElement(By.xpath(EmailXPath)).sendKeys(VerifiedUserEmail);
        driver.findElement(By.xpath(PasswordXPath)).sendKeys(newPassword);
        driver.findElement(By.xpath(ConfirmPasswordXPath)).sendKeys(newPassword);
        driver.findElement(By.xpath(RegisterButtonXPath)).click();
    }

    // Following method returns true if password conditions box is displayed
    public boolean passwordConditions() {
        CommonMethods.I_AmWait(driver, PasswordConditionsXPath);
        return driver.findElement(By.xpath(PasswordConditionsXPath)).isDisplayed();
    }

    // Following method returns true if the confirm password box is displayed
    public boolean confirmPasswordBox() {
        CommonMethods.I_AmWait(driver, ConfirmPasswordXPath);
        return driver.findElement(By.xpath(ConfirmPasswordXPath)).isDisplayed();
    }

    // Following method performs a click on the cookie link
    public void clickOnCookieLink() {
        CommonMethods.ScrollIntoView(driver, cookieLinkXPath);
        driver.findElement(By.xpath(cookieLinkXPath)).click();
    }

    // Following method performs a click on the privacy policy link
    public void clickOnPrivacyPolicyLink() {
        CommonMethods.ScrollIntoView(driver, privacyPolicyLinkXPath);
        driver.findElement(By.xpath(privacyPolicyLinkXPath)).click();
    }

    //    Following method verifies user email
    public static void verifyEmail() {

        RestAssured.baseURI = "https://inggw-stg.foxtons-cloud.link";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Accept", "text/plain");

        String payload = "{\n" +
                "  \"email\": \""+VerifiedUserEmail+"\",\n" +
                "  \"password\": \""+ newPassword +"\",\n" +
                "  \"rememberMe\": true\n" +
                "}";

        Response response = request.body(payload).post("/api/account/login");
        String contactId = response.then().extract().path("contactId");
        String token = response.then().extract().path("accessToken");

        RestAssured.baseURI = "https://inggw-stg.foxtons-cloud.link";
        RequestSpecification request2 = RestAssured.given();
        request2.header("Authorization", "Bearer " + token);
        request2.header("Content-Type", "application/json");
        request2.header("Accept", "text/plain");
        Response response2 = request2.request(Method.GET, "/api/user/" + contactId);
        String verificationToken = response2.then().extract().path("webVerification.verificationToken");

        RestAssured.baseURI = "https://inggw-stg.foxtons-cloud.link";
        RequestSpecification request3 = RestAssured.given();
        request3.header("Authorization", "Bearer " + token);
        request3.header("Content-Type", "application/json");
        request3.header("Accept", "text/plain");
        Response response3 = request3.patch("/api/account/" + contactId + "/verify?verificationToken=" + verificationToken);

    }

    //    Following method returns true if user is successfully verified

    public static boolean userVerified(){

        RestAssured.baseURI = "https://inggw-stg.foxtons-cloud.link";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Accept", "text/plain");

        String payload = "{\n" +
                "  \"email\": \""+VerifiedUserEmail+"\",\n" +
                "  \"password\": \""+ newPassword +"\",\n" +
                "  \"rememberMe\": true\n" +
                "}";

        Response response = request.body(payload).post("/api/account/login");
        String contactId = response.then().extract().path("contactId");
        String token = response.then().extract().path("accessToken");

        RestAssured.baseURI = "https://inggw-stg.foxtons-cloud.link";
        RequestSpecification request2 = RestAssured.given();
        request2.header("Authorization", "Bearer " + token);
        request2.header("Content-Type", "application/json");
        request2.header("Accept", "text/plain");
        Response response2 = request2.request(Method.GET, "/api/user/" + contactId);
        boolean VerCheck = response2.then().extract().path("webVerification.verified");
        return VerCheck;
    }
}
