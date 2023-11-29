package devAdminFebiAi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userManagement {
	@Test
	public void Role() throws InterruptedException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(text(),'Search any company')]")).click();
//
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'PADUP VENTURES PRIVATE LIMITED')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
//				element);
//		jse.executeScript("document.getElementById('react-select-2-input');");
//		element.click();

		
		//User Management
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Roles')]")).click();
		//view role
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.display-flex.justify-content-center.roles.row:nth-child(2) div.col div.b-g-white div.b-g-white.p-30.p-t-10 div.table-responsive table.w-100-per tr.font-14pt.color-darkBlue.table-bottom:nth-child(1) td.w-10per.p-10:nth-child(6) div.display-flex.flex-row.col-gap-20 button.font-16pt.b-g-white.border-none.whitespace-nowrap > img:nth-child(1)")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//span[contains(text(),'Edit Role')]")).click();
		
		driver.quit();
	}
		
		@Test
		public void user () throws InterruptedException, AWTException {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://devadmin.febi.ai/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			// Thread.sleep(3000);
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
			driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

			// click on skip button
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			
		//click on user management again
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/img[1]")).click();
		Thread.sleep(3000);
		//click on user
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//click on search and search by name
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Amol");
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(2000);
		//after search click on reset 
		driver.findElement(By.xpath("//span[contains(text(),'Reset')]")).click();
		
		
		//add new user 
		driver.findElement(By.xpath("//button[contains(text(),'+ Add')]")).click();
		
		//select role 
		driver.findElement(By.xpath("//div[contains(text(),'Select Role')]")).click();
		
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//fill name 
		driver.findElement(By.xpath("//input[@id='fullName']")).click();
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Apporv Prakash");
		
		//click on email and fill
		driver.findElement(By.xpath("//input[@id='user-email']")).click();
		driver.findElement(By.xpath("//input[@id='user-email']")).sendKeys("app122@febi.ai");
		
		//click on password
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@#1998");
		
		//click om mobile and fill
		driver.findElement(By.xpath("//input[@id='mobile']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9012287891");
		
		driver.findElement(By.xpath("//span[contains(text(),'Save User')]")).click();
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/img[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
	}

	@Test
	public void Executive () throws InterruptedException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
		//User Management
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		
		//click on executive 
		driver.findElement(By.xpath("//p[contains(text(),'Executives')]")).click();
		
		
		//add new executive
	/*	driver.findElement(By.xpath("//button[contains(text(),'+ Add')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Select Sub Role')]")).click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//NAME
		driver.findElement(By.xpath("//input[@id='fullName']")).click();
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Apporv Bhosale");
		
		//email
		driver.findElement(By.xpath("//input[@id='exec-email']")).click();
		driver.findElement(By.xpath("//input[@id='exec-email']")).sendKeys("app90@febi.ai");
		
		//mobile
		driver.findElement(By.xpath("//input[@id='mobile']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9033412414");
		
		//password
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1998");
		
		driver.findElement(By.xpath("//span[contains(text(),'Save User')]")).click(); */
		
		//filter
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
				
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Jyoti");
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		//reset 
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.container-fluid:nth-child(2) div.display-flex.justify-content-center.users.row div.col div.b-g-white div.b-g-white.p-30.p-t-10 div.sc-dkKxlM.ijyLtP div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(4) div.display-flex.w-100per.flex-row.col-gap-10 button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		
		
		//view and edit 
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.container-fluid:nth-child(2) div.display-flex.justify-content-center.users.row div.col div.b-g-white div.b-g-white.p-30.p-t-10 div.table-responsive table.w-100-per tr.font-14pt.color-darkBlue.table-bottom:nth-child(1) td.w-10per.p-10:nth-child(6) div.display-flex.flex-row.col-gap-20 button.font-16pt.b-g-white.border-none.whitespace-nowrap > img:nth-child(1)")).click();
		//edit 
		driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
		//change password
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.sc-cxdZMj.gTWgZd:nth-child(2) div.display-flex.flex-col div.overflow-auto form:nth-child(1) div.display-flex.w-100per.flex-column.row-gap-10.p-20:nth-child(1) div.p-r-20 > span.text-underline.font-14pt.color-darkBlue.display-flex.justify-content-flex-end")).click();
		
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Amol@1998");
		
		driver.findElement(By.xpath("//input[@id='cf-pass']")).click();
		driver.findElement(By.xpath("//input[@id='cf-pass']")).sendKeys("Amol@1998");
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Edit User')]")).click();
		
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/img[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
	}
	
	@Test	
	public void organisations () throws InterruptedException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
		//User Management
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Organisations')]")).click();
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by Trade name
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(1) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(1) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).sendKeys("ASLA GARMENTS");
		
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by name 
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(2) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(2) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).sendKeys("testnov1");
		
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by mobile
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(3) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(3) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).sendKeys("6045555465");
		
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by email
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(4) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(4) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per:nth-child(2)")).sendKeys("testnov1@febi.ai");
				
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by PAN
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(5) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per.position-relative.text-uppper-case:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(5) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per.position-relative.text-uppper-case:nth-child(2)")).sendKeys("BGAPS1195R");
						
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		
		
		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by PAN
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(5) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per.position-relative.text-uppper-case:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(5) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per.position-relative.text-uppper-case:nth-child(2)")).sendKeys("BGAPS1195R");
								
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
								
		

		//click on filters
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
		//search by GST
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(6) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per.position-relative.text-uppper-case:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-2:nth-child(6) div.border-light-blue.h-30.b-g-white.font-14pt.border-radius-20.p-10.display-flex.align-items-center.mb-2 > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12.w-90per.position-relative.text-uppper-case:nth-child(2)")).sendKeys("33BGAPS1195R1ZU");
								
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) div.sc-jfTVlA.bQorHh div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.display-flex.flex-row.col-gap-20.w-100per div.display-flex.w-100per.flex-row.col-gap-10:nth-child(4) button.h-30.false.loader-btn.color-white.font-16pt.whitespace-nowrap.b-g-darkBlue:nth-child(2) > span.font-16pt")).click();
		 
		Thread.sleep(2000);
		//view org details
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.organizations div.b-g-white.p-30.p-t-10:nth-child(2) table.w-100-per tbody:nth-child(2) tr.cursor-pointer.font-14pt.color-darkBlue.table-bottom:nth-child(1) td.w-20per.p-10:nth-child(10) button.font-16pt.b-g-white.border-none.whitespace-nowrap > img:nth-child(1)")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//button[contains(text(),'+ Assign User')]")).click();
		
		driver.findElement(By.cssSelector("div.display-flex.w-100-per div.w-100-per.h-100-vh.b-g-light-grey.overflow-y-auto:nth-child(2) div.p-t-30.p-16.p-b-20 div.sc-oZIhv.ybozf:nth-child(2) div.display-flex.flex-col div.sc-gScZFl.ipcTXQ:nth-child(10) div.sc-lbVpMG.HCcrI div.sc-jfvxQR.ieblMt div.display-flex.flex-column.m-b-18:nth-child(1) div.display-flex.flex-column.w-100-per.p-t-10:nth-child(1) div.css-2b097c-container div.css-n625h2-control > div.css-9n2ere")).click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//span[contains(text(),'Assign User')]")).click();
		
		
		driver.quit();
	}
	
}