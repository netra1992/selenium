package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/***
 * User story to select a car and make and check on road price. Using absolute
 * x-path of the element.
 */
public class NewCarOnRoadPrice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.indianbluebook.com");
		driver.findElement(By.xpath("/html/body/div[3]/div/header/div[3]/div[2]/div/div[2]/form/div[2]/div/a[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"layout-content\"]/section[1]/div[1]/div[2]/ul/li[2]/a")).click();

		driver.findElement(By
				.xpath("/html/body/div[3]/div/section/section[1]/div[1]/div[2]/div/div[2]/form/div[1]/div/div/a/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[1]/div[2]/div/div[2]/form/div[1]/div/div/div/ul/li[3]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("/html/body/div[3]/div/section/section[1]/div[1]/div[2]/div/div[2]/form/div[2]/div/div/a/span"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[1]/div[2]/div/div[2]/form/div[2]/div/div/div/ul/li[6]"))
				.click();

		driver.findElement(
				By.xpath("/html/body/div[3]/div/section/section[1]/div[1]/div[2]/div/div[2]/form/div[4]/button"))
				.click();
	}

}
