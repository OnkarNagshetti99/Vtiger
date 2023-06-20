package Vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Campaign {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
	      d.manage().window().maximize();
	      d.get("https://demo.vtiger.com/vtigercrm/");
	      d.findElement(By.xpath("//button[text()='Sign in']")).click();
	      Thread.sleep(2000);
	      d.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
	      
	     WebElement marketing = d.findElement(By.xpath("//span[text()=' MARKETING']"));
	     Actions a = new Actions(d);
	     a.moveToElement(marketing).perform();
	     d.findElement(By.xpath("//span[text()=' Campaigns']")).click();
	     d.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
	     d.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Save Nature");
	     d.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("29-06-2023");
	     d.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("Young People");
	     d.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("Onkar Nagshetti");
	     d.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("100000");
	     d.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("70");
	     d.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("1000000 ");
	     d.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("750000");
	     d.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("1500");
	     d.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("1200000");
	     d.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("1000");
	     d.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("15000");
	     d.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("9577");
	     d.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("100000");
	     d.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("260000");
	     d.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("Learned Lots of New Things And faced New Challenges");
	     d.findElement(By.xpath("//button[text()='Save']")).click();
	     
	}

}
