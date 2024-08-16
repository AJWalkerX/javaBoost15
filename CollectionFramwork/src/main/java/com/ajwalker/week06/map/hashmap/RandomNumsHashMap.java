package com.ajwalker.week06.map.hashmap;

import java.util.*;

/*
* 1000 tane rasgele sayı
* en çok üretilen sayı en üstte olacak şekilde ekrana yazdırın.
* */
public class RandomNumsHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> randNumberHashMap = new HashMap<>();
		for (int i = 0; i< 1000; i++){
			int random = new Random().nextInt(1,101);
//			if (randNumberHashMap.containsKey(random)){
//				int value = randNumberHashMap.get(random);
//				randNumberHashMap.put(random, value+1);
//			}
//			else{
//				randNumberHashMap.put(random,1);
//			}
			randNumberHashMap.put(random, randNumberHashMap.getOrDefault(random,0)+1);
		}
		List<Map.Entry<Integer,Integer>> randomNumbersList = new ArrayList<>(randNumberHashMap.entrySet());
		
		Comparator<Map.Entry<Integer,Integer>> countComparator = (entry1, entry2) -> entry2.getValue()-entry1.getValue();
		
		Collections.sort(randomNumbersList,countComparator);
		System.out.println(randomNumbersList);
		
		//10 sayısı 15 defe üretildi gibi çıktı üretmek
		for (Map.Entry<Integer,Integer> entry: randomNumbersList){
			System.out.println(entry.getKey()+" sayısı "+ entry.getValue()+ " defa üretildi.");
		}
	}
}