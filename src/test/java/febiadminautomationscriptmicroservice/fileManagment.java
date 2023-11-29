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

public class fileManagment {
	@Test
	public void files() throws InterruptedException {                                                                                                                                           
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
		driver.findElement(By.xpath("//div[contains(text(),'Search any company')]")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'PADUP VENTURES PRIVATE LIMITED')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element);
		jse.executeScript("document.getElementById('react-select-2-input');");
		element.click();
		
		//click on file management
		
		driver.findElement(By.xpath("//p[contains(text(),'File Management')]")).click();
		
		driver.findElement(By.xpath("//span[@id='filterBy']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'IN PROCESS')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COMPLETED')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'PENDING')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'REJECTED')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'JOURNAL VOUCHERS')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'SUSPENSE')]")).click();
		
		driver.findElement(By.xpath("//span[@id='filterBy']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'UNPROCESSED')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'PENDING')]")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/img[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
		
		
		

	}

}
