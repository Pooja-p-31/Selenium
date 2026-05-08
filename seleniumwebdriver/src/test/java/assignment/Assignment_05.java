package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_05 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/?utm_source=chatgpt.com#google_vignette");
		driver.manage().window().maximize();

	}

}
