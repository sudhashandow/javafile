import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example 
{
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MOHAN\\MOHAN\\Selenium\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();   // To Maximize Browser
		
		d1.get("http://newtours.demoaut.com/");
		
				
		if(d1.getTitle().equals("Welcome: Mercury Tours"))
		
			System.out.println("Application Opened");
		else
		
			System.out.println("Application Not Opened");
			
		
		
		d1.findElement(By.linkText("SIGN-ON")).click();
		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury1");
		
		Thread.sleep(5000);
		
		d1.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
				
		try
		{
			d1.findElement(By.linkText("SIGN-OFF"));  // If The Element Present Then Only It Will Goto Next Line Else  It Will goto Catch Block
			
			System.out.println("Login Successful");

			d1.findElement(By.linkText("SIGN-OFF")).click();
			
			System.out.println("Logout Clicked");
			
			d1.close();
			
										
		}
		catch (Exception x )
			{
				System.out.println("Login Fail");
				d1.close();
			}
		
	}
	
	

}