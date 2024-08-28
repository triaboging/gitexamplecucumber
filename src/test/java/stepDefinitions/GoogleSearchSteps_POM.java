package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

import java.time.Duration;

public class GoogleSearchSteps_POM {
    static WebDriver driver;
    static GoogleSearchPage googleSearchPage;


    @Before
    public void setup() {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        googleSearchPage = new GoogleSearchPage( driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterStep
    public void afterStepMethod(){
        System.out.println("afterStepMethod");
    }


    @Given("^input search (.*)$")
    public void input_search_string(String string) {
        driver.get("http://google.com");
        WebElement el = googleSearchPage.enterText(string);
        el.sendKeys(Keys.ENTER);
//        WebElement el = driver.findElement(By.xpath("//textarea[@title='Поиск']"));
//        el.sendKeys("Ловля сома на днепре", Keys.ENTER);


    }

    @Then("^compare expected (.*)$")
    public void compare_expected_result(String result) {
        String title = driver.getTitle();
        Assert.assertEquals("результаты не сходятся", title, result);


    }


}
