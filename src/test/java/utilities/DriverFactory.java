package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver getDriverFor(String browser) {

		switch (browser) {
		case ("chrome"): {
			// Adding options to Chromedriver
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			WebDriverManager.chromiumdriver().setup();

			return new ChromeDriver(options);
		}
		case ("safari"): {
			// Adding options to SafariDriver
			SafariOptions options = new SafariOptions();
			options.setUseTechnologyPreview(true);
			System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
			return new SafariDriver(options);
		}
		default:
			System.out.println(" hey hey You forgot to mention the browser");

			return null;

		}

	}

}
