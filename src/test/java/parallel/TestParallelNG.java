package parallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

import org.openqa.selenium.By;


public class TestParallelNG extends Hooks{

//	@Ignore("Ignored")
//	@Test
//	public void mailTest() throws MalformedURLException, InterruptedException {
//		DesiredCapabilities dr = new DesiredCapabilities();
//
//		dr.setBrowserName("chrome");
//		dr.setPlatform(Platform.MAC);
//
//		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
//		driver.navigate().to("http://google.com");
//
//		Thread.sleep(10000);
//		driver.findElement(By.name("q")).sendKeys("username");
//		driver.close();
//		driver.quit();
//
//	}
	@Test
	@Parameters({ "browser" })
	public void paralelTest(String browserType) throws MalformedURLException, InterruptedException {
		System.out.println(browserType);
		System.out.println("Test2Thread"+Thread.currentThread().getId());

		
		getDriver().navigate().to("http://google.com");

		getDriver().findElement(By.name("q")).sendKeys(String.valueOf(Thread.currentThread().getId()));
		Thread.sleep(3000);
	}
	@Test
	@Parameters({ "browser" })
	public void paralelTest1(String browserType) throws MalformedURLException, InterruptedException {
		System.out.println(browserType);
		System.out.println("Test1Thread "+Thread.currentThread().getId());
		
		super.getDriver().navigate().to("http://yandex.ru");

		super.getDriver().findElement(By.id("text")).sendKeys(String.valueOf(Thread.currentThread().getId()));
		Thread.sleep(3000);

	}
	
	@Test
	@Parameters({ "browser" })
	public void paralelTest3(String browserType) throws MalformedURLException, InterruptedException {
		System.out.println(browserType);
		System.out.println("Test3Thread "+Thread.currentThread().getId());
		
		super.getDriver().navigate().to("http://yandex.ru");

		super.getDriver().findElement(By.id("text")).sendKeys(String.valueOf(Thread.currentThread().getId()));
		Thread.sleep(3000);

	}
	@Test
	@Parameters({ "browser" })
	public void paralelTest4(String browserType) throws MalformedURLException, InterruptedException {
		System.out.println(browserType);
		System.out.println("Test4Thread "+Thread.currentThread().getId());
		
		super.getDriver().navigate().to("http://yandex.ru");

		super.getDriver().findElement(By.id("text")).sendKeys(String.valueOf(Thread.currentThread().getId()));
		Thread.sleep(3000);

	}
	@Test
	@Parameters({ "browser" })
	public void paralelTest5(String browserType) throws MalformedURLException, InterruptedException {
		System.out.println(browserType);
		System.out.println("TestThread "+Thread.currentThread().getId());
		
		super.getDriver().navigate().to("http://yandex.ru");

		super.getDriver().findElement(By.id("text")).sendKeys(String.valueOf(Thread.currentThread().getId()));
		Thread.sleep(3000);

	}

}
