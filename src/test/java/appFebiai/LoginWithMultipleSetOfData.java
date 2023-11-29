package appFebiai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginWithMultipleSetOfData {
	@Test(dataProvider = "credentials")
	
	public void verifyLoginCredentials(String scenario, String username, String password) {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://devadmin.febi.ai/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/button[1]")).click();
	
		if(scenario.equals("bothcorrect")) {
			WebElement account = driver.findElement(By.xpath("//bo1]dy/div[@id='root']/div[/div[2]"));
			driver.switchTo().frame(account);
			Assert.assertTrue(account.isDisplayed(),"Login Not success");
			
			}
		else if(scenario.equals("bothwrong ")) {
			String errorMassage = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")).getText();
			Assert.assertNotEquals(errorMassage, "User Not exists");
		}
		else if(scenario.equals("correctusername")) {
			String errorMassage = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")).getText();
			Assert.assertEquals(errorMassage, "The creadentials provided are incorrect");	
		}
		else {
			String errorMassage = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")).getText();
			Assert.assertEquals(errorMassage, "No customer account found");
		}
		driver.quit();
	}

@DataProvider(name = "credentials")
public Object[][] getData(){
	return new Object[][] {
		{"bothcorrect","superpartner@febi.ai","Febi@#866"},
		{"bothwrong","Sweety_jk@febi.ai","pass"},
		{"correctusername","superpartner@febi.ai","pass"},
		{"correctpassword","super_@febi.ai","Febi@#866"},
	};

}
}
	