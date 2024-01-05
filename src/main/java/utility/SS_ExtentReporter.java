package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SS_ExtentReporter {
	
	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Automation Report");
		report.config().setDocumentTitle("Test Reports");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Test Engineer","Rajat");
		return extent;
		
	}

}
