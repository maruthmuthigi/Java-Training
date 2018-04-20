import java.util.*;
import java.io.*;

public class IOExamples {
	
	public void writeToFile(Set<Customer> custList)
	{
		PrintWriter writer = null;
		try {
				writer = new PrintWriter(new FileWriter(new File("Customer.txt"), true));
				for(Customer eachCustomer: custList){
					writer.println(eachCustomer);
				}
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				writer.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Map<Integer,Customer> readFromFile()
	{
		BufferedReader reader = null;
		HashMap<Integer, String> list = null;
		//HashMap<Integer,String> list= new HashMap<Integer, String>();
		try{
			reader = new BufferedReader(new FileReader(new File("Customer.txt")));
			String line = null;
			
			list = new HashMap<Integer, String>();
			int i=101;
			
			while(list = reader.readLine()!= null)
			{
				list.put(++i,  line);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
