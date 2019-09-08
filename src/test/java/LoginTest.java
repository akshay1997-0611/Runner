import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest {
	WebDriver driver;
	@Given("Here we are on login page")	
	public void here_we_are_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/login");
	}

	@Given("i Enter username as{string}")
	public void i_Enter_username_as(String string) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
	   
	}

	@Given("i Enter password as{string}")
	public void i_Enter_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	   
	}

	@Then("I am logged in")
	public void i_am_logged_in() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	
	}

}
