package steps;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Page.Scenerio1Page;
import Page.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scensrioTest_2StepDefination extends TestBase {
	Scenerio1Page scenerioPage;
	@Given("{string} button exists")
	public void button_exists(String string) throws InterruptedException {
		initDriver();
		scenerioPage = PageFactory.initElements(driver, Scenerio1Page.class);
		  scenerioPage.BackgroundElementDisplay_2();
	}

	@When("I click on the button")
	public void i_click_on_the_button() throws InterruptedException {
		scenerioPage.BackgroundElement_2();
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() throws IOException, InterruptedException {
		 takeScreenshot();	
		 Thread.sleep(5000);
		 tearDown();
	
	
	}

	
	} 
	
 

