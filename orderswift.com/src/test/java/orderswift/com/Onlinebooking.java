package orderswift.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Onlinebooking {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dashboard.orderswift.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Adam.preston@prezzo.co.uk");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("BoostT*wer49p");
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/div/button")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"sideBarMenu\"]/li[2]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"sideBarMenu\"]/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"si_prezzo3351migr\"]/td[5]/a")).click();
		
	
		
		
		try {
			Thread.sleep(0,3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//cancel 
		
		driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/div/button[1]")).click();
		
		//next restaurant
		
		driver.findElement(By.xpath("//*[@id=\"si_prezzo3686migr\"]/td[5]/a")).click();
		
		
		//cancel 
		
				driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/div/button[1]")).click();
				
				
				//clicking on orders
				
				driver.findElement(By.xpath("//*[@id=\"sideBarMenu\"]/li[5]/a")).click();
				
				
				//clicking on users
				
				driver.findElement(By.xpath("//*[@id=\"sideBarMenu\"]/li[8]/a")).click();
				
				
				//back to main menu
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/nav/a[2]")).click();
				
				//validating search button
				
				driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Lakeside");
				
				//clicking on search 
				
				driver.findElement(By.xpath("//*[@id=\"navbarProfile\"]/div/form/div/div/button/img")).click();
				
				//cancel
				driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/div/button[1]")).click();
				
				//logout
				
				driver.findElement(By.xpath("//*[@id=\"account-icon\"]")).click();
				
				
				//click logout
				
				driver.findElement(By.xpath("//*[@id=\"account-navbar\"]/li/div/a[4]")).click();

	}

}
