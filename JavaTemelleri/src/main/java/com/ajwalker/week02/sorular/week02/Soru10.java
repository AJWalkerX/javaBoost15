package com.ajwalker.week02.sorular.week02;
/*1'den 100'e kadar olan sayıları ekrana yazdır
3'ün katı "3KAT"
5'in katlarında "5KAT"
hem 3 hem de 5'in katlarında "15KAT"
 */
public class Soru10 {
	public static void main(String[] args) {
		for (int i = 1; i<= 100; i++){
			if (i % 3 == 0 && i%5 == 0){
				System.out.println(i +" 15KAT");
			}
			else if (i % 5 == 0){
				System.out.println(i +" 5KAT");
			}
			else if (i % 3 == 0){
				System.out.println(i +" 3KAT");
			}
			else {
				System.out.println(i);
			}
			
		}
	}
}