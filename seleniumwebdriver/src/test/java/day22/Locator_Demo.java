package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://career-kuch-hatke.vercel.app/");
		//driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Name Locator
		//driver.findElement(By.name("q")).sendKeys("iPhone");
		
		//Id Locator
		/*
		 * driver.findElement(By.id("slot-list-container")); boolean slot_container =
		 * driver.findElement(By.id("slot-list-container")).isDisplayed();
		 * System.out.println(slot_container);
		 */
		
		//linkText(Prefferable) & partialLinkText(Not-Prefferable)
		//driver.findElement(By.linkText("About")).click();
		/*
		 * driver.findElement(By.partialLinkText("ore")).click();
		 * driver.findElement(By.partialLinkText("ers")).click();
		 */
		
		/*
		 * List<WebElement> NavBars = driver.findElements(By.className("large-12"));
		 * System.out.println("Total number of navbar links are:" +NavBars.size());
		 */
		
		//driver.findElement(By.linkText("Explore")).click();
		
		WebElement menu = driver.findElement(By.className("nav-menu"));
		List<WebElement> links = menu.findElements(By.tagName("a"));

		System.out.println("Total navbar links: " + links.size());
		
	}

}
