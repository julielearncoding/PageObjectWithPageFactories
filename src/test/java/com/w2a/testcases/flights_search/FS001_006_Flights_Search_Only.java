package com.w2a.testcases.flights_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHomePage;

public class FS001_006_Flights_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "FS001_006")
	public void FS001_001_searchFlightsValid(String from, String to, String departDate, String returnDate,
			int noOfAdults, int noOfChildren, String child1Age,String child2Age,String child3Age,String child4Age,String child5Age,String child6Age,  int noOfInfants, String infant1Age, String infant2Age, String infant3Age, String infant4Age, String infant5Age, String infant6Age, String expectedTitleMessage, String expectedTravellersMessage, String expectedChildAgeMessage) {

		FlightHomePage home = Page.gotoFlights();
		home.bookAFlight(from, to, departDate, returnDate, noOfAdults
				, noOfChildren,child1Age,child2Age,child3Age,child4Age,child5Age,child6Age
				, noOfInfants, infant1Age, infant2Age, infant3Age, infant4Age, infant5Age, infant6Age);
		
		home.verifyUnSuccessError(expectedTitleMessage, expectedTravellersMessage, expectedChildAgeMessage);

	}

	@DataProvider(name = "FS001_006")
	public Object[][] searchData() {
		return new Object[][] {
			{ "SGN", "DAD", "27/03/2020", "27/04/2020"
			, 1
			, 7,"2","17","4","15","8","11"
			, 0,"0","0","0","0","0","0"
			, "Please correct the errors below."
			, "We are only able to book between 1 and 6 travellers. Please adjust the number of travellers for your search."
			, ""
			} 
		};
	}

}
