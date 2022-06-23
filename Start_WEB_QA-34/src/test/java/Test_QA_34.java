import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

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
        WebElement login;
        login.click();

//fill in login form
        WebElement emailTextBox;
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("dianchik2004@gmail.com");

//confirm email
        WebElement confirmLoginButton;
        confirmLoginButton.click();

//fill in valid password
        WebElement passwordTextBox;
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("");

//click login button
        WebElement logButton;
        logButton.click();

    }

    @Test
    public void test4() {

        //tag
        WebElement el = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.id("skip-target"));
        WebElement el3 = wd.findElement(By.className("BigNavstyles__InnerHeader-sc-1mttgq7-2 kuxyBF"));
        WebElement el4 = wd.findElement(By.className("kuxyBF"));
        WebElement el5 = wd.findElement(By.linkText("Log in"));


    }

}
