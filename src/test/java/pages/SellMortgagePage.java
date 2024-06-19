package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utilities.ConfigReader.browser;

public class SellMortgagePage {
    private WebDriver driver;
    public SellMortgagePage(WebDriver driver) {this.driver = driver;}

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_AUTH_URL") + "sell/sell_mortgages";
    public static String ExpectedURLQA =projectProperties.getProperty("QA_AUTH_URL") + "sell/sell_mortgages";

    public static String hero_image_title = "mortgages";
    public static String getHero_image_subtitle = "//p[text()='Expert mortgage advice']";
    public static String hero_image = "heroBanner";
    public static String alexander_hall = "//button[text()='Visit Alexander Hall']";

    public static String free_appointment = "//button[@type = 'submit' and text() = 'Arrange a free appointment']";
    public static String moving_home_mortage = "//button[contains(text(),'View mortgages')]";
    public static String remortgage = "//button[contains(text(),'View mortgages')]";
    public static String do_you_have_questions = "//button[contains(text(),'Contact form')]";
    public static String cookie_consent_model = "cookie_consent";



    // Functions
    public void check_mortage_page_hero_image() {
        driver.findElement(By.id(hero_image));
    }

    public String get_title_of_hero_image() {
        String save_title;

        // Get Title text
        save_title = driver.findElement(By.id(hero_image_title)).getText();
        return save_title;
    }

    public String get_subtitle_of_hero_image() {
        String save_subtitle;

        // Get Subtitle text
        save_subtitle = driver.findElement(By.xpath(getHero_image_subtitle)).getText();

        return save_subtitle;
    }

    public void click_on_alexander_hall_button() {
        // Accept the cookies first by clicking on Accept all button
//        CommonMethods.I_AmWait(driver,"//button[text()='Accept all']");
//        driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        driver.findElement(By.xpath(alexander_hall)).click();
        // Switch the tabs
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }

    public void user_should_land_on_Mortgages_expert_advice_page() {
        driver.findElements(By.xpath(free_appointment));
    }

    public void switch_to_the_newly_opened_tab() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));


    }

    public void click_on_moving_home_mortgages() {
        // Accept the cookies first by clicking on Accept all button
//        CommonMethods.I_AmWait(driver,"//button[text()='Accept all']");
//        driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        CommonMethods.ScrollIntoView(driver,moving_home_mortage);
        driver.findElement(By.xpath(moving_home_mortage)).click();

        // Switch to the new tab
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        driver.findElement(By.id(cookie_consent_model));
    }
    public void click_on_remortgage() {
        // Accept the cookies first by clicking on Accept all button
//        CommonMethods.I_AmWait(driver,"//button[text()='Accept all']");
//        driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        CommonMethods.ScrollIntoView(driver,remortgage);
        driver.findElement(By.xpath(remortgage)).click();

        // Switch to the new tab
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        driver.findElement(By.id(cookie_consent_model));

    }
    public void click_on_do_you_have_questions() {
        // Accept the cookies first by clicking on Accept all button
//        CommonMethods.I_AmWait(driver,"//button[text()='Accept all']");
//        driver.findElement(By.xpath("//button[text()='Accept all']")).click();
        CommonMethods.ScrollIntoView(driver,do_you_have_questions);
        driver.findElement(By.xpath(do_you_have_questions)).click();

        // Switch to the new tab
        switch_to_the_newly_opened_tab();
        driver.findElement(By.id(cookie_consent_model));
    }

}