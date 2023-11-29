package appFebiai;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	@Test
	public void uploaddiffway() throws AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		//for upload
		driver.findElement(By.xpath("//p[contains(text(),'Upload')]")).click();
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Browse File')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		//copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\HP\\Desktop\\TY.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//perform control + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)"); 
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]/span[1]")).click();
		driver.close();
	}
		@Test
		public void uploadedDoc() {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://app.febi.ai/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
			driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Upload')]")).click();
		// uploaded documents
		driver.findElement(By.xpath("//span[contains(text(),'Uploaded Documents')]")).click();
		System.out.println("uploaded documents");
		driver.quit();		
		}
		
		@Test
		public void dublicateDoc() {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://app.febi.ai/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
			driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Upload')]")).click();
		// looking dublicate documents
		driver.findElement(By.xpath("//span[contains(text(),'Duplicate Documents')]")).click();
		System.out.println("Dublicate documents");
		driver.close();
		}
		
		
		@Test
		public void missingDoc() {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://devapp.febi.ai/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padup@febi.ai");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Padup@#123");
			driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Upload')]")).click();
		// missing documents
		driver.findElement(By.xpath("//span[contains(text(),'Missing Documents')]")).click();
		System.out.println("Missing documents");
		driver.close();
		}
}




