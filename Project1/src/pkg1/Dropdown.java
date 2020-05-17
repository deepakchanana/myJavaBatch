package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
  public static void main(String[] args)
  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Options op=driver.manage(); // manage returned a object
	Window w=op.window(); // by that object we called window method and it is also returning a object
	w.maximize(); // by that object we called the maximize method
	
	WebElement drop_month=driver.findElement(By.cssSelector("select#month")); // locating month webelement
	Dropdown d=new Dropdown();
	d.dropDownSelection(drop_month,"Aug");
	
	WebElement drop_year=driver.findElement(By.cssSelector("select#year"));
	d.dropDownSelection(drop_year, "1995");
	
  }
  
  public void dropDownSelection(WebElement dropDownElement,String visibleText)
  {
	Select s=new Select(dropDownElement);
	s.selectByVisibleText(visibleText);
  }
}
