package com.cucumber.stepdefinition;

import static org.junit.Assert.assertTrue;

import com.cucumber.functionallibrary.Baseclasss;
import com.cucumber.pom.Account;
import com.cucumber.pom.Authenticationpage;
import com.cucumber.pom.HomePage;
import com.cucumber.pom.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends Baseclasss {


@Given("^user launches the browser and clicks the url$")
public void user_launches_the_browser_and_clicks_the_url() throws Throwable {
    browserLaunch("chrome", "http://automationpractice.com/index.php");

}

@Then("^user verifies whether logo is present$")
public void user_verifies_whether_logo_is_present() throws Throwable {
	HomePage hp=new HomePage();
    boolean displaylogo = hp.getLogo().isDisplayed();
    Assert.assertTrue(displaylogo);
}

@When("^user clicks the signin button$")
public void user_clicks_the_signin_button() throws Throwable {
    HomePage hp=new HomePage();
    click(hp.getLoginbutton());
    }

@When("^user clicks the emailfield$")
public void user_clicks_the_emailfield() throws Throwable {
    loginPage lp=new loginPage();
    click(lp.getEmailfield());
    
}

@When("^enters emailid in the idfield$")
public void enters_emailid_in_the_idfield() throws Throwable {
    loginPage lp=new loginPage();
    inputValueUsingSendkeys(lp.getEmailfield(), "subashree77@gmail.com");
    
}

@When("^user click and enter password in password field$")
public void user_click_and_enter_password_in_password_field() throws Throwable {
    loginPage lp=new loginPage();
    click(lp.getPasswordfield());
    inputValueUsingSendkeys(lp.getPasswordfield(), "subashree77");

}
@Then("^verify login button is displayed$")
public void verify_login_button_is_displayed() throws Throwable {
    loginPage lp=new loginPage();
    boolean logindisplayed = lp.getLoginsubmit().isDisplayed();
    Assert.assertTrue(logindisplayed);
}

@When("^click on login button$")
public void click_on_login_button() throws Throwable {
    loginPage lp=new loginPage();
    click(lp.getLoginsubmit());
    
}




@When("^user select womenfield using mousehover$")
public void user_select_womenfield_using_mousehover() throws Throwable {
Account ac=new Account();
mouseHover(ac.getWomen());

}

@When("^click on womenfield in account page$")
public void click_on_womenfield_in_account_page() throws Throwable {
	Account ac=new Account();
click(ac.getWomen());

}

@When("^select topsfield by clicking on it$")
public void select_topsfield_by_clicking_on_it() throws Throwable {
Account ac=new Account();
click(ac.getTops());

}

@When("^click on Tshirt field in the application$")
public void click_on_Tshirt_field_in_the_application() throws Throwable {
	Account ac=new Account();
	click(ac.getTshirts());

}
@When("^scroll to orangeshirt$")
public void scroll_to_orangeshirt() throws Throwable {
	Account ac=new Account();
	scrollUsingElement(ac.getOrange());
	mouseHover(ac.getOrange());
	
	
}

@When("^click on Addtocart on orange shirt$")
public void click_on_Addtocart_on_orange_shirt() throws Throwable {
	Account ac=new Account();
	click(ac.getAddtocart());

}

@Then("^Proceed to checkout$")
public void proceed_to_checkout() throws Throwable {
	Account ac=new Account();
	click(ac.getProceed());

}

@Then("^in summary of authenticationpage select proceed to checkout$")
public void in_summary_of_authenticationpage_select_proceed_to_checkout() throws Throwable {
Authenticationpage ap=new Authenticationpage();
click(ap.getProceedsummary());

}

@Then("^in Address bar give some message inside textarea$")
public void in_Address_bar_give_some_message_inside_textarea() throws Throwable {
	Authenticationpage ap=new Authenticationpage();
	click(ap.getTextarea());
	inputValueUsingSendkeys(ap.getTextarea(), "Please refer the address and mobile number");
	

}

@Then("^click on proceedtocheck after text$")
public void click_on_proceedtocheck_after_text() throws Throwable {
	Authenticationpage ap=new Authenticationpage();
	click(ap.getProceedaftertextbox());

}

@Then("^in shipping bar click on tickbox and proceed to checkout$")
public void in_shipping_bar_click_on_tickbox_and_proceed_to_checkout() throws Throwable {
	Authenticationpage ap=new Authenticationpage();
click(ap.getTick());
click(ap.getProceedaftertick());
}

@Then("^in payment click on payment by wire$")
public void in_payment_click_on_payment_by_wire() throws Throwable {
	Authenticationpage ap=new Authenticationpage();
	click(ap.getPayment());
}

@Then("^click on I Confirm my order$")
public void click_on_I_Confirm_my_order() throws Throwable {
	Authenticationpage ap=new Authenticationpage();
	click(ap.getConfirmorder());

}











}
