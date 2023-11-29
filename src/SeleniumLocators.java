package seleniumlocators;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Program1 {
		
	@Test
	public void testSet() throws Exception {
				// Launch a browser
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			d.manage().deleteAllCookies();
	
			// Launch the url
			d.get("https://jqueryui.com/");
			
			//click on datepicker
			d.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
			
			//verify the title of page 
			assertEquals(d.getTitle(),"Datepicker | jQuery UI");
			
			//switching focus to inside frame
			WebElement stringFrame =d.findElement(By.className("demo-frame"));
			d.switchTo().frame(stringFrame);
			
			//Click on Date field
			WebElement dateField = d.findElement(By.xpath("//input[@id='datepicker']"));
			dateField.click();
			
			//Click on next icon to change the current month to next month
			d.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			//Click on date 22 in the calender pop-up
			WebElement date22 = d.findElement(By.xpath("//a[@data-date='22']"));
			date22.click();
			
			//printing the selected date by getting attribute
			String selectedDate = dateField.getAttribute("value");
			
			System.out.println("The Selected Date is: "+ selectedDate);
			
		//Close the browser	
		d.quit();
	}
}
-------------------------------------------------------------------------------------------------------------------------------
  2.program
  package seleniumlocators;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program2 {
	
	@Test
	public void testSet() throws Exception {
				// Launch a browser
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			d.manage().deleteAllCookies();
	
			// Launch the url
			d.get("https://www.guvi.in/");
			
			//click on Signup button
			d.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']")).click();
			
				//Enter Name
				d.findElement(By.id("firstName")).sendKeys("test");
				//Enter LastName
				d.findElement(By.id("lastName")).sendKeys("user");
				//Enter email
				d.findElement(By.xpath("(//input)[3]")).sendKeys("testuser568966@gmail.com");
				//password
				d.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Test@123");
				//mobile number
				d.findElement(By.xpath("//input[@maxlength='20']")).sendKeys("90123456786");
				
			//Click on Signup button
			d.findElement(By.xpath("//button[@id='signup']")).click();	
			
			Thread.sleep(2000);
			//Verify successful registration
			
			WebElement status = d.findElement(By.xpath("//h2[@id='status_title']"));
			assertEquals(status.getText(),"Successfully Registered");
			
			//Refresh the page
			
			d.navigate().refresh();
			
			//Click on Proceed to Login
			d.findElement(By.xpath("//a[@id='status_proceed']")).click();
			
			//Enter valid email
			d.findElement(By.id("login_email")).sendKeys("testuser568966@gmail.com");
			
			//Enter password
			d.findElement(By.id("login_password")).sendKeys("Test@123");
			
			//Click on Login
			d.findElement(By.id("login_button")).click();
			Thread.sleep(2000);
			
			// Verify the page
			assertEquals(d.getTitle(),"GUVI | courses");
	
		d.quit();
	}

}









