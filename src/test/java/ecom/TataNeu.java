package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataNeu {
  @Test
  public void tatatest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening tataneu", false);
	  driver.get("https://www.tatadigital.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
}
