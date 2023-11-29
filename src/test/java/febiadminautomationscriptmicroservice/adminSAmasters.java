package febiadminautomationscriptmicroservice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adminSAmasters {
	@Test
	public void SAmasters() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Search any company')]")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'PADUP VENTURES PRIVATE LIMITED')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element);
		jse.executeScript("document.getElementById('react-select-2-input');");
		element.click();

		// SA masters
		driver.findElement(By.xpath("//div[contains(text(),'SA Masters')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Faq Category')]")).click();
		// add FAQ category
//		driver.findElement(By.xpath("//button[contains(text(),'+Add')]")).click();
//		driver.findElement(By.xpath("//input[@id='name']")).click();
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Amol Borase");
//		driver.findElement(By.xpath("//textarea[@id='description']")).click();
//		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Febi.ai");
//		driver.findElement(By.xpath("//input[@id='order']")).click();
//		driver.findElement(By.xpath("//input[@id='order']")).sendKeys("0");
//		driver.findElement(By.xpath("//div[contains(text(),'Select Status')]")).click();
//		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Inactive')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
//				element);
//		jse.executeScript("document.getElementById('react-select-5-input')");
//		element.click();;
//		driver.findElement(By.xpath("//div[contains(text(),'Inactive')]"));
//		jse.executeScript("window.scrollBy(0,400)");
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'Faq Subcategory')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'Faqs')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'Master Detail Type')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'Master Type')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'HC Category')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'HC Subcategory')]")).click();

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/img[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();

	}

}
