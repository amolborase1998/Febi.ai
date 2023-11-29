package Smoke;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductionAdminSmoke {
	@Test (priority = 0)
	public void Prodadmin() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		String applicationURL = "https://admin.febi.ai/login";

		// Open the application URL
		driver.get("https://admin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		// Check if the title of the page is as expected
		String expectedTitle = "Febi.ai";
		String actualTitle = driver.getTitle();
		assert actualTitle.contains(expectedTitle) : "Application title doesn't match the expected title.";
		driver.quit();

	}
	
	@Test (priority = 1)
	public void prodadminLoginLogout() throws InterruptedException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://admin.febi.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testersp@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tester@#866");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		// click on skip button
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Search any company')]")).click();
		Thread.sleep(2000);
	

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//click to select branch
		driver.findElement(By.xpath("//div[contains(text(),'Search Branch')]")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
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
		
		driver.findElement(By.xpath("//button[contains(text(),'Company')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Account Type')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[2]/div[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[2]/div[1]/img[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Report')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[2]/div[1]/img[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[3]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[2]/div[1]/img[1]")).click();
		
		
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/img[1]"))
		.click();
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
		driver.quit();
		System.out.println("Smoke Test: Login functionality - PASS");
	}

}
