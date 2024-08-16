package com.ajwalker.assignments.week02.weekend;
//Soru 3. Kullanıcıdan bir gün numarası (1-7) girmesini isteyin ve hafta sonu mu yoksa hafta içi mi olduğunu belirleyin. (Switch-Case with Yield)

import java.util.Scanner;

public class Quest03 {
	public static void main(String[] args) {
		int weekNum;
		Boolean isWeekend = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Gun numarasini giriniz: ");
		weekNum = sc.nextInt();
			String weekName = switch (weekNum) {
				case 1: {
					yield "Pazartesi";
				}
				case 2: {
					yield "Sali";
				}
				case 3: {
					yield "Carsamba";
				}
				case 4: {
					yield "Persembe";
				}
				case 5: {
					yield "Cuma";
				}
				case 6: {
					isWeekend = true;
					yield "Cumartesi";
				}
				case 7: {
					isWeekend = true;
					yield "Pazar";
				}
				default:
					throw new IllegalStateException("1-7 arasinde deger giriniz!");
			};
			if (isWeekend){
				System.out.println(weekNum+". gun "+weekName+ " haftasonu");
			}
			else{
				System.out.println(weekNum+". gun "+weekName+ " haftaici");
			}
	}
}