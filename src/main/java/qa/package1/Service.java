package qa.package1;

import com.google.gson.Gson;
import java.util.HashMap;

public class Service {
	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	private static int uniqueID = 1;

	public void addCustomer(Account newAccount) {
		hashMap.put(uniqueID, newAccount);

		// System.out.println(hashMap.size());
		// 1. Java object to JSON, and save into a file
		
		//Gson gson = new Gson();
		//System.out.println(gson.toJson(newAccount));
		//System.out.println("hi");
		printJsonObject(newAccount);
		uniqueID++;
	}

	public void getAccount(int selectedCustomerID) {

		hashMap.get(selectedCustomerID);
		// System.out.println(uniqueID);
	}

	public void removeAccount(int selectedCustomerID) {

		hashMap.remove(selectedCustomerID);
	}

	public HashMap<Integer, Account> getMap() {

		return hashMap;
	}
	
	public void printJsonObject(Account newAccount) {
		
		Gson gson = new Gson();
		
		System.out.println(gson.toJson(newAccount));
		System.out.println("hi");
	}

}










/*
 * Map<String,Object> map = new HashMap<>(); //You can convert any Object.
 * String[] value1 = new String[] { "value11", "value12", "value13" }; String[]
 * value2 = new String[] { "value21", "value22", "value23" }; map.put("key1",
 * value1); map.put("key2", value2); map.put("key3","string1");
 * map.put("key4","string2");
 * 
 * String json = new ObjectMapper().writeValueAsString(map);
 * System.out.println(json);
 */
