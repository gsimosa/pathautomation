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

public class seleniumtest {

    //test
    

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
    public void AswpagecheckTitle()
    {
       String expectedcomtittle = "Google";
       driver.get("https://www.google.com");
       assertEquals(expectedcomtittle, driver.getTitle());
    }

    @Test
    public void openTheorgpageAnddcheckTitle()
    {
        String expectedorgtittle = "Mercado Libre Colombia";

        driver.get("https://www.mercadolibre.com.co/");
        assertEquals(expectedorgtittle,driver.getTitle());

    }

}

