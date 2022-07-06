package com.vowel;

import java.util.ArrayList;
import java.util.List;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	VowelDemo vd = (VowelDemo) context.getBean("v1");
    	
    	List<String> wordList = new ArrayList<String>(vd.getWords());
   
    	Object[] arr = wordList.toArray();
    	String str = null;
   
    	System.out.println("Names are: ");
    	 for(int i=0; i<arr.length; i++)
    	 {
    		 System.out.print(arr[i]+",");
    	 }
    	 System.out.println();
        for(int i=0; i<arr.length; i++) {
        	
        	
        	str = (String) arr[i];
        	int count =0;
        	
        	
        	
        	for(int j=0; j<str.length(); j++) {
   
   
        		char ch = str.charAt(j);
        	
        		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
        				|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
        			count++;
        	}
        	}
        	
        	if(count >0) {
        		continue;
        	}else {
        		System.out.println("\nNo vowel:-"+str);
			}
        	
        }
     
        
    }
}
