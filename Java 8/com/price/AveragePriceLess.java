package com.price;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AveragePriceLess {

	public static void main(String args[]) {
		
		List<Items> list = new ArrayList<Items>();
		
		list.add(new Items(1, "iphone", 150000.00));
		list.add(new Items(2, "oneplus", 30000.00));
		list.add(new Items(3, "samsung", 70000.00));
		list.add(new Items(4, "nokia", 15000.00));
		list.add(new Items(5, "realme", 17000.00));
		
		double avg = list.stream().mapToDouble(Items::getPrice).average().getAsDouble();
		System.out.println("Average price of all items: "+ avg);
		
		List<Items> collect = list.stream()
		.filter(i-> i.getPrice()< avg).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	}
}
