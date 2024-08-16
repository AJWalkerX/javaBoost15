package com.ajwalker.week03.Methods;

public class SingleParameter {
	public static void main(String[] args) {
		int result = powerTwo(5);
		System.out.println(result);
	}
	
	public static int powerTwo(int num){
		return num*num;
	}
}