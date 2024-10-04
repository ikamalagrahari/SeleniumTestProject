import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\disha\\Downloads\\chrome-headless-shell-win64\\chrome-headless-shell-win64"); // Replace with the correct path
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the browser window for better visibility
    }
 

    @Test
    public void testGoogle() {
        // Navigate to Google's homepage
        driver.get("https://www.google.com");

        // Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        // Optionally, add an assertion to check if the title is correct
        assertEquals("Expected title does not match!", "Google", title);
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
