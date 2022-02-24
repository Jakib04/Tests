
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class CreatingFirstUser {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "/home/jakib/Desktop/b/chromedriver");
		
		 ChromeDriver driver = new ChromeDriver();
		 String URL="http://automationpractice.com/index.php";

		 driver.get(URL);
		 
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 //Sign in
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		 //Email
		 driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("rahim10101@gmail.com"); 
		 driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
			
			}
		
		 //Information
		 
		  
		  driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Rahim"); 
		  driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Uddin"); 
		  driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("13579");
		 
		  js.executeScript("window.scrollBy(0,800)");
		  //date
		  WebElement date=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		  Select dt=new Select(date);
		  dt.selectByValue("1");
		  WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		  Select mt=new Select(month);
		  mt.selectByValue("1");
		  WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		  Select yr=new Select(year);
		  yr.selectByValue("1997");
		 
		  driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("RU limited"); 
		  driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Alabama"); 
		 
		  driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("House 2"); 
		  driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Alabama"); 
		  //state
		  WebElement s=driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		  Select t=new Select(s);
		  t.selectByValue("1");
		  driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("41234"); 
	
		  driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9612345"); 
		
		 
		  driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Florida"); 
		  
		  
		  try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		  driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click(); 

	}

}
