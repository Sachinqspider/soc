package com.soc.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {
	

	public WebElement getSelbtn() {
		return selbtn;
	}

	public WebElement getClkOurCmpy() {
		return clkOurCmpy;
	}

	public WebElement getCr() {
		return cr;
	}

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newBtn;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement comynmtbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement comydesptbx;
	

	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement selbtn;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement clkOurCmpy;
	

	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement cr;
	
	public Task(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getNewBtn() {
		return newBtn;
	}

	public WebElement getComynmtbx() {
		return comynmtbx;
	}

	public WebElement getComydesptbx() {
		return comydesptbx;
	}
	
	
	
	
	

}
