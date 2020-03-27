package com.cucumber.outlinestepdef;

	import com.cucumber.functionallibrary.Baseclasss;
	import com.cucumber.pom.Authenticationpage;
	import com.cucumber.pom.HomePage;
	import com.cucumber.pom.loginPage;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	public class outlinestepdef extends Baseclasss {
		@Given("^Launch the browser and click on url$")
		public void launch_the_browser_and_click_on_url() throws Throwable {
			 browserLaunch("chrome", "http://automationpractice.com/index.php");
		   
		   
		}

		@When("^click on signin button$")
		public void click_on_signin_button() throws Throwable {
			HomePage hp=new HomePage();
		    click(hp.getLoginbutton());

		   
		}

		@When("^user enters the username in emailid field$")
		public void user_enters_the_username_in_emailid_field() throws Throwable {
			loginPage lp=new loginPage();
		    click(lp.getEmailfield());
		    inputValueUsingSendkeys(lp.getEmailfield(), "subashree77@gmail.com");
		}

		@When("^user enters the password in password field$")
		public void user_enters_the_password_in_password_field() throws Throwable {
			 loginPage lp=new loginPage();
			 click(lp.getPasswordfield());
			 inputValueUsingSendkeys(lp.getPasswordfield(), "subashree77");

		}

		@Then("^user click on signin button$")
		public void user_click_on_signin_button() throws Throwable {
			loginPage lp=new loginPage();
		    click(lp.getLoginsubmit());
		    
		   
		}



@When("^user mousehover to the product$")
public void user_mousehover_to_the_product() throws Throwable {
HomePage hp=new HomePage();
mouseHover(hp.getProduct());
}


@When("^user enter a \"([^\"]*)\" in search menu$")
public void user_enter_a_in_search_menu(String arg1) throws Throwable {
	HomePage hp=new HomePage();
	inputValueUsingSendkeys(hp.getSearchbox(), arg1);
	click(hp.getSearchbutton());
}



		

		@When("^user click on addtocart button$")
		public void user_click_on_addtocart_button() throws Throwable {
			HomePage hp=new HomePage();
		   click(hp.getProductaddtocart());
		}

		@When("^user click on proceed to checkout in popup box$")
		public void user_click_on_proceed_to_checkout_in_popup_box() throws Throwable {
			HomePage hp=new HomePage();
		   click(hp.getCommonProceedtocheck());
		}

		@When("^user again click on proceed to checkout in summary of authentication page$")
		public void user_again_click_on_proceed_to_checkout_in_summary_of_authentication_page() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			click(ap.getProceedsummary());
		}

		@When("^in Address bar give some message inside textbar$")
		public void in_Address_bar_give_some_message_inside_textbar() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			inputValueUsingSendkeys(ap.getTextarea(), "Hi please contact this number");
		   
		}

		@When("^click on proceedtocheck after textarea$")
		public void click_on_proceedtocheck_after_textarea() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			click(ap.getProceedaftertextbox());
		   
		}

		@When("^in shipping bar  click the tickbutton and proceed to checkout$")
		public void in_shipping_bar_click_the_tickbutton_and_proceed_to_checkout() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			click(ap.getTick());
			click(ap.getProceedaftertick());
		   
		}

		@When("^user pay by clicking on payment by wire$")
		public void user_pay_by_clicking_on_payment_by_wire() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			click(ap.getPayment());
		   
		}

		@Then("^user click on I Confirm my order$")
		public void user_click_on_I_Confirm_my_order() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			click(ap.getConfirmorder());
		   
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

		@When("^in shipping bar click the tickbutton and proceed to checkout(\\d+)$")
		public void in_shipping_bar_click_the_tickbutton_and_proceed_to_checkout(int arg1) throws Throwable {
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
		@Then("^user click on signout button to logout of the page$")
		public void user_click_on_signout_button_to_logout_of_the_page() throws Throwable {
			Authenticationpage ap=new Authenticationpage();
			click(ap.getLogout());
		
		}

	}

