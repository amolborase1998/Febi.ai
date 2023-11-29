package executivefebi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class executive {
	
	@Test
	public void executive() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://executive.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amol@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1998");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		//click on edit profile
		driver.findElement(By.xpath("//div[contains(text(),'AM')]")).click();
		//click on change password
		driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Amol@1998");
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Amol@1998");
		driver.findElement(By.xpath("//span[contains(text(),'Update Password')]")).click();
		
		//click on dashboard
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/img[1]")).click();
		//click on FM
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]/img[1]")).click();
		//click on FAQ 
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/img[1]")).click();
		//click on help center
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/img[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
		
	}
	
	@Test
	public void forgetpassword() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://executive.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//click on forget password
		driver.findElement(By.xpath("//span[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amol@feb.ai");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		driver.quit();
	}

}
