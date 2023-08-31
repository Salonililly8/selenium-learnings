package lambdatest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogIn();
	}
	
public static void LogIn() {
		
		String username = "saloniazad8@gmail.com";
		String Password = "Lily@123";
		System.out.println("  ** Test Started** ");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		System.out.println("Browser opened");
		
//		 Navigate to the login page
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		// explicit wait - to wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By..cssSelector(".icon.fas.fa-user")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icon.fas.fa-user")));
		
		driver.findElement(By.cssSelector(".icon.fas.fa-user")).click();
		
//		Find the email
		driver.findElement(By.cssSelector("#input-email")).sendKeys(username);
		
		driver.findElement(By.cssSelector("#input-password")).sendKeys(Password);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='Login']")));
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		
		
		if (driver.getCurrentUrl().equals("https://ecommerce-playground.lambdatest.io/index.php?route=account/account")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

		driver.close();
		
		
		
}

}
