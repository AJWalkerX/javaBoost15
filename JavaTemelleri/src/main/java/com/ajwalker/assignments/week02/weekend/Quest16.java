package com.ajwalker.assignments.week02.weekend;
//Soru 16. İki tamsayı değişkeni tanımlayın ve bu değişkenlerin toplamını, farkını, çarpımını ve bölümünü ekrana
// yazdırın. (Değişkenler-Operatörler)

import java.util.Random;

public class Quest16 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(-100, 100);
		int num1 = random.nextInt(-100, 100);
		System.out.println("Toplama Islemi ");
		System.out.println("("+num + ")+(" + num1 + ")= " + (num + num1));
		System.out.println("Fark alma Islemi ");
		System.out.println("("+num + ")-(" + num1 + ")= " + (num - num1));
		System.out.println("Carpim Islemi ");
		System.out.println("("+num + ")x(" + num1 + ")= " + (num * num1));
		System.out.println("Bolme Islemi ");
		System.out.println("("+num + ")/(" + num1 + ")= " + (num / num1));
	}
}