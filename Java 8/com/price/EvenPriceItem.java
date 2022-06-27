package com.price;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenPriceItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<Items> list = new ArrayList<Items>();
		
		list.add(new Items(1, "iphone", 150000.00));
		list.add(new Items(2, "oneplus", 30000.00));
		list.add(new Items(3, "samsung", 70000.00));
		list.add(new Items(4, "nokia", 15000.00));
		list.add(new Items(5, "realme", 17001.00));
		
		List<Items> collect = list.stream()
				.filter(i-> i.getPrice()%2==0).collect(Collectors.toList());
				
				System.out.println(collect);
	}

}
