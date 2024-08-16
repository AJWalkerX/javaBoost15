package com.ajwalker.week06.map.treemap;

import java.util.TreeMap;

public class TreeMapUsage {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		treeMap.put("A",50);
		treeMap.put("B",20);
		treeMap.put("E",10);
		treeMap.put("C",40);
		treeMap.put("D",null);
		System.out.println(treeMap);
		System.out.println(treeMap.pollFirstEntry());
	}
}