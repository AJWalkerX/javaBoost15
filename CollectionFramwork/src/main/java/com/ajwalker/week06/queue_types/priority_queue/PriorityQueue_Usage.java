package com.ajwalker.week06.queue_types.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueue_Usage {
	public static void main(String[] args) {
		PriorityQueue<Integer> oncelikliKuyruk = new PriorityQueue<>();
		oncelikliKuyruk.offer(50);
		oncelikliKuyruk.offer(20);
		oncelikliKuyruk.offer(30);
		oncelikliKuyruk.offer(100);
		oncelikliKuyruk.offer(40);
		
		System.out.println(oncelikliKuyruk); //[20, 50, 30, 100]
		
//		while (!oncelikliKuyruk.isEmpty()){
//			System.out.println(oncelikliKuyruk.poll());
//		}
	}
}