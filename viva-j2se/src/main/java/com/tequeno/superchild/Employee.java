package com.tequeno.superchild;

public class Employee extends Person<Integer> {

	@Override
	public int getHashCode(Integer t) {
		return t.hashCode();
	}

}
