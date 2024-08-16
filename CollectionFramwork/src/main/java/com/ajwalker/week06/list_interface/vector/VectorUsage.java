package com.ajwalker.week06.list_interface.vector;

import java.util.Vector;

public class VectorUsage {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		
		Thread thread1 = new Thread(()-> {
			vector.add("İzmir");
			System.out.println("thread1 çalıştı");
		});
		
		Thread thread2 = new Thread(()-> {
			vector.add("İstanbul");
			System.out.println("thread2 çalıştı");
		});
	
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(vector);
	}
}