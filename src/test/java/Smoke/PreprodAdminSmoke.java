package Smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreprodAdminSmoke {
	@Test (priority = 0)
	public void PreprodAdmin() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		String applicationURL = "https://preadmin.febi.ai/login";

		// Open the application URL
		driver.get("https://preadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// Check if the title of the page is as expected
		String expectedTitle = "Febi.ai";
		String actualTitle = driver.getTitle();
		assert actualTitle.contains(expectedTitle) : "Application title doesn't match the expected title.";
		driver.quit();

	}
	@Test (priority = 1)
	public void preprodAdminLoginLogout() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://preadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sp@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperPar@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Search any company')]")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'( No Pending Files )')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element);
		jse.executeScript("document.getElementById('react-select-2-input');");
		element.click();
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]"))
		.click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
		System.out.println("Smoke Test: Login functionality - PASS"); 
	} 

	
}
