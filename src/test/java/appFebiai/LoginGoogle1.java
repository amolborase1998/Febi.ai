package appFebiai;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
// org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginGoogle1 {
	WebDriver driver;
	@Test
	public void openWithGoogle() throws InterruptedException {
		System.out.println("open with google");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		//opt.addArguments("--incognito");
		//opt.addArguments("--lang=en-us");
		//opt.addArguments("--disable-web-security");
		//opt.addArguments("--allow-running-insecure-content");
		//opt.addArguments("--disable-web-security", "--user-data-dir=true", "--allow-running-insecure-content");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		
		
		driver.get("https://app.febi.ai/login");
		driver.findElement(By.xpath("//span[contains(text(),'Sign in with Google')]")).click();
		

			Set<String> windows= driver.getWindowHandles();
			Iterator <String> it = windows.iterator();
			String parent = it.next();
			String child = it.next();
			Thread.sleep(3000);
			driver.switchTo().window(child);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ksweety3293@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8888348113");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
			driver.switchTo().window(parent);
		}
		
		
		
	}
	


