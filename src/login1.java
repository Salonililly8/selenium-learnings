package (default package);

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  * Test Started* ");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		sleep(1);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		sleep(1);
		driver.findElement(By.name("username")).sendKeys("Admin");
		sleep(1);
		driver.findElement(By.name("password")).sendKeys("admin123");
		sleep(1);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		sleep(1);
//		System.out.println(driver.findElement(By.xpath("(//p[@class='oxd-userdropdown-name'])[1]")).getText());
		sleep(2);
		driver.findElement(By.cssSelector(".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click();
		sleep(2);
		driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
		sleep(2);
		driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
		sleep(1);
		driver.findElement(By.cssSelector(".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click();
		sleep(2);
		driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
		sleep(2);
		
		driver.close();
		System.out.println("Test Completed!!");
	}

	private static void sleep(int s) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(s*1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}