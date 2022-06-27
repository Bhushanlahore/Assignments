package com.parallel;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> even = new ArrayList<Integer>();
//		for(int i=0; i<=10; i++) {
//			if(i%2==0) {
//				even.add(i);
//			}
//		}
		
		even.add(0);
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		
		//before applying parallel stream
		System.out.println("Before Parallel: ");
		even.stream().forEach(z -> System.out.print("\t"+z));
		
		//before applying parallel stream
		System.out.println("\nAfter Parallel: ");
		even.parallelStream().forEach(z -> System.out.print("\t"+z));
	}

}
