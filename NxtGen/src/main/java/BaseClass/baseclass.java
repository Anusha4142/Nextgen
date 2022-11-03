package BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver anusha;
	public static Properties prop;
	public baseclass() {
		try {
			prop = new Properties();
			FileInputStream anu = new FileInputStream("./config/configs.properties");
			prop.load(anu);
			anu.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void InslizationChrome() {
		String browName = prop.getProperty("browser");
		if(browName.equals("chrome")) {
			System.setProperty("webdriver.chrome.anusha", "./Drivers/chromedriver.exe");
			anusha = new ChromeDriver();
			System.out.println("asdfghjkl;'");
		}else {
			System.out.println("asdfghjkl;");
		}
		anusha.manage().window().maximize();
		anusha.manage().deleteAllCookies();
		anusha.get(prop.getProperty("URL"));

		System.out.println("The chrome is opened as ............... " + anusha.getClass());

	}
	public void tearDown() {
		anusha.close();
		System.out.println("The chrome was closed as........" + anusha.getClass());
	}
}
