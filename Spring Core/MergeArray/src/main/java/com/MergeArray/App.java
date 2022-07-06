package com.MergeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Array1 a1 = new Array1();
    	int[] arr1 =a1.getArr1();
   
    	Array2 a2 = new Array2();
    	int[] arr2 = a2.getArr2();
    	
    	int n = arr1.length +arr2.length;
    	
    	int[] merge = new int[n];
    	int position =0;
    	
    	for (int element: arr1) {
    	      merge[position] = element;
    	      position++;
    	    }
    	
    	for (int element: arr2) {
  	      merge[position] = element;
  	      position++;
  	    }
    	
    	Arrays.sort(merge);
    	System.out.println(Arrays.toString(merge));
    	 System.out.println("Maximum from two different array: "+merge[merge.length-1]);
    }
}
