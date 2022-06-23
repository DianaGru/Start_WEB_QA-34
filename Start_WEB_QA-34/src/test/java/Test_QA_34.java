import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Test_QA_34 {

    WebDriver wd;

    @Test
    public void start1() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver();
        //System.setProperty("webdriver.chromedrivew", "C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        //if I use chromedrive.exe by code, not by holder"Tools"

        wd.navigate().to("https://trello.com/");

        // wd.close();
        wd.quit();
    }

    @Test
    public void start2() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver();
        //System.setProperty("webdriver.chromedrivew", "C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        //if I use chromedrive.exe by code, not by holder"Tools"

        wd.navigate().to("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        // wd.close();
        wd.quit();

    }

    @Test
    public void start3() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver();
        //System.setProperty("webdriver.chromedrivew", "C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        //if I use chromedrive.exe by code, not by holder"Tools"

        wd.navigate().to("https://trello.com/");

//open login form
        WebElement login = wd.findElement(By.cssSelector("[href='/login']"));
        //xp WebElement loginx = wd.findElement(By.xpath("//*[@href='/login']"));
        login.click();

//fill in login form
        WebElement emailTextbox = wd.findElement(By.cssSelector("#user"));
        //xp WebElement emailTextBoxXp = wd.findElement(By.xpath("//*[@id='user']"));
        emailTextbox.click();
        emailTextbox.clear();
        emailTextbox.sendKeys("dianchik2004@gmail.com");

//confirm email
        WebElement confirmLoginButton = wd.findElement(By.cssSelector("#login"));
        //xp WebElement confirmLoginButton = wd.findElement(By.xpath("//*[@id='login']"));
        confirmLoginButton.click();

//fill in valid password
        WebElement passwordTextbox = wd.findElement(By.cssSelector("#password"));
        //xp WebElement passwordTextbox = wd.findElement(By.xpath("//*[@id='password']"));
        passwordTextbox.click();
        passwordTextbox.clear();
        passwordTextbox.sendKeys("text");

//click loginButton
        WebElement logButton = wd.findElement(By.cssSelector("#login-submit"));
        //xp WebElement loginButton = wd.findElement(By.xpath("//*[@id='login-submit']"));
        logButton.click();
    }

    @Test
    public void start5() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        wd = new ChromeDriver();
        //System.setProperty("webdriver.chromedrivew", "C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        //if I use chromedrive.exe by code, not by holder"Tools"

        wd.navigate().to("https://trello.com/");

//open login form
        WebElement login = wd.findElement(By.cssSelector("[href='/login']"));
        //xp WebElement loginx = wd.findElement(By.xpath("//*[@href='/login']"));
        login.click();

//fill in login form
        WebElement emailTextbox = wd.findElement(By.cssSelector("#user"));
        //xp WebElement emailTextBoxXp = wd.findElement(By.xpath("//*[@id='user']"));
        emailTextbox.click();
        emailTextbox.clear();
        emailTextbox.sendKeys("dianchik2004@gmail.com");

//confirm email
        WebElement confirmLoginButton = wd.findElement(By.cssSelector("#login"));
        //xp WebElement confirmLoginButton = wd.findElement(By.xpath("//*[@id='login']"));
        confirmLoginButton.click();

//view password
        WebElement icon = wd.findElement(By.cssSelector(".css-pxzk9z"));
        //xp WebElement icon = wd.findElement(By.xpath("//*[@class='css-pxzk9z']"));
        icon.click();

//fill in valid password
        WebElement passwordTextbox = wd.findElement(By.cssSelector("#password"));
        //xp WebElement passwordTextbox = wd.findElement(By.xpath("//*[@id='password']"));
        passwordTextbox.click();
        passwordTextbox.clear();
        passwordTextbox.sendKeys("text");

//click loginButton
        WebElement logButton = wd.findElement(By.cssSelector("#login-submit"));
        //xp WebElement loginButton = wd.findElement(By.xpath("//*[@id='login-submit']"));
        logButton.click();
    }


    @Test
    public void test4() {

        //tag
        WebElement el = wd.findElement(By.tagName("a"));
        WebElement els = wd.findElement(By.cssSelector("a"));
        WebElement els2 = wd.findElement(By.cssSelector("div"));

        //id
        WebElement el2 = wd.findElement(By.id("skip-target"));
        WebElement el23 = wd.findElement(By.id("login-form"));
        WebElement els22 = wd.findElement(By.cssSelector("#login-form"));
        WebElement elx1 = wd.findElement(By.xpath("//*[@id='login-form']"));

        //class
        WebElement el3 = wd.findElement(By.className("BigNavstyles__InnerHeader-sc-1mttgq7-2 kuxyBF"));
        WebElement el4 = wd.findElement(By.className("kuxyBF"));
        WebElement elcl1 = wd.findElement(By.cssSelector(".BigNavstyles__InnerHeader-sc-1mttgq7-2 kuxyBF"));
        WebElement elcl12 = wd.findElement(By.cssSelector(".BigNavstyles__InnerHeader-sc-1mttgq7-2"));
        WebElement elcl13 = wd.findElement(By.cssSelector(".kuxyBF"));
        WebElement elx2 = wd.findElement(By.xpath("//*[@class='kuxyBF']"));

        //link
        WebElement el5 = wd.findElement(By.linkText("Log in"));
        WebElement el55 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el555 = wd.findElement(By.cssSelector("[href='/signup']"));
        WebElement el5556 = wd.findElement(By.cssSelector("[data-testid='bignav']"));


        //starts/contains-ends(css)
        WebElement el557 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
        WebElement el559 = wd.findElement(By.cssSelector("[aria-label $='llo']"));//ends
        WebElement el558 = wd.findElement(By.cssSelector("[aria-label ^='Tr']")); //starts
        WebElement el57 = wd.findElement(By.cssSelector("[aria-label *='rell']")); //contains

        //starts/contains-ends(xpath)
        WebElement elxp1 = wd.findElement(By.xpath("//*[@aria-label = 'Trello']"));
        WebElement elxp2 = wd.findElement(By.xpath("//*[contains(@aria-label, 'rell')]"));//contains
        WebElement elxp3 = wd.findElement(By.xpath("//*[starts-with(@aria-label, 'Tr')]"));//starts


    }

    @Test
    public void start() {
        List<WebElement> elm = wd.findElements(By.cssSelector("div"));
        System.out.println(elm.size());

    }

    //.logo_link - logo Trello
    @Test
    public void openTab() {
        WebElement tab = wd.findElement(By.cssSelector("[data-testid='bignav-tab']"));
        //xp WebElement tab = wd.findElement(By.xpath("//[@data-testid='bignav-tab']"));
        tab.click();
        tab.click();
    }

    @Test
    public void logOut() {
        WebElement avatar = wd.findElement(By.cssSelector("[data-test-id = 'header-member-menu-button'"));
        //xp WebElement avatarx = wd.findElement(By.xpath("//*[@data-test-id = 'header-member-menu-button']"));
        avatar.click();
        WebElement logOut1 = wd.findElement(By.cssSelector("[data-test-id = 'header-member-menu-logout']"));
        //xp WebElement logOut1Xp = wd.findElement(By.xpath("//*[@data-test-id='header-member-menu-logout']"));
        logOut1.click();
        WebElement logUot2 = wd.findElement(By.cssSelector("[data-testid='logout-button']"));
        //xp WebElement logOut2Xp = wd.findElement(By.xpath("//*[@data-testid='logout-button']"));
        logUot2.click();
    }

}
