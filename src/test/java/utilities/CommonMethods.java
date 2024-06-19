package utilities;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CommonMethods {

    /**
     * This will be used to switch to new tabs, just enter value of tabs= which tab you want to switch to
     *
     */
    public static void BrowserTabs(WebDriver driver, int tabs, String ExpectedUrl) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(numberOfWindowsToBe(tabs));
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String child_tab;
        for (int i = 0; i < tabs - 1; i++) {
            i1.next();
        }
        child_tab = i1.next();
        driver.switchTo().window(child_tab);
        wait.until(urlContains(ExpectedUrl));
    }

    /**
     * This will be used to hover over an element jut pass the element to string you want to hover
     *
     */
    public static void hoverOver(WebDriver driver, String element) {
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(By.xpath(element));
        action.moveToElement(elem).perform();
    }

    /**
     * This will be used to wait for visibility of an Element
     *
     */
    public static void I_AmWait(WebDriver driver, String element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        } catch (TimeoutException e) {
            System.out.println("The element \"" + element + "\" was not found within the specified timeout.");
        }
    }
    /**
     * This will be used scroll To certain coordinates pass X and Y
     *
     */

    public static void ScrollTo(WebDriver driver, int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo("+x+","+y+")","");
    }

    public static void jsClick(WebDriver driver,String date) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var result = document.evaluate(\"//button[contains(@aria-label,'"+date+",')]\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext(); input.scrollIntoView();input.click();","");
    }

    public static void ScrollIntoView(WebDriver driver,String element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("function holdFor(h){return new Promise(function(resolve){setTimeout(function(){resolve();}, h);});}for(var i=0;i<100;i++){await holdFor(10);window.scrollBy(0,50)} var result = document.evaluate(\""+element+"\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext(); input.scrollIntoView();window.scrollBy(0,-200);","");
    }
    public static void clearValue(WebDriver driver,String element) {
            driver.findElement(By.xpath(element)).sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
    }

    /**
     * This will be used to scroll to the bottom of the web page
     *
     */
    public static void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    /**
     * This will be used to accept all cookies on the cookie dialog if displayed
     *
     */
    public static void clickCookie (WebDriver driver) {
        boolean success;
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
            success = true;
        } catch (TimeoutException e) {
            System.out.println("The cookie dialog was not found within the specified timeout.");
            success = false;
        }
        if (success) {
            driver.findElement(By.xpath("//div[@role='dialog']//button[contains(text(),\"Accept\")]")).click();
        }
    }

    // Data Generation Scripts

    /**
     * This will be used to generate a valid email ID in the foxtons.co.uk domain
     *
     */
    public static @NotNull String generateValidYopmailEmailID() {
        return UUID.randomUUID().toString().substring(1, 6).replace("-", "") + "fxauto@yopmail.com";
    }

    //This will be used to change the assertion msg for privacy concerns
    public static void assertCustomEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Url is different.");
        }
    }

    public static void assertCustomNotEquals(Object expected, Object actual) {
        if (expected.equals(actual)) {
            throw new AssertionError("Url is Same.");
        }
    }
}