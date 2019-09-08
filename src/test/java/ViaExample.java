import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ViaExample {
	WebDriver driver;
	@Given("Here we are on login")
	public void here_we_are_on_login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/login");	
	}

	@Given("i Enter username {string}")
	public void i_Enter_username(String string) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
		
	}

	@Given("i Enter password {string}")
	public void i_Enter_password(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
		
	}

	@Then("I am log in")
	public void i_am_log_in() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	    
	}

}
