package simple.tast;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Loginuser {
	static WebDriver driver;
	static WebElement run;

	@BeforeClass
	private void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Varun Jagan\\eclipse-workspace\\simple.tast\\src\\test\\java\\simple\\tast\\lib\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	private void userlogin() {
		driver.get("https://www.saucedemo.com/");

		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");

		WebElement passbox = driver.findElement(By.id("password"));
		passbox.sendKeys("secret_sauce");

		WebElement button = driver.findElement(By.id("login-button"));
		button.click();

		String actualtittle = "Swag Labs";
		String expectedtittle = driver.getTitle();

		if (expectedtittle.equals(actualtittle)) {
			System.out.println("login sucessfull");

		} else {
			System.out.println("login failed");
		}

	}

}
