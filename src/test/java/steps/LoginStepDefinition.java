package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginpage;
	
	
	@Given ("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		
		initDriver();
		
		
		
	}
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginpage.insertPassword(password);

	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginpage.clickOnSigningButton();

	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expected = "Dashboard";
		String actual = driver.findElement(By.cssSelector("div[class='panel-title'] strong")).getText();
		Assert.assertEquals(expected, actual);
		

	}

}
