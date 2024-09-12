package com.soc.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(id="logoutLink")
	private WebElement lgout;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasksTab;
	
	
	

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		lgout.click();
	}
   public void setTaskTab() {
	   tasksTab.click();
   }
}
