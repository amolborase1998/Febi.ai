
package appFebiai;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputSectionToHelpCenterFebi {
	@Test
	public void ClickOnInputElement() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
//click on InputElement
		driver.findElement(By.xpath("//div[contains(text(),'Input')]")).click();
//click on Suspense
		driver.findElement(By.xpath("//p[contains(text(),'Suspense')]")).click();
//click on Unprocessed Document
		driver.findElement(By.xpath("//span[contains(text(),'Unprocessed Documents')]")).click();
//click on Document Processed
		driver.findElement(
				By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]"))
				.click();
//click on Pending Approval
		driver.findElement(By.xpath("//span[contains(text(),'Pending Approval')]")).click();
//handleing calender
//click on calender option box
//		driver.findElement(By.xpath("//div[@class='sc-crozmw bHHzeq']")).click();
//		driver.findElement(By.xpath("//button[@class='rdrDay rdrDayWeekend rdrDayEndOfWeek rdrDayStartOfMonth']"))
//				.click();
//		driver.findElement(By.xpath("//button[@class='rdrDay rdrDayStartOfMonth']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Set Range')]")).click();
////click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
	}

	@Test
	public void TestJournalVouchers() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on InputElement
		driver.findElement(By.xpath("//div[contains(text(),'Input')]")).click();

//click on Journal Vouchers
		driver.findElement(By.xpath("//p[contains(text(),'Journal Vouchers')]")).click();
//click on Write Off
		driver.findElement(By.xpath("//span[contains(text(),'Write Off')]")).click();
//Thread.sleep(3000);
//click on Provision
		driver.findElement(By.xpath("//span[contains(text(),'Provision')]")).click();
		Thread.sleep(2000);

//click on Unbilled Revenue
		driver.findElement(By.xpath("//span[contains(text(),'Unbilled Revenue')]")).click();
		//click on deffered
		driver.findElement(By.xpath("//span[contains(text(),'Deferred')]")).click();
// //calender handling
//click on calender option box
//		driver.findElement(By.xpath("//div[@class='sc-crozmw bHHzeq']")).click();
//		driver.findElement(By.xpath("//button[@class='rdrDay rdrDayWeekend rdrDayEndOfWeek rdrDayStartOfMonth']"))
//				.click();
//		driver.findElement(By.xpath("//button[@class='rdrDay rdrDayStartOfMonth']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Set Range')]")).click();
////click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
	}

	@Test
	public void FilesTest() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

// //click on Files
		driver.findElement(By.xpath("//p[contains(text(),'Files')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Mp')]")).click();
		

////click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
	}

	@Test
	public void Report() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
// //click on Report
		driver.findElement(By.xpath("//p[contains(text(),'Report')]")).click();
// //click on Report>>>>>Trial Balance<<<<<<<back
		driver.findElement(By.xpath("//h5[contains(text(),'Trial Balance')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/img[1]")).click();
