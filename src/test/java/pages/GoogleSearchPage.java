package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class GoogleSearchPage {
    protected WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    //    private By googleSearch = By.xpath("//textarea[@title='Поиск']");
    @FindBy(xpath = "//textarea[@title='Поиск']")
//    @CacheLookup
    WebElement googleSearch;

    public WebElement enterText(String text) {
//        WebElement searchBox = driver.findElement((By) googleSearch);
        googleSearch.sendKeys(text);
        return googleSearch;
    }


}
