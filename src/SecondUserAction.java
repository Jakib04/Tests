import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SecondUserAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/jakib/Desktop/b/chromedriver");
		
		 ChromeDriver driver = new ChromeDriver();
		 String URL="http://automationpractice.com/index.php";

		 driver.get(URL);
		 
		
		 
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  //Sign in
		 
		  driver.findElement(By.linkText("Sign in")).click();
		 
		  driver.findElement(By.id("email")).sendKeys("karim10101@gmail.com");
		  driver.findElement(By.id("passwd")).sendKeys("13579");
		  driver.findElement(By.id("SubmitLogin")).click();
		  
		  // DRESSES

		  driver.findElement(By.linkText("DRESSES")).click();
		  driver.findElement(By.linkText("CASUAL DRESSES")).click();
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
		
			}
		  js.executeScript("window.scrollBy(0,500)");
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	
        try {
			Thread.sleep(3000);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
	
		  }
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")).click();
        
	
		  
      //T-SHIRTS
		  
		  driver.findElement(By.linkText("T-SHIRTS")).click();  
		  
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[2]/ul/li[2]/input")).click();
		  
		 
		  js.executeScript("window.scrollBy(0,500)");
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div")).click();
	
		  
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		 
		  try {
	  			Thread.sleep(3000);
	  		  } catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  	
	  		  }
		  
		  driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		
		  //Payment
		  
		  js.executeScript("window.scrollBy(0,500)");
		  
		  
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")).click();
		  js.executeScript("window.scrollBy(0,500)");
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		  
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")).click();
		  
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button")).click();
		  js.executeScript("window.scrollBy(0,500)");
		  driver.findElement(By.xpath(" /html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  
		  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
		
		  driver.findElement(By.xpath("  /html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();






	}

}
