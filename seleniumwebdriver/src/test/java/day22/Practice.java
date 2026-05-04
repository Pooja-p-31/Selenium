package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://career-kuch-hatke.vercel.app/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Explore")).click();
		
		String title_check = driver.getTitle();
		if(title_check.equals("Explore Careers - Career Kuch Hatke"))
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		WebElement searchBox = driver.findElement(By.id("career-search"));
		searchBox.sendKeys("Designer");
		
		//driver.findElement(By.className("career-grid")).findElement(By.linkText("Know More →")).click();
		driver.findElement(By.className("card-btn")).click();
		
		
		
	
		
	
	}

}
