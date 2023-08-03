package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntratest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening myntra", false);
	  driver.get("https://www.myntra.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
}
