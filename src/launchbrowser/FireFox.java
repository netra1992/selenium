package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFox {
	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver",
		// "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");

		System.setProperty("webdriver.chrome.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
	}

}
