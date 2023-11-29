package appFebiai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usermanagentUser {
	public void usermanagementUsers() throws InterruptedException{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		Thread.sleep(3000);

		//user managments click
		WebElement l = driver.findElement(By.xpath("//div[contains(text(),'User Management')]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", l);
		Thread.sleep(1000);
		
		//click on users
		WebElement l1 = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div[1]/a[1]/img[1]"));
		j.executeScript("arguments[0].click();", l1);
		Thread.sleep(1000);

		//click filter
				driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
				//search by name
				driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
				driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test User");
				
				driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
				
				//click on rset 
				driver.findElement(By.xpath("//span[contains(text(),'Reset')]")).click();
				
				driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
				
				driver.quit();
			
	}
		@Test
		public void AddUser() throws InterruptedException {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://devapp.febi.ai/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			//Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padup@febi.ai");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Padup@#123");
			driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

			Thread.sleep(3000);

			//user managments click
			WebElement l = driver.findElement(By.xpath("//div[contains(text(),'User Management')]"));
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();", l);
			Thread.sleep(1000);
			
			//click on users
			WebElement l1 = driver.findElement(By.xpath(
					"//body/div[@id='root']/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div[1]/a[1]/img[1]"));
			j.executeScript("arguments[0].click();", l1);
			Thread.sleep(1000);
			
			//click on Add user
			driver.findElement(By.xpath("//button[contains(text(),'+ Add')]")).click();
			
			driver.findElement(By.xpath("//div[contains(text(),'Select Role')]")).click();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Executive')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
					element);
			jse.executeScript("document.getElementById('react-select-11-input');");
			element.click();
			
			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Vivek sharma");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vivek008@febi.ai");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1998");
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9987615690");
			//Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,2000)");
//			WebElement l5 = driver.findElement(By.xpath(
//					"//span[contains(text(),'Save Role')]"));
//			j.executeScript("arguments[0].click();", l5);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.sc-uVWWZ.jjhTLo:nth-child(4) div.display-flex.flex-col div.overflow-auto form:nth-child(1) div.display-flex.justify-content-center.p-20:nth-child(3) button.continue-btn.w-100per.w-143 > span.display-flex.justify-content-center.align-items-center.Button-seg-16pt")).click();
			
			
			driver.quit();
			
			
		}
	}


