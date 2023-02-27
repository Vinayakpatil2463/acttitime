package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_applying_wait_url {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//by using explicit method
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        String expectedurl="https://demo.actitime.com/user/submit_tt.do";
        String actualurl=driver.getCurrentUrl();
       
        if(actualurl.equals(expectedurl))
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        
        
	}

}
//false
//login page url
