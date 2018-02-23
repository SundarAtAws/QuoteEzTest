package BDDTestRunner;

import net.serenitybdd.jbehave.SerenityStories;

public class BDDTestRunner extends SerenityStories{
	public BDDTestRunner() {
		String stories=System.getProperty("stories");
		if(stories!=null) {
			findStoriesCalled("**/stories/"+stories);
		}
	}

}
