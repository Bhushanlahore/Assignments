import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageMarks {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks of Five subject");
		

		//list of marks
		List<Integer> marks = new ArrayList<>();
		
		//getting marks from user
		for(int i=0; i<5; i++) {
			int l =sc.nextInt();
			marks.add(l);
		}
		
		////return optionalDouble or return null if stream is empty
		OptionalDouble avg = marks.stream().mapToInt(a -> a).average();
		
		//printing avarage as double
		System.out.println(avg.getAsDouble());
		}

}
