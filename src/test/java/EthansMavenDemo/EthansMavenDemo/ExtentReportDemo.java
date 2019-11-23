package EthansMavenDemo.EthansMavenDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
