package com.maxno;

import java.util.List;

public class MaxNo {

	public List<Integer> numbers;
	
	public MaxNo() {
		
	}

	public MaxNo(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "MaxNo [numbers=" + numbers + "]";
	}
	
	
}
