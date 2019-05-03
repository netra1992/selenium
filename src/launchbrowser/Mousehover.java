package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");

		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		// driver.get("https://www.flipkart.com/search?q=sd%20card%20for%20dslr&otracker=start&as-show=on&as=off");
		driver.findElement(By.xpath("//button[.='✕']")).click();

		/// html/body/div[1]/div/header/div[3]/ul/li[3]/span/svg

		WebElement barElement = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));

		makeActions(driver, barElement);

	}

	private static void makeActions(WebDriver driver, WebElement barElement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(barElement).perform();
	}

}
