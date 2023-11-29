package devAdminFebiAi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class forgetPassword {
	public void forgetPass() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	}

}
