package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chome.driver",
		// "/Users/home/eclipse-workspace/selenium/softwares/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/Users/home/eclipse-workspace/selenium/softwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");

	}

}