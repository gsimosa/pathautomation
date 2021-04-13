package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)

public class WithAssertionsTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll (){
        driver.quit();
    }


    @Test
    public void FirstAssertionsTest()
        {
            String aswtittle = "Soluciones inteligentes | IT Services | Transformación digital - Asesoftware";
            driver.get("https://asesoftware.com/");
            assertEquals(aswtittle,driver.getTitle());
        }
}
