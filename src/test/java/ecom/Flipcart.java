package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void flipcartTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening flipcart", false);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
}
