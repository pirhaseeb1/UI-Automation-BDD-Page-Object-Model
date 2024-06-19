package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class BlogLandingPage {


    private WebDriver driver;
    public BlogLandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_AUTH_URL") + "discover/news";
    public static String ExpectedURLQA = projectProperties.getProperty("QA_AUTH_URL") + "discover/news";
    public static String discover = "//button[contains(text(),'Discover')]";
    public static String All = "//span[normalize-space()='All']";
    public static String article= "p.MuiTypography-root.MuiTypography-body1.css-lvs0ij";
    public static String HomeInspiration = "//span[contains(text(), 'Home inspiration')]";
    public static String HomeInspirationText = "Home inspiration";
    public static String AreaGuide = "//span[contains(text(), 'Area guide')]";
    public static String AreaGuideText = "Area guide";
    public static String PropertyFocus = "//span[contains(text(), 'Property focus')]";
    public static String PropertyFocusText = "Property focus";
    public static String FoxtonsNews = "//span[contains(text(), 'Foxtons news')]";
    public static String FoxtonsNewsText = "Foxtons news";
    public static String Lifestyle = "//span[contains(text(), 'Lifestyle')]";
    public static String LifestyleText = "Lifestyle";
    public static String Landlords = "//span[contains(text(), 'Landlords')]";
    public static String LandlordsText = "Landlords";
    public static String Selling = "//span[contains(text(), 'Selling')]";
    public static String SellingText = "Selling";
    public static String Buying = "//span[contains(text(), 'Buying')]";
    public static String BuyingText = "Buying";
    public static String Renting = "//span[contains(text(), 'Renting')]";
    public static String RentingText = "Renting";
    public static String Legislation = "//span[contains(text(), 'Legislation')]";
    public static String LegislationText = "Legislation";
    public static String PropertyMarketUpdates = "//span[contains(text(), 'Property market updates')]";
    public static String PropertyMarketUpdatesText = "Property market updates";

    public static String ForwardButton=  "//button[@aria-label='Go to next page']//*[name()='svg']";
    public static String BackwardButton= "//button[@aria-label='Go to previous page']//*[name()='svg']";
    public static String page2= "//button[@aria-label='Go to page 2']";
    public static String page3= "//button[@aria-label='Go to page 3']";
    public static String page4= "//button[@aria-label='Go to page 4']";

    public void click_Discover()  {
        CommonMethods.I_AmWait(driver, discover);
        driver.findElement(By.xpath(discover)).click();
    }

    public void click_All() {
        CommonMethods.I_AmWait(driver,All);
        CommonMethods.ScrollIntoView(driver,HomeInspiration);
        driver.findElement(By.xpath(All)).click();
    }



    public static void checkArticleOrder(WebDriver driver, String cssSelector) {
        List<WebElement> articleElements = driver.findElements(By.cssSelector(cssSelector));

        boolean isOrdered = true;

        for (int i = 0; i < ((List<?>) articleElements).size() - 1; i++) {
            String dateString1 = articleElements.get(i).getText();
            String dateString2 = articleElements.get(i + 1).getText();

            // Remove the ordinal indicator ("th") before parsing
            dateString1 = dateString1.replaceAll("(?<=\\d)(st|nd|rd|th)", "");
            dateString2 = dateString2.replaceAll("(?<=\\d)(st|nd|rd|th)", "");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
            LocalDate date1 = LocalDate.parse(dateString1, formatter);
            LocalDate date2 = LocalDate.parse(dateString2, formatter);

            long unixTimestampSeconds1 = date1.atStartOfDay(ZoneOffset.UTC).toEpochSecond();
            long unixTimestampSeconds2 = date2.atStartOfDay(ZoneOffset.UTC).toEpochSecond();

            //  System.out.println(date1);
            // System.out.println(date2 + "\n");

            // Check if the values are in descending order
            if (unixTimestampSeconds1 < unixTimestampSeconds2) {
                isOrdered = false;
                break;
            }
        }

        // Output the result
        if (isOrdered) {
            System.out.println("The unixTimestampSeconds values are in descending order.");
        } else {
            System.out.println("The unixTimestampSeconds values are not in descending order.");
        }
    }

    public static void IsDataAvailable(WebDriver driver, String cssSelector) {
        List<WebElement> articleElements = driver.findElements(By.cssSelector(cssSelector));

        // Output the result
        if (articleElements.isEmpty()) {
            System.out.println("No Article is on Page");
        } else {
            System.out.println("Article is available on Page");
        }
    }

    public void blog_categories_data() {
        CommonMethods.clickCookie(driver);
        CommonMethods.ScrollIntoView(driver,HomeInspiration);
        BlogGetCategoriesData();
    }

    private String[] BlogGetCategoriesData() {
        String[] categoriesArray = new String[11]; // Assuming there are 11 categories

        categoriesArray[0] = driver.findElement(By.xpath(HomeInspiration)).getText();
        categoriesArray[1] = driver.findElement(By.xpath(AreaGuide)).getText();
        categoriesArray[2] = driver.findElement(By.xpath(PropertyFocus)).getText();
        categoriesArray[3]= driver.findElement(By.xpath(FoxtonsNews)).getText();
        categoriesArray[4]= driver.findElement(By.xpath(Lifestyle)).getText();
        categoriesArray[5] = driver.findElement(By.xpath(Landlords)).getText();
        categoriesArray[6]= driver.findElement(By.xpath(Selling)).getText();
        categoriesArray[7]= driver.findElement(By.xpath(Buying)).getText();
        categoriesArray[8]= driver.findElement(By.xpath(Renting)).getText();
        categoriesArray[9]= driver.findElement(By.xpath(Legislation)).getText();
        categoriesArray[10]= driver.findElement(By.xpath(PropertyMarketUpdates)).getText();
        return categoriesArray;
    }


    public void verify_blog_categories_data(){
        CommonMethods.ScrollIntoView(driver, HomeInspiration);
        String[] categoriesArray = BlogGetCategoriesData();

        String[] expectedTextArray = {
                HomeInspirationText,
                AreaGuideText,
                PropertyFocusText,
                FoxtonsNewsText,
                LifestyleText,
                LandlordsText,
                SellingText,
                BuyingText,
                RentingText,
                LegislationText,
                PropertyMarketUpdatesText
        };

        assertCategoriesEqual(categoriesArray, expectedTextArray);
    }


    public static void assertCategoriesEqual(String[] actualArray, String[] expectedArray) {
        for (int i = 0; i < expectedArray.length; i++) {
            CommonMethods.assertCustomEquals(expectedArray[i], actualArray[i]);
        }
    }

    public void select_categories_data(){
        //  WebDriverWait wait = new WebDriverWait(driver, 5);
        //  WebDriverWait wait1 = new WebDriverWait(driver, 5);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement HomeInspirationClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomeInspiration)));
        HomeInspirationClickable.click();

        WebElement AreaGuideClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AreaGuide)));
        AreaGuideClickable.click();
        WebElement PropertyFocusClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PropertyFocus)));
        PropertyFocusClickable.click();

        WebElement FoxtonsNewsClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(FoxtonsNews)));
        FoxtonsNewsClickable.click();

        WebElement LifestyleClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Lifestyle)));
        LifestyleClickable.click();

        WebElement LandlordsClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Landlords)));
        LandlordsClickable.click();
        WebElement SellingClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Selling)));
        SellingClickable.click();

        WebElement BuyingClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Buying)));
        BuyingClickable.click();
        WebElement RentingClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Renting)));
        RentingClickable.click();

        WebElement LegislationClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Legislation)));
        LegislationClickable.click();
        WebElement PropertyMarketUpdatesClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PropertyMarketUpdates)));
        PropertyMarketUpdatesClickable.click();

    }

    public void select_categories_relevant_data(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement HomeInspirationClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomeInspiration)));
        HomeInspirationClickable.click();
        System.out.print("Home Inspiration: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement AreaGuideClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AreaGuide)));
        AreaGuideClickable.click();
        System.out.print("Area Guide: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement PropertyFocusClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PropertyFocus)));
        PropertyFocusClickable.click();
        System.out.print("Property Focus: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement FoxtonsNewsClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(FoxtonsNews)));
        FoxtonsNewsClickable.click();
        System.out.print("Foxtons News: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement LifestyleClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Lifestyle)));
        LifestyleClickable.click();
        System.out.print("Lifestyle: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement LandlordsClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Landlords)));
        LandlordsClickable.click();
        System.out.print("Landlords: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement SellingClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Selling)));
        SellingClickable.click();
        System.out.print("Selling: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement BuyingClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Buying)));
        BuyingClickable.click();
        System.out.print("Buying: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement RentingClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Renting)));
        RentingClickable.click();
        System.out.print("Renting: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement LegislationClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Legislation)));
        LegislationClickable.click();
        System.out.print("Legislation: ");
        IsDataAvailable(driver, BlogLandingPage.article);

        WebElement PropertyMarketUpdatesClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PropertyMarketUpdates)));
        PropertyMarketUpdatesClickable.click();
        System.out.print("Property Market Updates: ");
        IsDataAvailable(driver, BlogLandingPage.article);
    }

    public void check_ScrollIsNOtInfinite(){
        CommonMethods.clickCookie(driver);
        ScrollIsNOtInfinite(driver, PropertyMarketUpdates);
    }

    public void navigate_the_forward_or_backword_page(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement ForwardButtonClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ForwardButton)));
        ForwardButtonClickable.click();

        WebElement BackwardButtonClickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BackwardButton)));
        BackwardButtonClickable.click();

        WebElement page2Clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(page2)));
        page2Clickable.click();

        WebElement page3Clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(page3)));
        page3Clickable.click();

        WebElement page4Clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(page4)));
        page4Clickable.click();
    }
    public static void ScrollIsNOtInfinite(WebDriver driver, String element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long initialScrollHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        js.executeScript("function holdFor(h){return new Promise(function(resolve){setTimeout(function(){resolve();}, h);});}" +
                "for(var i=0; i<100; i++){" +
                "   await holdFor(10);" +
                "   window.scrollBy(0, 50);" +
                "   var newScrollHeight = Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );" +
                "   if (newScrollHeight === " + initialScrollHeight + "){" +
                "       break;" +
                "   }" +
                "}" +
                "var result = document.evaluate(\"" + element + "\", document.body, null, XPathResult.ANY_TYPE, null);" +
                "var input = result.iterateNext();" +
                "input.scrollIntoView();" +
                "window.scrollBy(0, -200);", "");

    }
}