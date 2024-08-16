package com.ajwalker.week02.sorular.week02;
/*1-50'ye kadar olan sayılardan 3'ün katını yazdıran program*/
public class Soru09 {
	public static void main(String[] args) {
		
		/*for (int i = 3; i <= 50; i++){
			if (i % 3 == 0){
				System.out.println("3'un kati:" + i);
			}
		}*/
		for (int i= 3; i<=50; i+=3){
			System.out.println(i);
		}
		
	}
}