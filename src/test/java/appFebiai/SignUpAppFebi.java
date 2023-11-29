
package appFebiai;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpAppFebi {
	public static void main(String[] args) throws InterruptedException  {
		
		

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		//driver.get("https://devapp.febi.ai/login");
		driver.get("https://app.febi.ai/signup");
		
		//driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Aka12");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aka12+210@febi.ai");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("65121556612");
	driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Maharashtra')]"));
	((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",element);
	 jse.executeScript("document.getElementById('react-select-2-input').value='LambdaTest';");
	 element.click();

	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aka12@#123");
		driver.findElement(By.xpath("//input[@id='c-pass']")).sendKeys("Aka12@#123");
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		
		
	}

}
