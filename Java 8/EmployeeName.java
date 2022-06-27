
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<String> empName = new ArrayList<String>();
		
		System.out.println("Enter the name of five Employees");
		for(int i=0; i<5; i++) {
			
			String n = sc.nextLine();
			empName.add(n);
		}
		
		//sorted using sorted() method and print unique using distinct() method
		empName.stream().sorted().distinct().forEach(z -> System.out.println(z));
		
	
	}

}
