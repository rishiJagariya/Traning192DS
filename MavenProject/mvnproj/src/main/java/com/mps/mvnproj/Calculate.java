package com.mps.mvnproj;

public class Calculate {

	public int add(int...num) {
		int ans = 0;
		for(int i : num) {
			ans += i;
		}
		return ans;
	}
	public int mul(int...num) {
		int ans = 1;
		for(int i : num) {
			ans *= i;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(5,5));
		System.out.println(c.add(5,5,5));
		System.out.println(c.add(5,5,10,20));
		
		System.out.println(c.mul(5,5));
		System.out.println(c.mul(5,5,5));
		System.out.println(c.mul(5,5,10,20));
		
	}

}
