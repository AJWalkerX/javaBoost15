package com.ajwalker.week03.Methods;

public class FinalParameterMethod {
	public int hiz = 0;
	
	public static void main(String[] args) {
		FinalParameterMethod obj = new FinalParameterMethod();
		System.out.println(obj.hiz);
		obj.hizArttir(50);
		System.out.println(obj.hiz);
	}
	public void hizArttir(final int yeniHiz){
//		yeniHiz = yeniHiz*2; -> sabit parametre değeri değiştirelemez
		hiz =yeniHiz*2;
	}
}