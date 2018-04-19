package qa.package1;

public class Account {

	public static void main(String[] args) {
		Account person1 = new Account("Marcell", "Illes", 001);
		Service s = new Service();
		s.addCustomer(person1);
	}

	private String customerName;
	private String customerLastName;
	private int customerAccountNumber;

	public Account(String firstName, String lastName, int accountNumber) {
		
		this.customerName = firstName;
		this.customerLastName = lastName;
		this.customerAccountNumber = accountNumber;
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

/*
 * An account class with the fields firstName, lastName, accountNumber A service
 * class (The class where the functionality of adding and retrieving happens)
 * Any other classes that may be required
 */