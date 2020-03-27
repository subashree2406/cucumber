package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.functionallibrary.Baseclasss;

public class loginPage extends Baseclasss{
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement logo;
@FindBy(id="email")
	private WebElement emailfield;
@FindBy(id="passwd")
	private WebElement passwordfield;
@FindBy(id="SubmitLogin")
	private WebElement loginsubmit;		//login
@FindBy(xpath="//span[text()='suba shree']")
private WebElement myname;	//myname

public WebElement getLogo() {
	return logo;
}

public WebElement getMyname() {
	return myname;
}

public WebElement getEmailfield() {
	return emailfield;
}

public WebElement getPasswordfield() {
	return passwordfield;
}


public WebElement getLoginsubmit() {
	return loginsubmit;
}



public loginPage() {
	PageFactory.initElements(driver, this);
}
	
	
	
	}
