package Smoke;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductionUserSmoke {
	
	@Test(priority = 0)
	public void produser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		String applicationURL = "https://app.febi.ai/login";

		// Open the application URL
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// Check if the title of the page is as expected
		String expectedTitle = "Febi.ai";
		String actualTitle = driver.getTitle();
		assert actualTitle.contains(expectedTitle) : "Application title doesn't match the expected title.";
		driver.quit();

	}

	@Test (priority = 1)
	public void ProductionuserLoginUploadInvoiceSuspenseJVFilesReportsFAQHelpcenterLogout() throws InterruptedException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Select Branch')]")).click();

		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
//		robot.keyPress(KeyEvent.VK_J);
//		robot.keyRelease(KeyEvent.VK_J);
//		robot.keyPress(KeyEvent.VK_U);
//		robot.keyRelease(KeyEvent.VK_U);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_M);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_R);
//		robot.keyPress(KeyEvent.VK_G);
//		robot.keyRelease(KeyEvent.VK_G);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//click on upload 
		driver.findElement(By.xpath("//p[contains(text(),'Upload')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Uploaded Documents')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Duplicate Documents')]")).click();
		
		//click on invoice 
		driver.findElement(By.xpath("//p[contains(text(),'Invoices')]")).click();
		//click on user management 
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Roles')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Users')]")).click();
		
		//click on input
		driver.findElement(By.xpath("//div[contains(text(),'Input')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Suspense')]")).click();
		//driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(3) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.suspense div.b-g-white.p-t-30.p-39.p-b-55:nth-child(2) div.display-flex.flex-row-wrap.justify-content-md-between.dashboard-heading-border.justify-content-center div.display-flex.col-gap-23.whitespace-nowrap.flex-wrap.flex-md-nowrap div.p-l-r-20.border-faq-input.border-radius-5.h-33.display-flex.justify-content-center.align-item-center.cursor-pointer.mb-3.w-100per.b-g-darkBlue.color-white:nth-child(2) > span.font-14pt.max-1540-font-12pt")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Pending Approval')]")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Journal Vouchers')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Provision')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Unbilled Revenue')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Deferred')]")).click();
		
		//click on  files
		driver.findElement(By.xpath("//p[contains(text(),'Files')]")).click();
		//click on reports
		driver.findElement(By.xpath("//p[contains(text(),'Report')]")).click();
		//click on Report>>>>>Trial Balance<<<<<<<back
		driver.findElement(By.xpath("//h5[contains(text(),'Trial Balance')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
		//click on Balance Sheet>>Open>>Back
		driver.findElement(By.xpath("//h5[contains(text(),'Balance Sheet')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
		//click on Profit and Loss>>open>>back
		driver.findElement(By.xpath("//h5[contains(text(),'Profit and Loss')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
		//click on DayBookReport
		driver.findElement(By.xpath("//h5[contains(text(),'Day Book Report')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
		//click on General Ledger
		driver.findElement(By.xpath("//h5[contains(text(),'General Ledger')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
		
		driver.findElement(By.xpath("//h5[contains(text(),'Expense Abnormality')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
//		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
//		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/img[1]")).click();
	
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,2000)");
		//Thread.sleep(2000);
		//click on FAQ's
		//driver.findElement(By.xpath("//p[contains(text(),'FAQs')]")).click();
				
		//click on help center 
		//driver.findElement(By.xpath("//p[contains(text(),'Help Center')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
		System.out.println("Smoke Test: Login functionality - PASS");
	}


}
