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

public class Data {
	@Test
	public void DataReportFiles() throws InterruptedException  {
		
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
		
		
		//click on data
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]")).click();
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
		
		
	//files
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/*[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Files')]")).click();
		
		
		
				
				
		
				

	}

}
