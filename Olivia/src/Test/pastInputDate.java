package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pastInputDate {

	public WebDriver driver;
	@Test
	public void pastInput()
	{
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("12/12/2021");
	driver.findElement((By.xpath("//input[@type='submit']"))).click();
	WebElement op = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div"));
	String txt = op.getText();
	System.out.println("Output: "+txt);
    String value = "Invalid date";
	Assert.assertTrue(txt.contains(value));
	}
	 @BeforeClass
	    public void before5()
	    {
	    	System.setProperty("webdriver.chrome.driver", "/Users/vikki/Documents/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://vast-dawn-73245.herokuapp.com/");
			
	    }
	   @AfterClass
	   public void after5()
	   {
		   driver.quit();
	   }

}