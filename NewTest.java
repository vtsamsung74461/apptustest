package testngselenium.project.suites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\OneDrive\\Desktop\\project\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
		WebDriverManager.chromiumdriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement search=   driver.findElement(By.className("gLFyf"));
		search.click();
		search.sendKeys("test automation");
		search.sendKeys(Keys.RETURN);
		

	}
}
