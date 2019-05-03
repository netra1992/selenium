package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class fire {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/home/eclipse-workspace/selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.=\"✕\"]")).click();
		// driver.close();

		// driver.findElement(By.xpath("(//span[@class=\"_1QZ6fC _3Lgyp8\"])[1]"));
		// driver.findElement(By.xpath("//span[.='Electronics']"));
		WebElement we = driver.findElement(By.xpath("(//span[@class=\"_1QZ6fC _3Lgyp8\"])[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();

		// driver.findElement(By.xpath("(//a[.='Mi'])[1]"));

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.=\"T-Shirts\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img)[4]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[.=\"Color block Men's Hooded Multicolor T-Shirt\"]"));

		// WebElement tee =
		// System.out.println(tee.get));

		// WebElement tShirt = driver.findElement(By.xpath("//span[.=\"Solid Men Round
		// Neck White T-Shirt\"]"));

		// System.out.println(tShirt.get);
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[.='S']")).click();

		driver.findElement(By.xpath("(//button[@class='_2AkmmA _2Npkh4 _2MWPVK'])[1]")).click();

	}

}
