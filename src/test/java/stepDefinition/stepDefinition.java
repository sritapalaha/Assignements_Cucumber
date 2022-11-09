package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class stepDefinition {
	
	WebDriver driver = hooksclass.driver;
	
	@Given("User clicks on sign up link")
	public void user_clicks_on_sign_up_link() throws InterruptedException {	   
		
		System.out.println("User navigates to the application");
		driver.get("http://elearningm1.upskills.in/index.php");
		driver.findElement(By.xpath("//a[contains (text(), 'Sign up!')]")).click();
		Thread.sleep(5000);
	}

	@When("User enters {string} firstname {string} lastname {string} email {string} username {string} password and {string} confirmpwd")
	public void user_enters_firstname_lastname_email_username_password_and_confirmpwd(String fname, String lname, String mail, String uname, String pwd, String cnfpwd) {
		
		System.out.println("User enters first name");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		
		System.out.println("User enters last name");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
		
		System.out.println("User enters email");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
		
		System.out.println("User enters username");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		
		System.out.println("User enters password");
		driver.findElement(By.xpath("//input[@name='pass1']")).sendKeys(pwd);
		
		System.out.println("User enters confirm password");
		driver.findElement(By.xpath("//input[@name='pass2']")).sendKeys(cnfpwd);		
		
	}

	@Then("User clicks on register button")
	public void user_clicks_on_register_button() {
		
		System.out.println("User clicks on register button");
		driver.findElement(By.name("submit")).click();
	    
	}
	
	@Then("verify the registartion is successful")
	public void verify_the_registartion_is_successful() {
		
		if (driver.findElement(By.xpath("//a[contains (text(), 'Homepage')]")).isDisplayed())		{
			System.out.println("User successfully registerered and navigated to homepage");		}
		
		else{
			System.out.println("Registration failed please check log for deatils");		}
		
	}

	@Given("User enters {string} username and {string} password")
	public void user_enters_username_and_password(String uname, String pwd) {
		
		System.out.println("User navigates to the application");
		driver.get("http://elearningm1.upskills.in/index.php");
		
		System.out.println("User enters username and password");
		driver.findElement(By.id("login")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("User clicks on login button");
		driver.findElement(By.name("submitAuth")).click();
	}

	@Then("Verify user logged in successfully")
	public void verify_user_logged_in_successfully() {
	   
		if (driver.findElement(By.xpath("//a[contains (text(), 'Homepage')]")).isDisplayed())		{
			System.out.println("User successfully registerered and navigated to homepage");		}
		
		else{
			System.out.println("Registration failed please check log for deatils");		}
	}
	
	@Then("User clicks on inbox link")
	public void user_clicks_on_inbox_link() {
	   
		System.out.println("User clicks on inbox link");
		driver.findElement(By.xpath("//*[@title='Inbox']/parent::a")).click();
	}

	@Then("User clicks on compose mail image")
	public void user_clicks_on_compose_mail_image() {
		
		System.out.println("User clicks on compose mail link");
		driver.findElement(By.xpath("//*[@title='Compose message']")).click();
	   
	}

	@Then("User search for recipient")
	public void user_search_for_recipient() throws InterruptedException {
		
		System.out.println("User search for mail recipient");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("abc");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
	   
	}

	@Then("User enters mail title")
	public void user_enters_mail_title() {
	   
		System.out.println("User enters mail title");
		driver.findElement(By.name("title")).sendKeys("Test Email");
	}

	@Then("User clicks on send message button")
	public void user_clicks_on_send_message_button() {
		
		System.out.println("User clicks on send message");
		driver.findElement(By.name("compose")).click();
	    
	}
	
	@Then("User verify message has been sent successfully")
	public void User_verify_message_has_been_sent_successfully() throws InterruptedException {
		
		if(driver.findElement(By.xpath("//div[contains (@class,'alert alert-success')]")).getText().contains("The message has been sent to"))
		{
			System.out.println("User verified that the message has been sent successfully");
		}
		
		Thread.sleep(3000);
	}
	
	@Then("User clicks on logout button")
	public void User_clicks_on_logout_button() {
		
		System.out.println("User clicks on logout");
		driver.findElement(By.id("logout_button"));
	}
	
}
