package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Organization {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver d = new ChromeDriver();
      d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      d.get("https://demo.vtiger.com/vtigercrm/");
      d.manage().window().maximize();
      JavascriptExecutor js =(JavascriptExecutor)d;

      d.findElement(By.xpath("//button[text()='Sign in']")).click();
      
      Thread.sleep(2000);
      d.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
       WebElement marketing = d.findElement(By.xpath("//span[text()=' MARKETING']"));
       
       Actions a = new Actions(d);
       a.moveToElement(marketing).perform();
       
       d.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
       d.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
       d.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Swatcha Bharat");
       d.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("https://swachhbharatmission.gov.in/sbmcms/index.htm");
       d.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("8379966299");
       d.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("SB");
       d.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("NA");
       d.findElement(By.id("account_id_display")).sendKeys("Swatcha Bharat");
       d.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("8888170497");
       d.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("1600");
       d.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("onkarnagshetti@gmail.com");
       d.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("onkarnagshetti556@gmail.com");
       // js.executeScript("window.scroll(0,2000)");
       
       d.findElement(By.id("s2id_autogen3")).click();
       d.findElement(By.xpath("(//li[@role='presentation'])[2]")).click();

       d.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("100%");
       d.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("99");
       d.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("60,00,000");
       d.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();


       d.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Deccan Gymkhana Near Sunny Pride Building , pune");
       d.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Dandekar pool Municipal Colony , Pune");
       d.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();

       d.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("NA");
       d.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("NA");
       d.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("PUNE");
       d.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("PUNE");
       d.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("MAHARASHTRA");
       d.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("MAHARASHTRA");
       d.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("411011");
       d.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("413002");
       d.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("INDIA");
       d.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("INDIA");
       d.findElement(By.xpath("//textarea[@name='description']")).sendKeys("OLY OUR MOTO IS TO "+"SWATCHA BHARAT SUNDAR BHARAT");
       d.findElement(By.xpath("//button[@type='submit']")).click();


       

       



       


       



       
       


       

       
       

       


       


       
      
     
	}

	
}
