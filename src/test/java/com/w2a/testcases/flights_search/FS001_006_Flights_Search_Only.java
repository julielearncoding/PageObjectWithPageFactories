package com.w2a.testcases.flights_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHomePage;

public class FS001_006_Flights_Search_Only extends SetupAndTearDown {

	// Test is OK
	@Test(dataProvider = "FS001_006")
	public void FS001_006_searchByDepartingAndDesitnation(String from, String to, String departDate, String returnDate,
			int noOfAdults, int noOfChildren, int noOfInfants) {

		FlightHomePage home = Page.gotoFlights();
		home.bookAFlight(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants);

	}

	@DataProvider(name = "FS001_006")
	public Object[][] searchData() {
		return new Object[][] { { "SGN", "DAD", "27/03/2020", "", 1, 0, 0 } };
	}

}
