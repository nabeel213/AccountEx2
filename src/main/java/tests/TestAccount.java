package tests;
import qa.package1.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.gson.Gson;

public class TestAccount {

	@Test
	public void addCustomer() {

		Account testing = new Account("jon", "doe", 4);
		Service testService = new Service();
		testService.addCustomer(testing);
		assertEquals(testService.getMap().size(), 1);
	}

	@Test
	public void jsonTest() {

		Account testAccount = new Account("B", "Gak", 1);
		Account testAccount2 = new Account("Chad", "Stainbank", 2);

		Service testService = new Service();

		testService.addCustomer(testAccount);
		testService.addCustomer(testAccount2);

		Gson gson = new Gson();

		String js = gson.toJson(testAccount);
		System.out.println(js);
		String js2 = gson.toJson(testAccount2);

		assertEquals("{\"customerName\"" + ":" + "\"B\"" + "," + "\"customerLastName\"" + ":" + "\"Gak\"" + ","
				+ "\"customerAccountNumber\"" + ":" + "1}", js);
		assertEquals("{\"customerName\"" + ":" + "\"Chad\"" + "," + "\"customerLastName\"" + ":" + "\"Stainbank\"" + ","
				+ "\"customerAccountNumber\"" + ":" + "2}", js2);

	}
}
