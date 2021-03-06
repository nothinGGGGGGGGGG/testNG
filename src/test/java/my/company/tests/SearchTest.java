package my.company.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.qameta.allure.Issue;
import my.company.steps.WebDriverSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SearchTest {

    private WebDriverSteps steps;

    @BeforeTest
    public void setUp() throws Exception {
        ChromeDriverManager.getInstance().setup();
        steps = new WebDriverSteps(new ChromeDriver());
    }

    @Test
    @Issue("ISSUE-1")
    public void searchTest() throws Exception {
        steps.openMainPage();
        steps.search("Allure framework");
        steps.makeScreenShot();
        steps.quit();
    }
}

