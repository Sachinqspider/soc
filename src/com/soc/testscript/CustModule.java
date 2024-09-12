package com.soc.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.soc.generic.Base;
import com.soc.generic.File;
import com.soc.pom.Home;
import com.soc.pom.Task;
@Listeners(com.soc.generic.Listener.class)
public class CustModule extends Base {
	@Test 
	public void testCreatCust() throws IOException {
		Reporter.log("Create Customer Module",true);
		File f = new File();
		String CustomerName = f.getExcellyData("CreateCustomer", 1, 2);
		String CustomerDescription = f.getExcellyData("CreateCustomer", 1, 3);
		
		Home h = new Home(driver);
		h.setTaskTab();
		
		Task t = new Task(driver);
		t.getAddBtn().click();
		t.getNewBtn().click();
		t.getComynmtbx().sendKeys(CustomerName);
		t.getComydesptbx().sendKeys(CustomerDescription);
		t.getSelbtn().click();
		t.getClkOurCmpy().click();
		t.getCr().click();
	}
	
	
	
	

}
