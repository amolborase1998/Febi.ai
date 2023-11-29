package appFebiai;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInWithGoogle {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		// driver.get("https://devapp.febi.ai/login");
		driver.get("https://app.febi.ai/signup");
		// driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign in with Google')]")).click();
		Thread.sleep(3000);
		driver.get(
				"https://accounts.google.com/o/oauth2/auth/identifier?login_hint&response_type=code&redirect_uri=https%3A%2F%2Fauth0.febi.ai%2Flogin%2Fcallback&scope=email%20profile%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Flatitude.all.best%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Flatitude.all.city&state=DEXfbBP_pnJiwD2zFD_PoxtWSC3zB7G-&client_id=713493816579-9euq9ag9p7mhfhljd1ca7v3ol966i987.apps.googleusercontent.com&service=lso&o2v=1&flowName=GeneralOAuthFlow");

		driver.findElement(By.xpath("//div[contains(text(),'Email or phone')]")).sendKeys("Testerfebi@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Enter your password')]")).sendKeys("Tester@123");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Maharashtra')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element);
		jse1.executeScript("document.getElementById('react-select-2-input').value='LambdaTest';");
		element.click();

		// Next Page for Onboarding
		driver.findElement(By.id("pan")).sendKeys("AAACO0191M");
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		// For GST page
		Alert at = driver.switchTo().alert();
		// at.accept(); //if yes
		at.dismiss();

		// next page Entity Details
		driver.findElement(By.xpath("//input[@id='pricipalAddress']")).sendKeys("At post vadel Tel. Malegaon");
		driver.findElement(By.xpath("//input[@id='tradeName']")).sendKeys("Komal Shopping");

		// click on "type of organization"
		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Organisation')]")).click();
		// dropdown for"types of organization" dropdown
		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Individual')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element1);
		jse.executeScript("document.getElementById('react-select-6-input').value='LambdaTest';");
		element1.click();

		// click on"nature of business" dropdown
		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Business')]")).click();
		// dropdown for"Nature of bussiness";
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Manufacturer')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element2);
		jse.executeScript("document.getElementById('react-select-7-input').value='LambdaTest';");
		element2.click();

		// click on "Type of Industry" dropdown
		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Industry')]")).click();
		// dropdown for"Type of Industry";
		WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'Contractors')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element3);
		jse.executeScript("document.getElementById('react-select-8-input').value='LambdaTest';");
		element3.click();

		driver.findElement(By.xpath("//div[contains(text(),'Select Type of Sector')]")).click();
		//// dropdown for"Sector";
		WebElement element4 = driver.findElement(By.xpath("//div[contains(text(),'Forest Contractors')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
				element4);
		jse.executeScript("document.getElementById('react-select-9-input').value='LambdaTest';");
		element4.click();
		// for next button click;
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		// For bank details
		driver.findElement(By.xpath("//span[contains(text(),'Skip')]")).click();

		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//span[contains(text(),'Skip')]")).click();

		// uplaodcompany logo
		WebElement upload = driver.findElement(By.xpath("//label[contains(text(),'Upload Company Logo')]"));
		upload.sendKeys("C:\\Users\\HP\\Desktop\\CompanyLogo.jpg");

		driver.findElement(By.xpath("//button[contains(text(),'Finish')]")).click();

	}

}
