package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main(String[]args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livin\\lizia\\RobotClass\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html#google_vignette");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Robot r=new Robot();
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.click();
	    r.keyPress(KeyEvent.VK_L);
	    r.keyPress(KeyEvent.VK_I);
	    r.keyPress(KeyEvent.VK_Z);
	    r.keyPress(KeyEvent.VK_I);
	    r.keyPress(KeyEvent.VK_A);
	    WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.click();
	    r.keyPress(KeyEvent.VK_R);
	    r.keyPress(KeyEvent.VK_O);
	    r.keyPress(KeyEvent.VK_S);
	    r.keyPress(KeyEvent.VK_I);
	    WebElement Adress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	    Adress.click();
	    r.keyPress(KeyEvent.VK_R);
	    r.keyPress(KeyEvent.VK_O);
	    r.keyPress(KeyEvent.VK_S);
	    r.keyPress(KeyEvent.VK_I);

	    
		
	}

}