// //click on Balance Sheet>>Open>>Back
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[contains(text(),'Balance Sheet')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
// //click on Profit and Loss>>open>>back
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[contains(text(),'Profit and Loss')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
// //click on DayBookReport
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[contains(text(),'Day Book Report')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();
// //click on General Ledger
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[contains(text(),'General Ledger')]")).click();
		driver.findElement(By.xpath("//div[@class='cursor-pointer']")).click();

// //click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();

		driver.quit();

	}

	
	/*public void faq() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on FAQ's
		driver.findElement(By.xpath("//p[contains(text(),'FAQs')]")).click();

		// signup related problem
		driver.findElement(By.xpath("//div[contains(text(),'Signup')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1.What is the process for sign up for Febi ?')]")).click();
		// signin related problem
		driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1.What is the procedure for sign in for Febi?')]")).click();
		// Email related problem
		driver.findElement(By.xpath("//div[contains(text(),'E-Mail')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1.Is it possible to alter the email address that I')]"))
				.click();
		// Password reset related problem
		driver.findElement(By.xpath("//div[contains(text(),'Password Reset')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1.How to reset forgotten password?')]")).click();
		// for scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		// security related problem
		driver.findElement(By.xpath("//div[contains(text(),'Security')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1.What measures are in place to ensure the securit')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'2.What is the benefit of using end-to-end encrypti')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'3. Do you keep my credit card information on file?')]"))
				.click();

		// click on payment and subcrition
		driver.findElement(By.xpath("//li[contains(text(),'Payment and Subscription')]")).click();
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//div[contains(text(),'1. What are the available options for making payme')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'2. Do you keep my credit card information on file?')]"))
				.click();

		/*driver.findElement(By.xpath("//div[contains(text(),'Subscription')]")).click();
		jse.executeScript("window.scrollBy(0,400)");

		 driver.findElement(By.xpath("//div[contains(text(),'1. What is the payment plan option available and w')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'2.What factors should I consider when choosing the')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'3. Can I change my subscription plan?')]")).click();
	jse.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.xpath("//div[contains(text(),'4.If I cancel my subscription, what happens to my ')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'5. If I cancel my subscription Plan, will I be abl')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'6. How many licenses are included with the purchas')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'7.What is the duration of the trial period?')]")).click(); */

		// click on account management
//		driver.findElement(By.xpath("//li[contains(text(),'Account Management')]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'What information can be edited in the Profile ')]"))
//				.click();
//		driver.findElement(By.xpath("//div[contains(text(),'2. How do I change my contact information, such as')]"))
//				.click();
//		driver.findElement(By.xpath("//div[contains(text(),'3. Can I update my name on my profile?')]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'4. What should I do if I encounter an error while ')]"))
//				.click();
//
//		jse.executeScript("window.scrollBy(0,400)");
//		driver.findElement(By.xpath("//div[contains(text(),'5. How do I update my profile picture or avatar?')]"))
//				.click();
//		driver.findElement(By.xpath("//div[contains(text(),'6. Can I update my email address associated with m')]"))
//				.click();
//		Thread.sleep(2000);
//	//click on Data export&import
//	driver.findElement(By.xpath("//div[contains(text(),'Data Export/Import')]")).click();
//	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[contains(text(),'1. What is the process for importing data into my ')]")).click();

	//click on dashboard
	/*driver.findElement(By.xpath("//div[contains(text(),'Dashboard')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'1. What currency are the transactions processed an')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Is it possible to modify reports?')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'3. How many reports am I going to receive?')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'4. What types of reports will be included in my re')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'5. What are Reports & Dashboards? What are its Ben')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'6. Will I be assigned a specific team or individua')]")).click();
		jse.executeScript("window.scrollBy(0,400)");

		// click on invoicing
		driver.findElement(By.xpath("//div[contains(text(),'Invoicing')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1. What is the process for creating an invoice?')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'2. Does Febi provide bill pay and invoicing servic')]")).click();

		// click on privacy data
		driver.findElement(By.xpath("//li[contains(text(),'Privacy and Data')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1. Where the data is stored in Febi and is it publ')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'2. What information is stored by Febi?')]")).click();

		// click on Technical support
		driver.findElement(By.xpath("//li[contains(text(),'Technical Support')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'1. What are the methods available for raising a su')]"))
				.click();

		// click on System requirements
		driver.findElement(By.xpath("//div[contains(text(),'System requirements')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'1. What are the compatible web browsers for using ')]"))
				.click();
		jse.executeScript("window.scrollBy(0,400)");

		// click on account settings and preferences
		driver.findElement(By.xpath("//li[contains(text(),'Account Settings and Preferences')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1. Can you explain the steps involved in the Febi ')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'2. What is the process for customizing my Profile ')]"))
			.click();
		driver.findElement(By.xpath("//div[contains(text(),'3. Can you explain the functionality of the search')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'4. What is process for archiving or deleting data ')]]"))
				.click();

		// click on TDS
		driver.findElement(By.xpath("//li[contains(text(),'TDS')]")).click();
		jse.executeScript("window.scrollBy(0,-400)");
		driver.findElement(By.xpath("//div[contains(text(),'1. What is Tax Deducted at Source (TDS) and Tax Co')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'2. Due dates for filing TDS/TCS for all forms ?')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'3. What is the penalty for delay or non-filing of ')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'4. What is the information regarding the passwords')]"))
				.click();
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//div[contains(text(),'5. How to convert Justification Report into excel ')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'6. As per Fourth Character, identify the right sta')]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(),'7. What is TRACES?')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'8. I have deducted tax from payments disbursed but')]"))
				.click();
		
		// click on chat with us
		driver.findElement(By.xpath("//span[contains(text(),'Chat with us')]")).click();

		// //click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();

		driver.quit(); */

	

	@Test
	public void helpCenter() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devapp.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padup@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Padup@#123");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on help center
		driver.findElement(By.xpath("//p[contains(text(),'Help Center')]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("	//button[contains(text(),'+ Create New Query')]")).click();
		jse.executeScript("window.scrollBy(0,-400)");
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.click();

		// //click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();

		driver.quit();

	}
}
