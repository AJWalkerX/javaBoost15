package com.ajwalker.week06.queue_types.deque;

import java.util.*;

//Deque: Double ended queue -> hem fifo hem de lifo
public class DequeUsage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<String> deque = new ArrayDeque<>();
		
		while (true){
			System.out.println("İşlem seçiniz");
			System.out.println("1- Bilet Al");
			System.out.println("2-Bilet ver");
			System.out.println("3-Kuyruğun durumunu görüntüle");
			System.out.println("4-Çıkış");
			int secim = sc.nextInt(); sc.nextLine();
			
			switch (secim){
				case 1:{
					System.out.print("Adiniz: ");
					String ad = sc.nextLine();
					deque.offer(ad);
					break;
				}
				case 2:{
					String biletVerilenKisi = deque.pop(); // first in first out.
					System.out.println(biletVerilenKisi +" adli kişiye bilet verildi.");
					break;
				}
				case 3:{
					System.out.println("Kuruk durum "+ deque);
					break;
				}
				case 4:{
					System.exit(0) ;
					break;
				}
				case 5:{
					String biletVerilenKisi = deque.pollLast(); // first in last out.
					System.out.println(biletVerilenKisi +" adli kişiye bilet verildi.");
					break;
				}
				default:
			}
		}
	}
}