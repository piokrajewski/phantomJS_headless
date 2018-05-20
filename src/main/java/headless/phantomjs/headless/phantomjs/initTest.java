package headless.phantomjs.headless.phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class initTest 
{
	@Test
    public void test() {
    	WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
    	driver.get("http://www.google.pl");
    	Assert.assertEquals("Googo", driver.getTitle());
    }
	@Test
    public void test2() {
    	WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
    	driver.get("http://www.google.pl");
    	Assert.assertEquals("Google", driver.getTitle());
    }
	
}
