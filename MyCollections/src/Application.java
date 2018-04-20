import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
	
	
	public static void print(List<Customer> custList){
		for(Customer eachCustomer : custList){
			System.out.println(eachCustomer);
		}
		
	}

	public static void main(String[] args) {


		CustomerManager mgr = new CustomerManager();
		mgr.add(new Customer(101, "Ramesh", 9999998));
		mgr.add(new Customer(-5, "Suresh", 9999999));
		mgr.add(new Customer(103, "Madesh", 7777777));
		mgr.add(new Customer(12, "Kamlesh",666666));
		
		print(mgr.findAll());
		
		System.out.println("****************************");
		print(mgr.getSortedList());
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ram");
		Collections.sort(name);
		
		System.out.println("********Sorted by NAme********************");
		print(mgr.getSortedList(new CutomerNameComparator()));
		
		System.out.println("********Sorted by phone numner********************");
		print(mgr.getSortedList(new PhoneNumberComparator()));
		
		
	}

}
