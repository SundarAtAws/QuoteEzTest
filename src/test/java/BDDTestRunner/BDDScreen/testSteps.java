package BDDTestRunner.BDDScreen;



import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import BDDTestRunner.BDDSteps.TestScreen;
import net.thucydides.core.steps.ScenarioSteps;

public class testSteps extends ScenarioSteps{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TestScreen testScreen;
	
	@Given("Launch QUOTEEZ Application")
	public void launchApp() {
		testScreen.launchApp();
	}
	
	@Then("verify application title")
	public void verifyAppTitle() {
		testScreen.verifyAppTitle();
	}

}
