package SeleniumPkg;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AjaxTest {
@Test
	public  void f() {
	 System.setProperty("webdriver.chrome.driver","C:\\files\\chromedriver.exe" );
	  WebDriver driver=new ChromeDriver();    
        /*Wait for grid to appear*/
        driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
        By container = By.cssSelector(".demo-container");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(container));
        
        /*Get the text before performing an ajax call*/
        WebElement noDatesTextElement =   driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
        String textBeforeAjaxCall = noDatesTextElement.getText().trim();
        
        /*Click on the date*/
        driver.findElement(By.linkText("1")).click();
    
        /*Wait for loader to disappear */
        By loader = By.className("raDiv");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
        
        /*Get the text after ajax call*/
        WebElement selectedDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
        wait.until(ExpectedConditions.visibilityOf(selectedDatesTextElement));
        String textAfterAjaxCall = selectedDatesTextElement.getText().trim();
        
        System.out.println(textBeforeAjaxCall);
        
        System.out.println(textAfterAjaxCall);
    }


	}