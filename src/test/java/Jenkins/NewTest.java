package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void launchBrowser() {
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");


		ExtentHtmlReporter htmlreporter= new ExtentHtmlReporter ("F:\\Report\\batch.html");
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(htmlreporter);
		ExtentTest logger = report.createTest("Aut_VerifyLoginToFlightApp","Verify user is able to login successfully in Flight app");
		
		logger.log(Status.PASS, "flight app url is launched");
		logger.log(Status.PASS, "Successfully enter username");
		logger.log(Status.PASS, "Successfully enter password");
		logger.log(Status.PASS, "click on login button");
		
		report.flush();
		
  }
  
  @Test
  public void launchBrowser1() {
	  System.out.println("Hello1");
  }
}
