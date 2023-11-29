package appFebiai;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardEditProfile {

	@Test
	public void editDashboard() throws InterruptedException, Throwable {
		System.out.println("Launching the Browser and accessing the Application URL");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
// System.setProperty("webdriver.chrome.driver",
// "D:\\Acceration\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String st = driver.getTitle();
		System.out.println(st);
		driver.findElement(By.xpath("//div[contains(text(),'AM')]")).click();

// for upload profile pic
		WebElement button = driver.findElement(By.xpath("//label[contains(text(),'Edit Picture')]"));

		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();

		Robot rb = new Robot();
		rb.delay(2000);
// copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\HP\\Desktop\\3135715.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
// perform control + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
// click for edit username
		driver.findElement(By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt color-darkBlue text-underline']"))
				.click();
//		driver.findElement(By.xpath("//input[@id='name']")).clear();
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Amir Khan");
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		Thread.sleep(3000);
// for change password
//		driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
//		Thread.sleep(3000);
//		// Enter Old Password
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[2]/div[1]/input[1]"))
//				.sendKeys("Admin@#866"); // Admin@#866
//		// Enter New Password
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[2]/div[2]/input[1]"))
//				.sendKeys("Admin@#867");
//		// Confirm new password
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[2]/div[3]/input[1]"))
//				.sendKeys("Admin@#867");
//		Thread.sleep(3000);
//		// for update password button
//		driver.findElement(By.xpath("//span[contains(text(),'Update Password')]")).click();

// for pan details
		driver.findElement(By.xpath("//span[contains(text(),'PAN')]")).click();
		System.out.println("pan detail success");

// for GST details click GST
		driver.findElement(By.xpath("//span[contains(text(),'GST')]")).click();

//		// for edit GST
//		driver.findElement(By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt  color-darkBlue text-underline']"))
//				.click(); // for add GST Number
//		driver.findElement(By.xpath("//*[@class='color-blue font-18pt']")).click();
//		// Then open another section for add GST Number we send Another GST Number In
//		// GST field
//
//		driver.findElement(By.xpath("//input[@id='gstArray.1.gstin']")).sendKeys("29AAFCB7707D1ZQ");
//		jse.executeScript("window.scrollBy(0,400)");
//// click on update button
//		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
//
//		// Delete GST if 2 GST NUmber
//		driver.findElement(By.cssSelector(
//				"div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(3) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.display-flex.flex-col.w-100-per.m-t-30.profile:nth-child(2) div.b-g-color.display-flex.w-100per.h-auto.p-b-55.b-g-white.small-desk.h-100-vh.flex-col:nth-child(2) div.display-flex.flex-col.justify-content-center div.display-flex.justify-content-center:nth-child(2) form.display-flex.justify-content-center.align-item-center.w-70per.m-t-56.flex-col div.display-flex.flex-col.row-gap-10.w-100per:nth-child(3) div.display-flex.justify-content-space-between.m-t-18:nth-child(1) div.display-flex.flex-row.col-gap-2 > span.Button-seg-12pt.max-1540-font-10pt.text-underline.color-red:nth-child(1)"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
//		jse.executeScript("window.scrollBy(0,-400)");
//		System.out.println("GST extra add deleted detail success");

		Thread.sleep(2000);

//// // for edit entity details
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[4]"))
				.click();
		System.out.println("entity details detail success");

// click on bank details
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[5]"))
				.click();
// for edit bank details

//		WebElement ele2 = driver.findElement(
//				By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt color-darkBlue text-underline']"));
//		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//		executor1.executeScript("arguments[0].click();", ele2);
////driver.findElement(By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt color-darkBlue text-underline']")).click();
//		Thread.sleep(2000);
//		System.out.println("Pen button success");
//
//// for add new bank details + button
//		driver.findElement(By.xpath("//*[@class='color-blue font-18pt']")).click();
//		System.out.println("+  button success");
//		Thread.sleep(2000);
//// for add new bank details
//		driver.findElement(By.xpath("//input[@id='bankDetails.1.accountHolder']")).sendKeys("Amol Borase");
//		driver.findElement(By.xpath("//input[@id='bankDetails.1.accountNumber']")).sendKeys("60172931071");
//		driver.findElement(By.xpath("//input[@id='bankDetails.1.branchName']")).sendKeys("Ajang Vadel");
//		driver.findElement(By.xpath("//input[@id='bankDetails.1.ifsc']")).sendKeys("MAHB0000762");
//		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
//		System.out.println("update  button for add account success");
//		Thread.sleep(2000);
////delet extra bank detail added
//		WebElement ele8 = driver.findElement(
//				By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt color-darkBlue text-underline']"));
//		JavascriptExecutor executor8 = (JavascriptExecutor) driver;
//		executor8.executeScript("arguments[0].click();", ele8);
//		jse.executeScript("window.scrollBy(0,400)");
////click on delet symbol
//		driver.findElement(By.cssSelector(
//				"div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(3) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.display-flex.flex-col.w-100-per.m-t-30.profile:nth-child(2) div.b-g-color.display-flex.w-100per.h-auto.p-b-55.b-g-white.small-desk.h-100-vh.flex-col:nth-child(2) div.display-flex.flex-col.justify-content-center div.display-flex.justify-content-center:nth-child(2) div.display-flex.w-70per.m-t-56.flex-col div.m-t-10:nth-child(6) div.display-flex.justify-content-space-between.m-t-18 div.display-flex.flex-row.col-gap-2 span.Button-seg-12pt.max-1540-font-10pt.text-underline.color-red:nth-child(1) div:nth-child(1) > img.h-15"))
//				.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
//		System.out.println("update  button for delet account success");
//		jse.executeScript("window.scrollBy(0,-400)");
//		Thread.sleep(1000);

// // for credentials
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[6]"))
				.click();

//		// for edit credential
//		driver.findElement(By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt color-darkBlue text-underline']"))
//				.click();
//
//		// for income tax user name
//		driver.findElement(By.xpath("//input[@id='incomeTax.username']")).sendKeys("aborase"); // for income tax
//																								// password
//		driver.findElement(By.xpath("//input[@id='incomeTax.password']")).sendKeys("Amol@1998"); // for income TAN
//																									// Number
//		driver.findElement(By.xpath("//input[@id='tan.0.tanId']")).sendKeys("Amol199835");
//
//		jse.executeScript("window.scrollBy(0,400)"); // for Traces user ID
//		driver.findElement(By.xpath("//input[@id='tan.0.username']")).sendKeys("AB12345"); // for Traces Password
//		driver.findElement(By.xpath("//input[@id='tan.0.password']")).sendKeys("Amol@1998"); // for scrolldown
//
//		jse.executeScript("window.scrollBy(0,400)");
//
//// for GST Number
//		driver.findElement(By.xpath("//input[@id='gstin.0.gstNo']")).sendKeys("18AABCU9603R1ZM"); // for GST User ID
//		driver.findElement(By.xpath("//input[@id='gstin.0.username']")).sendKeys("Febi.ai"); // for GST Password
//		driver.findElement(By.xpath("//input[@id='gstin.0.password']")).sendKeys("Febi@#123"); // for ROC User name
//		driver.findElement(By.xpath("//input[@id='roc.username']")).sendKeys("U72200MH2009PLC123456"); // for ROC user
//																										// password
//		driver.findElement(By.xpath("//input[@id='roc.password']")).sendKeys("From@1234");
//
//		// for update button
//		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
//		jse.executeScript("window.scrollBy(0,-400)");
//
//// for others details
//		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[7]"))
//				.click();
//// Edit Other details pen
//		driver.findElement(By.xpath("//*[@class='Button-seg-12pt max-1540-font-10pt color-darkBlue text-underline']"))
//				.click();
// Edit Mobile Number
		driver.findElement(By.xpath("//input[@id='mob']")).click();
		driver.findElement(By.xpath("//input[@id='mob']")).clear();
		driver.findElement(By.xpath("//input[@id='mob']")).sendKeys("9876543453");
// after edit update mobile number
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		System.out.println("mobile number update");
		Thread.sleep(1000);
// upload another MSME certificate
//		WebElement button1 = driver.findElement(By.cssSelector(
//				"div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(3) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.display-flex.flex-col.w-100-per.m-t-30.profile:nth-child(2) div.b-g-color.display-flex.w-100per.h-auto.p-b-55.b-g-white.small-desk.h-100-vh.flex-col:nth-child(2) div.display-flex.flex-col.justify-content-center div.display-flex.justify-content-center:nth-child(2) div.display-flex.w-70per.m-t-56.flex-col div.display-flex.flex-col div.m-t-10:nth-child(2) div.display-flex:nth-child(2) > label.cursor-pointer.w-125.h-38.b-g-darkBlue.fw-400.color-white-opacity-50.font-13pt.display-flex.justify-content-center.align-items-center.choose-file"));
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(button1).click().perform();
//		Robot rb1 = new Robot();
//		rb1.delay(2000);
//		StringSelection ss1 = new StringSelection("C:\\Users\\HP\\Desktop\\ICICI_Format_1.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		System.out.println("update file 1 ");
//// copy file to clipboard
//// Upload another Existing Accounting Data (Tally Data / Other Accounting)
//		WebElement button2 = driver.findElement(By.cssSelector(
//				"div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(3) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.display-flex.flex-col.w-100-per.m-t-30.profile:nth-child(2) div.b-g-color.display-flex.w-100per.h-auto.p-b-55.b-g-white.small-desk.h-100-vh.flex-col:nth-child(2) div.display-flex.flex-col.justify-content-center div.display-flex.justify-content-center:nth-child(2) div.display-flex.w-70per.m-t-56.flex-col div.display-flex.flex-col div.m-t-10:nth-child(3) div.display-flex:nth-child(2) > label.cursor-pointer.w-125.h-38.b-g-darkBlue.fw-400.color-white-opacity-50.font-13pt.display-flex.justify-content-center.align-items-center.choose-file"));
//		Actions act2 = new Actions(driver);
//		act2.moveToElement(button2).click().perform();
//		Robot rb2 = new Robot();
//		rb2.delay(2000);
//		StringSelection ss2 = new StringSelection("C:\\Users\\HP\\Desktop\\ICICI_Format_1.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
//
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		System.out.println("update file 2");

//click on Logout
		driver.findElement(By.xpath("//p[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();

// This testcase can't be automate (whatsApp Details)
		/*
		 * //for whatsapp details driver.findElement(By.xpath(
		 * "//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[8]"
		 * )).click(); //click add what's App Number
		 * driver.findElement(By.xpath("//span[contains(text(),'Add WhatsApp Mobile')]")
		 * ).click();
		 *
		 * Alert at = driver.switchTo().alert(); //This testcase can't be automate
		 * (whatsApp Details) //click mobile number
		 * driver.findElement(By.xpath("//input[@id='mobile']")).click(); //enter mobile
		 * number
		 * driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9988776655");
		 * //click on submit button
		 * driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click(); //
		 * after enter OTP click submit button
		 * driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		 *
		 * //for delete what's app details driver.findElement(By.xpath(
		 * "//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/span[1]/div[1]/img[1]"
		 * )).click(); Alert at1 = driver.switchTo().alert(); //If delete whats app
		 * number
		 * driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click(); //if
		 * not delete whats app number
		 * driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		 */

	}

}