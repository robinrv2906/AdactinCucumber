package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.sdp.Page_Object_Manager;
import com.adactin.testrunner.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String Url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		getUrl(Url);
	}

//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//		inputValueElement(pom.getInstatncelp().getUsername(), "william1234");
//	}
//
//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//		inputValueElement(pom.getInstatncelp().getPassword(), "User@123");
//	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		inputValueElement(pom.getInstatncelp().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputValueElement(pom.getInstatncelp().getPassword(), password);
		
	}


	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstatncelp().getLogin_Btn());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		dropDown(pom.getInstanceSearch().getLocation(), "selectByIndex", "1");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropDown(pom.getInstanceSearch().getHotels(), "selectByIndex", "1");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropDown(pom.getInstanceSearch().getRoom_Type(), "selectByIndex", "1");
	}

	@When("^user Select The Number of Rooms$")
	public void user_Select_The_Number_of_Rooms() throws Throwable {
		dropDown(pom.getInstanceSearch().getNumberOfRooms(), "selectByIndex", "1");
	}

	@When("^user Enter The Check In Date In Chech In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Chech_In_Date_Field() throws Throwable {
		clear(pom.getInstanceSearch().getCheckInDate());
		inputValueElement(pom.getInstanceSearch().getCheckInDate(), "25/07/2022");
	}

	@When("^user Enter The Chech Out date In Check Out Date Field$")
	public void user_Enter_The_Chech_Out_date_In_Check_Out_Date_Field() throws Throwable {
		clear(pom.getInstanceSearch().getCheckOutDate());
		inputValueElement(pom.getInstanceSearch().getCheckOutDate(), "26/07/2022");
	}

	@When("^user Select The Number Of Adults Rooms$")
	public void user_Select_The_Number_Of_Adults_Rooms() throws Throwable {
		dropDown(pom.getInstanceSearch().getAdultRoom(), "selectByIndex", "1");
	}

	@When("^user Select The Number Of Children Rooms$")
	public void user_Select_The_Number_Of_Children_Rooms() throws Throwable {
		dropDown(pom.getInstanceSearch().getChildRoom(), "selectByIndex", "1");
	}

	@Then("^user Click The Search Button And It Navigates Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getSearch());
	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		radioButton("selectradiobutton", pom.getInstanceSelect().getRadioButton());
	}

	@Then("^user Click The Continue Button And It Navigates To Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getContinueBtn());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getFirstName(), "william");
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getLastName(), "son");
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getAddress(), "no.12, 2nd cross street, Atlanda");
	}

	@When("^user Enter The Credit Card Number In Credit Cad Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Cad_Number_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getCreditCadrd(), "1234567890456423");
	}

	@When("^user Select The Credit Card type$")
	public void user_Select_The_Credit_Card_type() throws Throwable {
		dropDown(pom.getInstanceBook().getCcType(), "selectByIndex", "2");
	}

	@When("^user Select The Credit Card Expiry Month$")
	public void user_Select_The_Credit_Card_Expiry_Month() throws Throwable {
		dropDown(pom.getInstanceBook().getCcExpMonth(), "selectByIndex", "8");
	}

	@When("^user Select The Credit Card Expiry Year$")
	public void user_Select_The_Credit_Card_Expiry_Year() throws Throwable {
		dropDown(pom.getInstanceBook().getCcExpYear(), "selectByIndex", "6");
	}

	@When("^user Enter The CVV Number In Cvv Number Field$")
	public void user_Enter_The_CVV_Number_In_Cvv_Number_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getCvvNumber(), "369");

	}

	@Then("^user Click The Book Now Button$")
	public void user_Click_The_Book_Now_Button() throws Throwable {
		clickOnElement(pom.getInstanceBook().getBook_Now());
	}

	@Then("^user Click The LogOut Button$")
	public void user_Click_The_LogOut_Button() throws Throwable {
		waits("explicit", pom.getInstanceLogOut().getLogout());
		clickOnElement(pom.getInstanceLogOut().getLogout());
	}

}
