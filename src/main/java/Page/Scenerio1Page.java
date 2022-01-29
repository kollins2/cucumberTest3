package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Scenerio1Page {
	WebDriver driver;

	// *[@id="extra"]/button[1]
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement BACKGROUND_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement BACKGROUND_ELEMENT_2;

	public Scenerio1Page(WebDriver driver) {
		this.driver = driver;
	}

	public void BackgroundElementDisplay() {

		System.out.println(BACKGROUND_ELEMENT.isDisplayed() + ":" + "SkyBlue Background button exists");
	}

	public void BackgroundElement() {
		BACKGROUND_ELEMENT.click();
	}

	public void BackgroundElementDisplay_2() {

		System.out.println(BACKGROUND_ELEMENT_2.isEnabled() 
				+ ":" + "SkyWhite Background button exists");

	}

	public void BackgroundElement_2() throws InterruptedException {
		BACKGROUND_ELEMENT.click();
		Thread.sleep(4000);
		BACKGROUND_ELEMENT_2.click();
	}

}