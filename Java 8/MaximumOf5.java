import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumOf5 {

	public static void main(String args[] ) {
		
		List<Integer> arr =Arrays.asList(1,2,3,4,5,89,75,65,89,100,23,45,50).stream().filter(x -> x%5==0).collect(Collectors.toList());
		 
		int max = arr.stream().mapToInt(a -> a).max().getAsInt();
		 System.out.println(max);
	}
}
