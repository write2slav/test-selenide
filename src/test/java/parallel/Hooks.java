package parallel;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.DriverFactory;

public class Hooks {
	// Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setup(String browser) throws MalformedURLException {
		// Set Browser to ThreadLocalMap
		driver.set(DriverFactory.getDriverFor(browser));
	}

	public WebDriver getDriver() {
		// Get driver from ThreadLocalMap
		return driver.get();
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@AfterClass
	void terminate() {
		// Remove the ThreadLocalMap element
		driver.remove();
	}
}