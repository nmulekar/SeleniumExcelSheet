package test_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OfflineWebSite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		FileInputStream fin = new FileInputStream("offline.properties");

		Properties prop = new Properties();

		prop.load(fin);

		String str = prop.getProperty("url");

		driver.get(str);

		// -------------------------Blank-------------------------------

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.clear();
		pass.sendKeys("");

		WebElement submit = driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button"));
		submit.click();
		
		String s1 = driver.findElement(By.xpath("//div[@id='email_error']")).getText();
		System.out.println("Blank Email Id : " + s1);
		
		String s2 = driver.findElement(By.xpath("//div[@id='password_error']")).getText();	
		System.out.println("Blank Password : " + s2);
		
		Thread.sleep(2000);
		
		// -------------------------InValid-------------------------------

		WebElement emailInValid = driver.findElement(By.id("email"));
		emailInValid.clear();
		emailInValid.sendKeys("abc@123");

		WebElement passInValid = driver.findElement(By.id("password"));
		passInValid.clear();
		passInValid.sendKeys("56789");

		WebElement submitInValid = driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button"));
		submitInValid.click();

		String s3 = driver.findElement(By.xpath("//div[@id='email_error']")).getText();
		System.out.println("Blank Email Id : " + s3);
		
		String s4 = driver.findElement(By.xpath("//div[@id='password_error']")).getText();	
		System.out.println("Blank Password : " + s4);
		
		Thread.sleep(2000);
		
		// -------------------------Valid-------------------------------

		WebElement emailvalid = driver.findElement(By.id("email"));
		emailvalid.clear();
		emailvalid.sendKeys("kiran@gmail.com");

		WebElement passValid = driver.findElement(By.id("password"));
		passValid.clear();
		passValid.sendKeys("123456");

		WebElement submitValid = driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button"));
		submitValid.click();
		Thread.sleep(2000);
		
		// -------------------------Logout-------------------------------

		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		driver.close();
	}
}
