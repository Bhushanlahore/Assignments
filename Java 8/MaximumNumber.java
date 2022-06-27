import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num[] = new int[5];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = Arrays.stream(num).max().getAsInt();
		System.out.println(max);
	}

}
