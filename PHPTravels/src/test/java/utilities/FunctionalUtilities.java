package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FunctionalUtilities {
	
	
	public WebDriver driver;
	
	Properties prop=Filereader.getProperty();

	
public  WebDriver getDriver(){
		
		String browser=null;
		browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
			ChromeOptions c=new ChromeOptions();
			DesiredCapabilities dc=DesiredCapabilities.chrome();
			dc.acceptInsecureCerts();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			//c.addArguments("headless");
			c.merge(dc);
			driver=new ChromeDriver(c);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//System.out.println(driver+" from main class");
	return driver;
	}
public String getScreenshot(String scenarioname,WebDriver driver) {
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
	 

	 String destinationFile=System.getProperty("user.dir")+"\\reports\\"+scenarioname+".png";
	 try {
		org.apache.commons.io.FileUtils.copyFile(source, new File(destinationFile));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return destinationFile;
}
public  void hitUrl() {
	getDriver();
	String url=null;
	url =prop.getProperty("url");
	driver.get(url);
	
}
public WebDriver driver() {
	return driver;
}

}
