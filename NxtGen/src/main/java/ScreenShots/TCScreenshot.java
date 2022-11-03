package ScreenShots;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import BaseClass.baseclass;

public class TCScreenshot extends baseclass {
	public static void TSCScreenshot(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot anu = (TakesScreenshot) anusha;
				File Anusha = anu.getScreenshotAs(OutputType.FILE);
				File dest = new File("./ScreenShot/Screenshot" + "_"+result.getClass() + "_OF_"+ result.getName() + ".png");
				FileUtils.copyFile(Anusha, dest);
				System.out.println("The screenshot taken as......" + result.getName());
			} catch (Exception e) {
				System.out.println("" + e.getMessage());
			}
		}
	}

}
