package headless.phantomjs.headless.phantomjs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHeadless {
	@Test
	public void test12() {
		ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:\\Users\\bantam\\Downloads\\eclipse\\chromedriver.exe");
		options.addArguments("window-size=1400,800");
		options.addArguments("--headless");

		
		WebDriver driver = new ChromeDriver(options);
				
		driver.get("http://www.google.pl");
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.xpath("(//div//h3)[1]")).click();
		Assert.assertEquals(driver.getTitle(), "Selenium");
	}
}
