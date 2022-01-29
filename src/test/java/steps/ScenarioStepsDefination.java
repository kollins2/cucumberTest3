package steps;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Scenerio1Page;
import Page.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class ScenarioStepsDefination extends TestBase{
	
	Scenerio1Page scenerioPage;

	//@Test(priority=2)
	@Given("Set SkyBlue Background button exists")
	public void set_SkyBlue_Background_button_exists() {
		 initDriver();
		 scenerioPage = PageFactory.initElements(driver, Scenerio1Page.class);
		  scenerioPage.BackgroundElementDisplay();
	}
//@Test(priority=3)
	@When("User click on the button")
	public void user_click_on_the_button() {
	    
	  scenerioPage.BackgroundElement();
	}
//@Test(priority=4)
	@Then("User Should able to change background color will change to sky blue")
	public void user_Should_able_to_change_background_color_will_change_to_sky_blue() throws IOException, Throwable  {
	    
	 takeScreenshot();	
		 Thread.sleep(5000);
		 tearDown();
}
	 



}