package com.soc.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	

}
