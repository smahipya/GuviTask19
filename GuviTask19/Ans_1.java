package GuviTask19;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ans_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.guvi.in/register");
		driver.findElement(By.className("form-control")).sendKeys("Testmahi");
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys("testmahi15@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password@123");
		driver.findElement(By.id("mobileNumber")).sendKeys("9677672869");
		WebElement text = driver.findElement(By.tagName("h2"));
		text.getText();
		driver.findElement(By.id("signup-btn")).click();

	}

}
