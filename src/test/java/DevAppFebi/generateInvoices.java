package DevAppFebi;

import java.awt.AWTException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class generateInvoices {
	@Test
	public void Invoices() throws InterruptedException, AWTException, Exception, IllegalArgumentException {
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://devapp.febi.ai/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padup@febi.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Padup@#123");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Invoices')]")).click();
		
		//creat new invoices
		driver.findElement(By.xpath("//*[@class='y3Dj1gEUq8HzWgR9zuG5']")).click();
		//select branch
		 Actions bran = new Actions(driver);
	        WebElement dropdownbran = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.IChMEZzMlVVKoUGq6A2G div.vlB9qupbbE1E2QUDArmO div.He5HXp4yXBExLFZ9nDTQ:nth-child(1) div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div:nth-child(1) div.css-2b097c-container div.BizN____control.css-15ar0c2-control:nth-child(2) > div.BizN____value-container.css-hzpdrm-ValueContainer"));
	        
	        Actions branAction = bran.moveToElement(dropdownbran).click().sendKeys(dropdownbran, "PADUP VENTURES ");
	       bran.keyDown(Keys.CONTROL);
	        bran.keyDown(Keys.ENTER);
	        bran.keyUp(Keys.ENTER);
	       
	       branAction.build().perform();
	      
	       
	        
		//use customer edit
		driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.HJf_CneeUWYhzyxf7zBX:nth-child(2) div.meDJ76qHXX4EQEYAND_H:nth-child(1) h3:nth-child(1) > button:nth-child(1)")).click();
		driver.findElement(By.xpath("//*[@class='DynBiz_Btn DynBiz_theme_Btn']")).click();
		//use biling add
		driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.HJf_CneeUWYhzyxf7zBX:nth-child(2) div.meDJ76qHXX4EQEYAND_H:nth-child(3) h3:nth-child(1) button:nth-child(1) > svg:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.u1PlBeOOWple60a0M9pu.react-draggable:nth-child(4) header.yhfklBmyb_tkzG2oeARj > span.LKAnxEfcJm_WAKqdem7A:nth-child(2)")).click();
		//shipping add
		driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.HJf_CneeUWYhzyxf7zBX:nth-child(2) div.meDJ76qHXX4EQEYAND_H:nth-child(5) h3:nth-child(1) button:nth-child(1) > svg:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.u1PlBeOOWple60a0M9pu.react-draggable:nth-child(4) header.yhfklBmyb_tkzG2oeARj > span.LKAnxEfcJm_WAKqdem7A:nth-child(2)")).click();
		//edit GSTIN
		driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.HJf_CneeUWYhzyxf7zBX:nth-child(2) div.meDJ76qHXX4EQEYAND_H:nth-child(1) p:nth-child(5) > input._sFJ5Mm5vhMNF6UtSdRo:nth-child(2)")).sendKeys("kkkk");
		Thread.sleep(2000);
		//scrolldown
		//Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK tr:nth-child(1) td.IQb7QrA5_lTJtG630fXQ:nth-child(2) div.zDM9WHbYacppjyYk2bgw.css-2b097c-container div.css-11yw2qi-control:nth-child(2) > div.css-hzpdrm-ValueContainer"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // Scrolling down the page till the element is found		
        jse.executeScript("arguments[0].scrollIntoView();", Element);
		
		//jse.executeScript("window.scrollBy(0,900)");
		//items dropdown
        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        WebElement dropdown = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK tr:nth-child(1) td.IQb7QrA5_lTJtG630fXQ:nth-child(2) div.zDM9WHbYacppjyYk2bgw.css-2b097c-container div.css-11yw2qi-control:nth-child(2) > div.css-hzpdrm-ValueContainer"));
        
        Actions seriesOfAction = builder.moveToElement(dropdown).click().sendKeys(dropdown, "Apple Iphone ");
        builder.keyDown(Keys.ENTER);
        builder.keyUp(Keys.ENTER);
        seriesOfAction.build().perform();
        
        //qty select
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK tbody:nth-child(2) tr:nth-child(1) td:nth-child(4) div:nth-child(1) > input._sFJ5Mm5vhMNF6UtSdRo:nth-child(1)")).sendKeys("1");
        //rete box
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK tbody:nth-child(2) tr:nth-child(1) td:nth-child(5) > input._sFJ5Mm5vhMNF6UtSdRo")).sendKeys("120");
        
        //discount value
       // driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK td:nth-child(7) div:nth-child(1) div.zDM9WHbYacppjyYk2bgw.css-2b097c-container div.css-11yw2qi-control:nth-child(2) > div.css-hzpdrm-ValueContainer")).click();
       
        Actions bu = new Actions(driver);
        WebElement dropdowndis = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK td:nth-child(7) div:nth-child(1) div.zDM9WHbYacppjyYk2bgw.css-2b097c-container div.css-11yw2qi-control:nth-child(2) > div.css-hzpdrm-ValueContainer"));
        
        Actions discountvalue = bu.moveToElement(dropdowndis).click().sendKeys(dropdowndis, "%");
        bu.keyDown(Keys.ENTER);
        bu.keyUp(Keys.ENTER);
        discountvalue.build().perform();
        
        //remark filed
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.jyOtDWsnX7ewLV85wKDW:nth-child(3) table.rd_yr_EYM7LNpUUR9dyK tbody:nth-child(2) tr:nth-child(1) td:nth-child(14) > input._sFJ5Mm5vhMNF6UtSdRo.qdlhrv7d5vcXjgqINRwE")).sendKeys("remark");
        
       //charge field
        Actions b = new Actions(driver);
        WebElement dropdowncharg = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.UAbE908UyArhal2tP2nb:nth-child(4) div._N8zalyeY_6C_QF7uCcT div.zDM9WHbYacppjyYk2bgw.css-2b097c-container:nth-child(1) div.css-11yw2qi-control:nth-child(2) > div.css-hzpdrm-ValueContainer"));
        
        Actions chargvalue = b.moveToElement(dropdowncharg).click().sendKeys(dropdowncharg, "Insurance");
        b.keyDown(Keys.ENTER);
        b.keyUp(Keys.ENTER);
        chargvalue.build().perform();
        //textfiled
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.UAbE908UyArhal2tP2nb:nth-child(4) div._N8zalyeY_6C_QF7uCcT > input._sFJ5Mm5vhMNF6UtSdRo:nth-child(2)")).sendKeys("10");
      //textfiled
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.UAbE908UyArhal2tP2nb:nth-child(4) div._N8zalyeY_6C_QF7uCcT > input._sFJ5Mm5vhMNF6UtSdRo:nth-child(3)")).sendKeys("10");
        //remarktextfiled
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.UAbE908UyArhal2tP2nb:nth-child(4) div._N8zalyeY_6C_QF7uCcT > input._sFJ5Mm5vhMNF6UtSdRo:nth-child(6)")).sendKeys("Remark");
        //click button
        driver.findElement(By.xpath("//*[contains(text(),'Add Charges')]")).click();
        //mode of transport
        
        Actions tr = new Actions(driver);
        WebElement dropdowntr = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.YYfdGgkhw_kdiGcUT_yi:nth-child(6) table.jdKYDVKfZZk65Y6QF2jO td.IQb7QrA5_lTJtG630fXQ:nth-child(1) div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div:nth-child(1) div.css-2b097c-container div.BizN____control.css-15ar0c2-control:nth-child(2) > div.BizN____value-container.css-hzpdrm-ValueContainer"));
        
        Actions trvalue = tr.moveToElement(dropdowntr).click().sendKeys(dropdowntr, "Road");
        tr.keyDown(Keys.ENTER);
        tr.keyUp(Keys.ENTER);
        trvalue.build().perform();
		
        //vehicle num
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.YYfdGgkhw_kdiGcUT_yi:nth-child(6) table.jdKYDVKfZZk65Y6QF2jO tbody:nth-child(2) tr:nth-child(1) td:nth-child(2) > input._sFJ5Mm5vhMNF6UtSdRo")).sendKeys("1228");
        
        //date and time
        WebElement elem=driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.YYfdGgkhw_kdiGcUT_yi:nth-child(6) table.jdKYDVKfZZk65Y6QF2jO tbody:nth-child(2) tr:nth-child(1) td:nth-child(3) > input._sFJ5Mm5vhMNF6UtSdRo"));
        System.out.println(elem.getText());
		
        //note/remark
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.YYfdGgkhw_kdiGcUT_yi:nth-child(6) table.jdKYDVKfZZk65Y6QF2jO tbody:nth-child(2) tr:nth-child(1) td:nth-child(4) > textarea:nth-child(2)")).sendKeys("remark");
		
        //bank name
        //driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(1) div.sc-hHOBiw.jxZYnw:nth-child(2) div.sc-kWtpeL.leTEKx div.h1l7mQ2Tb4mZrdvEoRmW:nth-child(1) div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div.sc-gdyeKB.dDWfde div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div:nth-child(1) div.css-2b097c-container div.BizN____control.css-15ar0c2-control:nth-child(2) > div.BizN____value-container.css-hzpdrm-ValueContainer"));
        
        Actions bn = new Actions(driver);
        WebElement dropdownbank = driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(1) div.sc-hHOBiw.jxZYnw:nth-child(2) div.sc-kWtpeL.leTEKx div.h1l7mQ2Tb4mZrdvEoRmW:nth-child(1) div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div.sc-gdyeKB.dDWfde div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div:nth-child(1) div.css-2b097c-container div.BizN____control.css-15ar0c2-control:nth-child(2) > div.BizN____value-container.css-hzpdrm-ValueContainer"));
        
        Actions bankvalue = bn.moveToElement(dropdownbank).click().sendKeys(dropdownbank, "SBI");
        bn.keyDown(Keys.ENTER);
        bn.keyDown(Keys.ENTER);
        bn.keyUp(Keys.ENTER);
        bankvalue.build().perform();
		
		//acc name
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(1) div.sc-hHOBiw.jxZYnw:nth-child(2) div.sc-kWtpeL.leTEKx div.h1l7mQ2Tb4mZrdvEoRmW:nth-child(2) div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div.sc-gdyeKB.dDWfde div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN > input.Gafmp99FVg7bPy4AvdPU")).sendKeys("saving");
        
        //IFSC
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(1) div.sc-hHOBiw.jxZYnw:nth-child(2) div.sc-kWtpeL.leTEKx div.h1l7mQ2Tb4mZrdvEoRmW:nth-child(3) div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div.sc-gdyeKB.dDWfde div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN > input.Gafmp99FVg7bPy4AvdPU")).sendKeys("BBKB0000");
        
        //acc no
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(1) div.sc-hHOBiw.jxZYnw:nth-child(2) div.sc-kWtpeL.leTEKx div.h1l7mQ2Tb4mZrdvEoRmW:nth-child(4) div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div.sc-gdyeKB.dDWfde div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN > input.Gafmp99FVg7bPy4AvdPU")).sendKeys("10025344933");
        
        //swift code
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(1) div.sc-hHOBiw.jxZYnw:nth-child(2) div.sc-kWtpeL.leTEKx div.h1l7mQ2Tb4mZrdvEoRmW:nth-child(5) div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN div.sc-gdyeKB.dDWfde div.h1l7mQ2Tb4mZrdvEoRmW div.sc-bDpDS.gUmLQA.VNgM3cOjqHvQzH2WiWvN > input.Gafmp99FVg7bPy4AvdPU")).sendKeys("jdk52");
        
        //remark
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div.qNiulUnYDxYUZIrtFV8D:nth-child(7) div.aYK5cdIzOdudI3p2iKCV:nth-child(2) > textarea:nth-child(2)")).sendKeys("remark");
        
        //save button
        driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div._Jxs7viXfOLN2dTczOpQ:nth-child(8) > button.DynBiz_Btn.DynBiz_secondary_Btn:nth-child(1)")).click();
        
        //saveandAdd
       // driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div._Jxs7viXfOLN2dTczOpQ:nth-child(8) > button.DynBiz_Btn.DynBiz_secondary_Btn:nth-child(2)")).click();
        
        //reset button
       // driver.findElement(By.cssSelector("div.display-flex.flex-row.h-100-vh.overflow-hidden:nth-child(4) div.w-100per-dashboard.max-1540-w-85per:nth-child(2) div.p-l-r-30.h-100-vh.overflow-x-hidden.overflow-y-auto.p-b-20 div.p-t-20 div.SYFcpKWMU8cOlAsJu0ae div.I9nDnHAb8G5ZH3v98Z_x:nth-child(3) div.BrAlTml85CkopHzr1TjI div.cQ0kcIu4WozIogocoAdM div._Jxs7viXfOLN2dTczOpQ:nth-child(8) > button.DynBiz_Btn.DynBiz_danger_Btn:nth-child(3)")).click();
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
