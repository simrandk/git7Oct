package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPOMTest {
	WebDriver driver;
	@Given("^user is on herokuApp$")
	public void user_is_on_herokuApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		
		LoginOR obj = new LoginOR(driver);
		obj.usern.sendKeys("tomsmith");
		obj.password.sendKeys("SuperSecretPassword!");
		obj.login.click();
		
		
		
		/*
		driver.findElement(By.id("username")).sendKeys("tomsmith");;
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");;
		driver.findElement(By.className("radius")).click();*/
	}

	@Then("^user logged in successful$")
	public void user_logged_in_successful() throws Throwable {
		System.out.println("user logged in successfully");

	}

}
