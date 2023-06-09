package learningautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static WebDriver driver; //it's an instance variable declared under the class

	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");
	}

}
