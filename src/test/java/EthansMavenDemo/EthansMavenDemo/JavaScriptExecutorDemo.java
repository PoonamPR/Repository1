package EthansMavenDemo.EthansMavenDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rightstartmath.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#search-3 > div > form > input.5.search-input').value='abc'");
		

	}

}
