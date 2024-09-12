package com.soc.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.soc.pom.Home;

public class Base {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openbrowser",true);
		 driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.quit();
	}
	
	@BeforeMethod
	public void Login() throws IOException {
		Reporter.log("Login",true);
		File f = new File();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		
		com.soc.pom.Login l= new com.soc.pom.Login(driver);
		l.setLogin(un, pw);
		
	
		
	}
	
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		Home h = new Home(driver);
		h.setLogout();
	}

}
