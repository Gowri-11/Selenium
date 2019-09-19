package SeleniumPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ActionsMoveToElement {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\files\\chromedriver.exe" );
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  
	  //how to get title of the webpage using javascript
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  String sText=js.executeScript("return document.title;").toString();
	  System.out.println(sText);
	  
	WebElement signin_icon=driver.findElement(By.linkText("login.htm"));
	  JavascriptExecutor executor=(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();", signin_icon);
	 
	 // WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	 // WebElement ouroffice=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul//li/a/span"));
	 // WebElement Bangalore=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul//li/ul/li[2]/a/span"));
	  
	 // Actions action=new Actions(driver);
	//  action.moveToElement(aboutus).click().build().perform();
	  
	 // WebDriverWait wait=new WebDriverWait(driver,50);
	  
	 // wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
	 // action.moveToElement(ouroffice).click().build().perform();
	  
	  //wait.until(ExpectedConditions.elementToBeClickable(Bangalore));
	  //action.moveToElement(Bangalore).click().build().perform(); 
	  
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
