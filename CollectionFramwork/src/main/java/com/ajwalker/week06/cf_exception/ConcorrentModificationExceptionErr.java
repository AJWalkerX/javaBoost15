package com.ajwalker.week06.cf_exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcorrentModificationExceptionErr {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Ankara","Bursa","Ceyhan","Denizli", "Bolu"));
		System.out.println(list);
		//!hata veriyor çünkü yapı bozuluyor ve döngüye devam edemiyor.
		//		for (String item: list){
//			if (item.charAt(0) == 'B'){
//				list.remove(item);
//			}
//		}
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()){
			if (iterator.next().charAt(0) == 'B'){
				iterator.remove();
			}
		}
		System.out.println(list);
		
		//Alternatif yapı!
		CopyOnWriteArrayList<String> stringCopyOnWriteArrayList = new CopyOnWriteArrayList<>(List.of("Ankara","Bursa","Ceyhan","Denizli", "Bolu"));
		for (String item: stringCopyOnWriteArrayList){
			if (item.charAt(0) == 'B'){
				stringCopyOnWriteArrayList.remove(item);
			}
		}
		System.out.println(stringCopyOnWriteArrayList);
	}
	
}