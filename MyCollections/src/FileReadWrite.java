import java.util.*;
import java.io.*;

public class FileReadWrite {

	public static void main(String[] args) {

			TreeSet<Customer> custList = new TreeSet<Customer>();
			custList.add(new Customer(101,"Ramesh", 8888));
			custList.add(new Customer(102,"Ramesh", 7888));
			custList.add(new Customer(103,"Ramesh", 6888));
			custList.add(new Customer(104,"Ramesh", 5888));
			custList.add(new Customer(105,"Ramesh", 4888));
			
			IOExamples example = new IOExamples();
			example.writeToFile(custList);
			

	}

}
