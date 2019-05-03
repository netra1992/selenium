package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "/Users/home/eclipse-workspace/selenium/softwares/chromedriver");
		ChromeDriver driver1 = new ChromeDriver();

		driver.quit();
		driver1.quit();

	}

}
