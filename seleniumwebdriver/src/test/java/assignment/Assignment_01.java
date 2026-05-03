package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_01 {

	/* 
		Assignment
		1) Launch browser (edge)
		2) Open URL https://demo.nopcommerce.com/ 
		3) Validate title should be
		4) close page
		"nopCommerce demo store'
	*/
	
	public static void main(String[] args) 
	{
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://demo.nopcommerce.com/");
	 
	 String actual_result = driver.getTitle();
	 if (actual_result.equals("nopCommerce demo store. Home page title")) 
	 {
		 System.out.println("Test Case Passed!");
	 }
	 else 
	 {
		 System.out.println("Test Case Failed!");
	 }
	 
	}

}
