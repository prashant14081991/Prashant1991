package w3pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3class1 {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jabar\\OneDrive\\Desktop\\Prashant\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		
		WebElement searchtab = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		searchtab.sendKeys("JavaScript Popup Boxes");
		WebElement searchclick = driver.findElement(By.xpath("//button[@type='button']"));
		searchclick.click();
		Thread.sleep(3000);
		WebElement popup = driver.findElement(By.xpath("(//b[text()='JavaScript Popup Boxes'])[1]"));
		popup.click();
		Thread.sleep(3000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alertbox.click();
		confirm.click();
		prompt.click();
		line.click();
		
		String mainpage =driver.getWindowHandle();
		System.out.println(mainpage);
		
		ArrayList<String> addr2 = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(addr2.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr2.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr2.get(3));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr2.get(4));
		System.out.println(driver.getCurrentUrl());

		
		
		//WebElement exercise = driver.findElement(By.xpath("//a[contains(@onclick,'w3_open')][3]"));
		//exercise.click();
		//Thread.sleep(3000);
		
		//WebElement sql = driver.findElement(By.xpath("//a[text()='SQL Exercises']"));
		//sql.click();
		//Thread.sleep(3000);
		
		//WebElement next = driver .findElement(By.xpath("//a[contains(text(),'Next')]"));
		//next.click();
	//	Thread.sleep(3000);
		
		//WebElement glass = driver.findElement(By.xpath("//a[contains(@class,'topnav-icons fa')][3]"));
		//glass.click();
		//WebElement textbox = driver.findElement(By.xpath("//input[@spellcheck='false']"));
		//textbox.sendKeys("HTML");
		//WebElement blueglass = driver.findElement(By.xpath("//button[contains(@class,'gsc-search-button')]"));
		//blueglass.click();
		
	}

}

}
