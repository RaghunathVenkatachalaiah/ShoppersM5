package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SS_Listeners extends SS_BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		String failedMethod=result.getMethod().getMethodName().toString();
		String timeDateStamp=LocalDateTime.now().toString().replace(':','-');
		TakesScreenshot ss=(TakesScreenshot)driver;
		File tempFile=ss.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./src/test/resources/screenshots/"+failedMethod+timeDateStamp+".png");
		try {
			FileHandler.copy(tempFile, destFile);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	

}
