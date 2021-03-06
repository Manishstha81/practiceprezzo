package lives.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Specialdays {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		//Launching Browser and Live res 
		
		WebDriverManager.chromedriver().setup();
		 
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://tables.izone-app.com/users/login");
		
		driver.findElement(By.id("UserUsername")).sendKeys("Prezzo.Support");
		driver.findElement(By.id("UserPassword")).sendKeys("1nf0rmationT3chn0l0gy!");
		driver.findElement(By.className("submit")).click();
		
		
		//Clicking Restaurant name 
		
		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Christchurch");
		
		driver.findElement(By.xpath("//*[@id=\"searchSubmit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[7]/a[1]")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[4]/td[7]/a[1]")).click();
		
		
		
		//clicking manage tables
		
		
		WebElement site= driver.findElement(By.xpath("//*[@id=\"navbar\"]/li[1]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(site).perform();
		
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/li[1]/div/span[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tabvanilla\"]/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/ul/li/a")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"insertnew\"]")).click();
		
		
		//clicking on turn times
		
		
		WebElement capacity= driver.findElement(By.xpath("//*[@id=\"navbar\"]/li[3]"));
		
		Actions action1=new Actions(driver);
		
		action.moveToElement(capacity).perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/li[3]/div/span[1]/a")).click();
		
		
		
		
		
		//clicking standard days tab and configurations 
		
		
		driver.findElement(By.xpath("//*[@id=\"tabvanilla\"]/li[3]/a")).click();
		
		Select list=new Select(driver.findElement(By.xpath("//*[@id=\"SlotSetSlotSessionId\"]")));
		list.selectByVisibleText("Lunch");
		
		Select list1=new Select(driver.findElement(By.xpath("//*[@id=\"SlotSetStartTsHour\"]")));
		list1.selectByValue("10");
		
		
		Select list2=new Select(driver.findElement(By.xpath("//*[@id=\"SlotSetStopTsHour\"]")));
		list2.selectByValue("22");
		
		
		
		
		
		
		
			driver.findElement(By.xpath("//*[@id=\"SlotSetMinTableSize\"]")).sendKeys("12");;
	
			driver.findElement(By.xpath("//*[@id=\"SlotSetMaxTableSize\"]")).sendKeys("11");;
			
			driver.findElement(By.xpath("//*[@id=\"SlotSetFutureMinutes\"]")).sendKeys("30");
			
			driver.findElement(By.xpath("//*[@id=\"SlotSetStypeId5\"]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"SlotSetStypeId6\"]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"SlotSetStypeId7\"]")).click();
		
			
			//clicking on special days 
		
		
		driver.findElement(By.xpath("//*[@id=\"tabvanilla\"]/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tabvanilla\"]/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SpecialDayIndexForm\"]/fieldset/img[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SpecialDayIndexForm\"]/fieldset/img[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SpecialDayDescription\"]")).sendKeys("Closure");
		
	
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a")).click();
*/
	
	}

}
