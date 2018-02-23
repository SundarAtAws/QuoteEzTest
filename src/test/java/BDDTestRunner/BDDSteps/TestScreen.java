package BDDTestRunner.BDDSteps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;

public class TestScreen extends net.thucydides.core.pages.PageObject{
	/**
	 * 
	 */
	WebDriver driver;
	
	public void launchApp() {
		getDriver().get("http://quoteez-env.us-east-1.elasticbeanstalk.com/main/welcome");
		getDriver().manage().window().maximize();
	}
	
	public void verifyAppTitle() {
		assertEquals("QuoteEz",getDriver().getTitle());
	}

}
