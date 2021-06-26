package automated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NumberImages {
	  @BeforeClass
	    void setUpClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\localadmin\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  }
	  @Test
	    public void imagess() throws InterruptedException {
	        ChromeDriver driver =new ChromeDriver();

	        driver.get("https://s1.demo.opensourcecms.com/wordpress/");
	        List<WebElement> listImages = driver.findElements(By.tagName("img"));
	        int figures = 0;
	        for (WebElement image : listImages){
	            if ( image.isDisplayed()){
	                figures++;
	            }
	        }
	        System.out.println("No. of total displayed images: " + figures);
	        driver.close();
	  }
	  @Test
	    public void buttons() throws InterruptedException {
	        ChromeDriver driver =new ChromeDriver();

	        driver.get("https://s1.demo.opensourcecms.com/wordpress/");
	        List<WebElement> listButtons = driver.findElements(By.tagName("button"));

	        int counts = 0;
	        for (WebElement button : listButtons) {
	            if(button.getText().equals("buttonName")) {
	                counts++;
	            }
	        }
	        System.out.println("No. of total displyed buttons: " + counts);

	        driver.close();
	    }



	}

