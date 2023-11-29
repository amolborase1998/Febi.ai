package appFebiai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserDashboard {
	@Test
	public void Dashboard() throws InterruptedException {
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
		//click on news
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/*[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/*[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//span[contains(text(),'Net Cash Flow')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Purchases')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COGS/ Expenses')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Receivables')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Payables')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Cash and Bank')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Direct Income')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Indirect Income')]")).click();
		
		//click on pie chart sign
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/img[2]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Net Cash Flow')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Purchases')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COGS/ Expenses')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Receivables')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Payables')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Cash and Bank')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Direct Income')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Indirect Income')]")).click();
		
		driver.quit();
		
		
		
}
}
