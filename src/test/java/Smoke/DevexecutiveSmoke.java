package Smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevexecutiveSmoke {
	@Test(priority = 0)
	public void DevExecutive() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		String applicationURL = "https://devexecutive.febi.ai/login";

		// Open the application URL
		driver.get("https://devexecutive.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// Check if the title of the page is as expected
		String expectedTitle = "Febi.ai";
		String actualTitle = driver.getTitle();
		assert actualTitle.contains(expectedTitle) : "Application title doesn't match the expected title.";
		driver.quit();

	}
	
	@Test(priority = 1)
	public void devexeLoginLogout() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devexecutive.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automation@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1998");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
		System.out.println("Smoke Test: Login functionality - PASS");
		
	}

}


