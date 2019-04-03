package sampleProjectMaven;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import sampleProjectMaven.LoginTestCase;
public class Login {

	@Test
	public void run() {
		
	LoginTestCase.driver.findElement(By.id("email")).sendKeys("Manipanjala@gmail.com");
	LoginTestCase.driver.findElement(By.id("pass")).sendKeys("Wherethe@123");
	LoginTestCase.driver.findElement(By.id("loginbutton")).click();
	}

}
