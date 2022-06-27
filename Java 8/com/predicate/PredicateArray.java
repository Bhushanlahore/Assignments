package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PredicateArray{

public static void main(String [] a)  {

List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7,43,45,7,59,55,90);

//lambda function inbuilt has predicate function
List<Integer> collect = list.stream().filter(z -> z%2==0).collect(Collectors.toList());
List<Integer> collect1 = list.stream().filter(z -> z%2!=0).collect(Collectors.toList());

System.out.println("The count of even: "+collect.size());
System.out.println("The count of odd: "+collect1.size());
}
}