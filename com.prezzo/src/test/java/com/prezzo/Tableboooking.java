package com.prezzo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tableboooking {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.prezzorestaurants.co.uk/");
		
		/*driver.findElement(By.id("UserUsername")).sendKeys("Prezzo.Support");
		driver.findElement(By.id("UserPassword")).sendKeys("1nf0rmationT3chn0l0gy!");
		driver.findElement(By.className("submit")).click();
*/
		WebElement options=driver.findElement(By.xpath("//*[@id=\"frmFindaPrezzo\"]/div/div/div/div[1]/input[1]"));
		
		options.sendKeys("Dartford");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		options.sendKeys(Keys.ARROW_DOWN);
		
		options.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//*[@id=\"restaurant-results\"]/section[1]/div/div/div[1]/div[1]/div[4]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"2\"]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"3\"]/a")).click();
	
		//driver.findElement(By.xpath("//*[@id=\"pane-3\"]/section/div/div/div[1]/div/div[2]/p/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/section/div[1]/div[1]/a[2]")).click();
		
		
		WebElement options1=driver.findElement(By.xpath("//*[@id=\"pane-1\"]/section/div/div/div/div/div/div[1]/input[1]"));
		
		options1.sendKeys("Kings cr");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		options1.sendKeys(Keys.ARROW_DOWN);
		
		options1.sendKeys(Keys.ENTER);
		
		
		//clicking the menu 
		
		 driver.findElement(By.xpath("//*[@id=\"navbarMenu\"]/nav/a[2]/span")).click();
		 
		 //Pasta options
		 
		 driver.findElement(By.xpath("/html/body/section[2]/section/div[2]/div/div/div/div/div[3]/div/nav/a[2]/span")).click();
		 
		 //scroll down 
		 
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 
		 jse.executeScript("window.scrollBy(0,1500);");
		 
	
		 
		 // careers link
		 
		 driver.findElement(By.cssSelector("body > footer > div > div > div.columns.is-mobile > div:nth-child(2) > ul > li:nth-child(2) > a")).click();
		 
		 try {
			Thread.sleep(0, 2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //back to home page
		 
		 driver.findElement(By.xpath("//*[@id=\"navbarMenu\"]/nav/a[1]/span")).click();
		 
		 try {
			Thread.sleep(0,2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 // clicking on search restaurant
		 
		 driver.findElement(By.xpath("//*[@id=\"order-restaurant\"]")).click();
		 
		 try {
			Thread.sleep(0,2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 driver.findElement(By.xpath("//*[@id=\"order-restaurant\"]/optgroup[1]/option[2]")).click();
		 
		 try {
			Thread.sleep(0,2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"frmFindaPrezzo\"]/div/div/div/div[4]/a")).click();
		 
		 try {
			Thread.sleep(0,2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 driver.findElement(By.cssSelector("#app > div > header > div > a")).click();
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"UsedSearchFields_SearchString\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"cookie-banner-button\"]")).click();
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"frmFindaPrezzo\"]/div/div/div/div[4]/a")).click();
		
		
	}

}
