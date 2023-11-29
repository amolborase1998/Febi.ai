package appFebiai;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationToOnBoarding {
	@Test
	public void LoginDevApp() throws InterruptedException, Throwable {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devapp.febi.ai/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("testnov");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test009@febi.ai");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9893491001");
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Maharashtra')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element);
		jse.executeScript("document.getElementById('react-select-2-input').value='LambdaTest';");
		element.click();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
		driver.findElement(By.xpath("//input[@id='c-pass']")).sendKeys("Febi@#866");

		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

// pancard filed
		driver.findElement(By.cssSelector("#pan")).click();
		driver.findElement(By.cssSelector("#pan")).sendKeys("AAACS8577K");
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		

		driver.findElement(By.cssSelector("div.b-g-color.display-flex.justify-content-center.small-desk.align-items-center.h-100-vh.p-20.flex-col.h-auto.onboarding:nth-child(5) div.m-t-30 div.w-1100.p-b-64.b-g-white.pan-validate-size div.p-62 form.display-flex.flex-col.row-gap-10 div.display-flex.justify-content-end.align-items-end.m-t-18:nth-child(4) > button.next-small")).click();
		jse.executeScript("window.scrollBy(0,3000)");

		WebElement ele = driver.findElement(By.cssSelector("div.b-g-color.display-flex.justify-content-center.small-desk.align-items-center.h-100-vh.p-20.flex-col.h-auto.onboarding:nth-child(5) div.m-t-30 div.w-1100.p-b-64.b-g-white.pan-validate-size div.p-62 form.display-flex.flex-col.row-gap-10 div.display-flex.justify-content-end.align-items-end.m-t-18:nth-child(4) > button.next-small"));
		
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);

// next page Entity Details
		jse.executeScript("window.scrollBy(0,7000)");
		WebElement ele2 = driver.findElement(By.xpath("//*[@id='cin']"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", ele2);
		jse.executeScript("window.scrollBy(0,3000)");

// click on "type of organization"
		jse.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Organisation')]")).click();
// dropdown for"types of organization" dropdown
		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Hindu Undivided Family (HUF)')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element1);
		jse.executeScript("document.getElementById('react-select-6-input').value='LambdaTest';");
		element1.click();

// click on"nature of business" dropdown
		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Business')]")).click();
// dropdown for"Nature of bussiness";
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Manufacturer')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element2);
		jse.executeScript("document.getElementById('react-select-7-input').value='LambdaTest';");
		element2.click();

// click on "Type of Industry" dropdown
		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Industry')]")).click();
// dropdown for"Type of Industry";
		WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'Contractors')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element3);
		jse.executeScript("document.getElementById('react-select-8-input').value='LambdaTest';");
		element3.click();

		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Sector')]")).click();
//// dropdown for"Sector";
		WebElement element4 = driver.findElement(By.xpath("//div[contains(text(),'Forest Contractors')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element4);
		jse.executeScript("document.getElementById('react-select-9-input').value='LambdaTest';");
		element4.click();
// for next button click;
		WebElement eleNext = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		JavascriptExecutor executorNext = (JavascriptExecutor) driver;
		executorNext.executeScript("arguments[0].click();", eleNext);
// driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
// For bank details
		driver.findElement(By.xpath("//span[contains(text(),'Skip')]")).click();

		jse.executeScript("window.scrollBy(0,700)");
// creditional
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Skip')]")).click();

// for company logo upload
		Thread.sleep(2000);
// not working
		WebElement ele5 = driver
				.findElement(By.xpath("//*[@class='text-underline color-black font-14pt fw-700 m-t-4']"));
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click();", ele5);

		Actions act = new Actions(driver);
		act.moveToElement(ele5).click().perform();

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

		driver.findElement(By.xpath("//button[contains(text(),'Finish')]")).click();
		
		//*[@id="root"]/div[5]/div/div/p[2]

	}
}
