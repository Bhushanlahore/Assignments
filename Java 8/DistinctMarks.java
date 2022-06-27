import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DistinctMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks of six subject");
		

		//list of marks
		List<Integer> marks = new ArrayList<>();
		
		//getting marks from user
		for(int i=0; i<6; i++) {
			int l = sc.nextInt();
			marks.add(l);
		}
		
		
		marks.stream().distinct()
			.forEach(z -> System.out.println(z));
		
		

	}

}
