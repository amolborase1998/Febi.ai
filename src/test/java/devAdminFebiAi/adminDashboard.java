package devAdminFebiAi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class adminDashboard {
	
	@Test
public void admindashboardall () throws InterruptedException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://devadmin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superpartner@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Febi@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Search any company')]")).click();
		Thread.sleep(2000);
	

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//click to select branch
		driver.findElement(By.xpath("//div[contains(text(),'Search Branch')]")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//CLICK ON SELECT FINANCIAL YEAR
		/*driver.findElement(By.xpath("//div[contains(text(),'Search Financial Year')]")).click();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_3);
		robot.keyRelease(KeyEvent.VK_3);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		//Email sync
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/*[1]")).click();
		
		
		
		//edit profile 
		driver.findElement(By.xpath("//div[contains(text(),'SO')]")).click();
		
		//notifications
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[4]/img[1]")).click();
		
		//click on dashboard
		driver.findElement(By.xpath("//p[contains(text(),'Dashboard')]")).click();
		
		
		//click on company dashboard 
		driver.findElement(By.xpath("//button[contains(text(),'Company')]")).click();
		
		//see pending files
		driver.findElement(By.xpath("//div[contains(text(),'See All')]")).click();
		
		driver.navigate().back();
		
		//again click on company dashboard
		driver.findElement(By.xpath("//button[contains(text(),'Company')]")).click();
		
		//click on calender
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[7]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//h1[contains(text(),'Compliance')]")).click();
	
}
	
	

}
