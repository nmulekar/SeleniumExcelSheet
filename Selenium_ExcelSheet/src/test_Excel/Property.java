package test_Excel;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("abc.properties");

		Properties pro = new Properties();

		pro.load(file);

		String browser = pro.getProperty("browser");

		System.out.println(browser);

		String url = pro.getProperty("url");

		System.out.println(url);

		String browName = pro.getProperty("browser");

		if (browName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.com");

			driver.manage().window().maximize();

		} else if (browName.equalsIgnoreCase("Firefox")) {

			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
		}

	}

}
