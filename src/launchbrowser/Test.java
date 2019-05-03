package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("neethunetra1992@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("aforabhinav");
	}

}
