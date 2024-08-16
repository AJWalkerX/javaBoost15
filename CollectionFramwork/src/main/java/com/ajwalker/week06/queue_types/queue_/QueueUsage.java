package com.ajwalker.week06.queue_types.queue_;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//QUEUE -> First in  first out
public class QueueUsage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> kuyruk = new LinkedList<>();
		
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
					kuyruk.offer(ad);
					break;
				}
				case 2:{
					String biletVerilenKisi = kuyruk.poll();
					System.out.println(biletVerilenKisi +" adli kişiye bilet verildi.");
					break;
				}
				case 3:{
					System.out.println("Kuruk durum "+ kuyruk);
					break;
				}
				case 4:{
					System.exit(0) ;
					break;
				}
				default:
			}
		}
	}
}