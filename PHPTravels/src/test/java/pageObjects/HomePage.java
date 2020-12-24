package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class HomePage {
	
	@FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXT")
	public WebElement origin;

	public static Logger logger=LogManager.getLogger(HomePage.class.getName());


	public WebDriver driver;
	
	
     
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
  

	@Test
	public void clickonSource() {

		try {
			origin.click();
			logger.info("Clicked on the source button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

}
