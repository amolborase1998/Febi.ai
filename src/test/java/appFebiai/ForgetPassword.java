package appFebiai;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgetPassword {
	@Test
	public  void openBrowserAndClickOnForgotPass() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://app.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Forget Password
		driver.findElement(By.xpath("//span[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amir@febi.ai");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//after send a mail for reset password show popup
		System.out.println("Thanks! If there's an account associated with this email, we'll send the password reset instructions immediately.");
		driver.close();
}

}
