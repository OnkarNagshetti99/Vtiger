package opencart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) 
	{
      WebDriver d = new ChromeDriver();
      d.manage().window().maximize();
     // d.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
      d.get("https://www.opencart.com/index.php?route=account/registe");
     // d.findElement(By.linkText("Register")).click();
      
      
	}

}
