package com.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;

import com.price.Items;

public class CategorySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "Nokia", 25000, "Mobile", "12-03-2022", "12-03-2025"));
		items.add(new Item(2, "Asus 1203", 55000, "Laptop", "22-01-2020", "01-01-2028"));
		items.add(new Item(3, "Dairy Milk", 100, "Chochlate", "15-06-2022", "15-12-2022"));
		items.add(new Item(4, "Aloo chips", 50, "Snacks", "12-03-2022", "12-09-2022"));
		items.add(new Item(5, "Nimos Cold", 100, "Medicine", "01-01-2022", "01-01-2024"));
		items.add(new Item(6, "chesten Cold", 100, "Medicine", "01-01-2022", "01-01-2024"));
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category name");
		String str = sc.next();
		
		items.stream().filter(e -> e.getCategory().equalsIgnoreCase(str))
		
			.forEach(z -> System.out.println("ItemId: "+z.getId()
			+"\nItem Name: "+z.getName()
			+"\nItem Price: "+z.getPrice()
			+"\nItem Category: "+z.getCategory()
			+"\nItem DOM: "+z.getDom()
			+"\nItem DOE: "+z.getDoe()));
		
	}

}
