package com.clone;

public class Clone implements Cloneable{

	 	int	id;
		String name;
		
		public Clone(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		public static boolean clone1(Clone c1 , Clone c2) {
			
			if(c1.id == c2.id && c1.name == c2.name)
				return true;
			else 
				return false;
		}
	
}
