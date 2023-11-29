package DevAppFebi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userManagementRole {
	@Test
	public void usermangementRole() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devapp.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//Thread.sleep(3000);
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padup@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Padup@#123");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		Thread.sleep(3000);

//user managments click
		WebElement l = driver.findElement(By.xpath("//div[contains(text(),'User Management')]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", l);
		Thread.sleep(1000);
//click roles

		WebElement l1 = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/a[1]/p[1]"));
		j.executeScript("arguments[0].click();", l1);
		Thread.sleep(1000);
//click filter
		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();

//type serch textfil
		Thread.sleep(1000);
//		WebElement l2 = driver.findElement(By.cssSelector(
//				"div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.container-fluid div.display-flex.justify-content-center.roles.row:nth-child(3) div.col div.b-g-white div.b-g-white.p-30.p-t-10 div.sc-tagGq.dEWHQs div.w-100per.display-flex.flex-row.flex-wrap.row-gap-10.col-gap-20.p-10 div.w-100per.row div.col-xl-4 div.border-darkBlue.h-30.b-g-white.font-14pt.border-radius-20.p-l-20.display-flex.align-items-center > input.font-14pt.fw-400.border-none.textarea-placeholder.input-field-outline-none.p-l-12:nth-child(2)"));
//		j.executeScript("arguments[0].click();", l2);
//		l2.sendKeys("Test");
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Admin");
//click on serch button
		WebElement l3 = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]"));
		j.executeScript("arguments[0].click();", l3);

//click on reset button
		WebElement l4 = driver.findElement(By.xpath("//span[contains(text(),'Reset')]"));
		j.executeScript("arguments[0].click();", l4);

//add detal
		driver.findElement(By.xpath("//button[contains(text(),'+ Add')]")).click();
		
//add name
		driver.findElement(By.xpath("//input[@id='roleName']")).sendKeys("Analyst");
//add all
		driver.findElement(By.xpath("//input[@id='dashboard']")).click();
		j.executeScript("window.scrollBy(0,1000)");
///////
		//driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[2]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/span[1]/span[1]")).click();
///////////////
		//driver.findElement(By.xpath("//input[@id='invoice']")).click();
/////////
		//driver.findElement(By.xpath("//input[@id='input']")).click();
/////////////
		//driver.findElement(By.xpath("//input[@id='file-management']")).click();
		j.executeScript("window.scrollBy(0,500)");
//////////////
		//driver.findElement(By.xpath("//input[@id='report']")).click();

//////////////////
		//driver.findElement(By.xpath("//input[@id='faqs']")).click();
///////////////////////
		//driver.findElement(By.xpath("//input[@id='help-center']")).click();
//////////////////////
		//j.executeScript("window.scrollBy(0,400)");
		
		WebElement l5 = driver.findElement(By.xpath(
				"//span[contains(text(),'Save Role')]"));
		j.executeScript("arguments[0].click();", l5);
		
		driver.quit();
	}

}