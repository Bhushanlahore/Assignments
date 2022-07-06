package com.factory;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       GetInterestF getInterest = new GetInterestF();
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the name of bank");
       String str = sc.next();
       
       System.out.println("Enter the amount");
       int amt = sc.nextInt();
       
       System.out.println("Enter the time periods in year");
       int year = sc.nextInt();
       
       Interest i = getInterest.getInterest(str);
       
       System.out.println("Interest of "+str+" for amount "+amt+" for period of "+year+" year is ");
       i.getRate();
       i.calculateInterest(amt,year);
    }
}
