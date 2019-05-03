package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/***
 * User story to compare 2 cars using absolute x-path of the elements.
 */
public class CompareCars {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.indianbluebook.com");
		// Select city as BANGALORE
		driver.findElement(By.xpath("/html/body/div[3]/div/header/div[3]/div[2]/div/div[2]/form/div[2]/div/a[1]"))
				.click();
		// Select Compare Cars option in Tools menu
		driver.findElement(By.xpath("/html/body/div[3]/div/header/nav/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/header/nav/div/div[2]/div/ul/li[4]/ul/li[1]/a")).click();
		// Select make and model of Car 1 as ASTON MARTIN and DB9
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div/a/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div/div/ul/li[2]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[1]/form/div/div[2]/div[2]/div/div/a/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[1]/form/div/div[2]/div[2]/div/div/div/ul/li[3]"))
				.click();
		Thread.sleep(1000);
		// Select make and model of Car 2 as CHEVROLET and CAPTIVA
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div[1]/div/div/a/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div[1]/div/div/div/ul/li[7]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div[2]/div/div/a/span"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div[2]/div/div/div/ul/li[3]"))
				.click();
		Thread.sleep(1000);
		// Click on compare button
		driver.findElement(By.xpath("/html/body/div[3]/div/section/section[1]/div[2]/div/div/div[2]/div[3]/button"))
				.click();

	}

}
