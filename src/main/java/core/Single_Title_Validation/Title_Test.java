package core.Single_Title_Validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Test {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new HtmlUnitDriver();
		String url = "http://www.learn2test.net";
		String title_expected = "learn2test.net";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_actual = driver.getTitle();
		
	if (title_expected.equals(title_actual)){
		System.out.println("PASSED");
	} else {
		System.out.println("FAILED");
	}
	driver.quit();
		

	}

}
