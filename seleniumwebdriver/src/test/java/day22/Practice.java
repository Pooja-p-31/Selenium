/*package day22;

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
		Thread.sleep(5000)	;
		//driver.findElement(By.className("career-grid")).findElement(By.linkText("Know More →")).click();
		driver.findElement(By.xpath("//*[@class='card-btn'")).click();
		
		
		
	
		
	
	}


*/

package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Practice {

    public static void main(String[] args) throws InterruptedException {

        // 1) Launch Chrome & navigate
        WebDriver driver = new ChromeDriver();
        driver.get("https://career-kuch-hatke.vercel.app/");
        driver.manage().window().maximize();

        // 2) Click Explore in navbar
        driver.findElement(By.linkText("Explore")).click();

        // 3) Title validation
        String title_check = driver.getTitle();
        if (title_check.equals("Explore Careers - Career Kuch Hatke")) {
            System.out.println("Title Check - True ✅");
        } else {
            System.out.println("Title Check - False ❌");
        }

        // 4) Type "Designer" in search box
        WebElement searchBox = driver.findElement(By.id("career-search"));
        searchBox.sendKeys("Designer");

        // 5) Wait for cards to filter
        Thread.sleep(2000);

        // 6) Get ALL "Know More" buttons (hidden + visible)
        List<WebElement> allBtns = driver.findElements(
            By.xpath("(//*[text()='Ethical Fashion Designer']//following-sibling::a[@class='card-btn'])[1]")
        );
        System.out.println("Total buttons found: " + allBtns.size());

        // 7) Loop through and click FIRST visible button
        boolean clicked = false;
        for (WebElement btn : allBtns) {
            if (btn.isDisplayed()) {

                // Scroll to the button first
                ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView(true);", btn
                );
                Thread.sleep(500);

                // Click using JavaScript
                ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", btn
                );

                System.out.println("Know More clicked successfully ✅");
                clicked = true;
                break;
            }
        }

        // 8) If no visible button found
        if (!clicked) {
            System.out.println("No visible button found ❌");
        }

    }
}
