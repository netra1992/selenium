package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.indianbluebook.com");
	}

}
