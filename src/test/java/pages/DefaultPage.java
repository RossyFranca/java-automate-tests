package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Configurations.headless;

public class DefaultPage {
    WebDriver driver;

    public DefaultPage(WebDriver driver) {

        this.driver = driver;
    }

    public DefaultPage() {

        ChromeOptions options = new ChromeOptions();
        // utlis.Configuration para setar variável que determina se o chrome irá rodar
        // visualmente ou não
        if (headless)
            options.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver(options);

    }
    public WebDriver getDriver() {
        return driver;

    }
    public void navigateTo(String url) {
        driver.get(url);
        //driver.manage().window().maximize();
    }

    public void closeNavigator() {
        getDriver().close();
    }
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }
    public String getPageTitle() {
        return getDriver().getTitle();

    }
    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();

    }
    public void inputText(By locator, String value) {
        WebElement element = getDriver().findElement(locator);
        element.clear();
        element.sendKeys(value);
    }
    public void click(By locator){
        WebElement element = getDriver().findElement(locator);
        element.click();
    }
    public void waitToElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
