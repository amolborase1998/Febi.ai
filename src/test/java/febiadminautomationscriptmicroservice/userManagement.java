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

public class userManagement {
	@Test
	public void UserManage() throws InterruptedException {
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

		
		//User Management
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Roles')]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.xpath("//input[@id='roleName']")).click(); //edit role name
		driver.findElement(By.xpath("//input[@id='roleName']")).clear();
		driver.findElement(By.xpath("//input[@id='roleName']")).sendKeys("Jyoti");
		
		driver.findElement(By.xpath("//input[@id='description']")).click(); //edit role description
		driver.findElement(By.xpath("//input[@id='description']")).clear();
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Superpartner");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/span[1]/span[3]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]")).click();
		jse.executeScript("window.scrollBy(0,3000)");
		
		driver.findElement(By.xpath("//span[contains(text(),'Edit Role')]")).click();
		
		Thread.sleep(3000);
		//for add new role
//		
//		driver.findElement(By.xpath("//button[contains(text(),'+ Add')]")).click();
//		driver.findElement(By.xpath("//input[@id='roleName']")).click();
//		driver.findElement(By.xpath("//input[@id='roleName']")).sendKeys("Amol");
//		
//		driver.findElement(By.xpath("//input[@id='description']")).click();
//		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Superpartner");
//		
//		driver.findElement(By.xpath("//input[@id='master']")).click();
//		jse.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.xpath("//input[@id='saMaster']")).click();
//		jse.executeScript("window.scrollBy(0,3000)");
//		driver.findElement(By.xpath("//span[contains(text(),'Save Role')]")).click();
//		
		//for filters
//		driver.findElement(By.xpath("//span[contains(text(),'Filters')]")).click();
//		driver.findElement(By.xpath("//*[@class= ' css-cy0ami-placeholder']")).click();
//		driver.findElement(By.xpath("//*[@class= ' css-cy0ami-placeholder']")).sendKeys("Amol");
//		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")).click();
//		
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/*[1]")).click();
		
		//back to user management
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		
		driver.findElement(By.xpath("//p[contains(text(),'Users')]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]/img[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.xpath("//input[@id='fullName']")).click();
		driver.findElement(By.xpath("//input[@id='fullName']")).clear();
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Accountant");
		
		driver.findElement(By.xpath("//span[contains(text(),'Edit User')]")).click();
		
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'User Management')]")).click();
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//p[contains(text(),'Organisations')]")).click();
		
		
		
		
		
	}

}
