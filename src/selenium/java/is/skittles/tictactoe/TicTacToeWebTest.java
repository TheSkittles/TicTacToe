package is.skittles.tictactoe;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TicTacToeWebTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = System.getenv("baseUrl");
      if (baseUrl != null) {
          baseUrl = "https://skittles-staging.herokuapp.com";
      }    
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
  }

  @Test
  public void testCellAlreadyUsed() throws Exception {
    driver.get(baseUrl + "/?marks=00");
    assertEquals(1, driver.findElements(By.cssSelector("p.error")).size());
  }

  @Test
  public void testNoDrawIfWinner() throws Exception {
    driver.get(baseUrl + "/?marks=462038157");
    assertEquals(1, driver.findElements(By.cssSelector("p.winner")).size());
    assertEquals(0, driver.findElements(By.cssSelector("p.draw")).size());
  }

  @Test
  public void testNoInsultForUnoriginalMarks() throws Exception {
    driver.get(baseUrl + "/?marks=0123");
    assertEquals(0, driver.findElements(By.cssSelector("p.error")).size());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

