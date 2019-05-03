package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.gmail.com");

		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("9986301296");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abhi@1010");
	}

}
