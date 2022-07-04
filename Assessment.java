package com.mindtree.Assesment;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		System.out.print(driver.getTitle());
		
		//WebElement a = driver.findElement(By.cssSelector("a[href*='personal-finance']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(a).build().perform();
		//driver.findElement(By.cssSelector("a[href*='income-tax-calculator']")).click();
		
		

	}

}
