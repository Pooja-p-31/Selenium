package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_04 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
			
		WebElement links = driver.findElement(By.className("navbar-collapse"));
		List<WebElement> all_link = links.findElements(By.tagName("a"));
		
		System.out.println("All Links: " + all_link.size());
		
		//driver.findElement(By.className("nav-link")).findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		
		 driver.findElement(By.linkText("Samsung galaxy s6")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Add to cart")).click();
		
	}

}
