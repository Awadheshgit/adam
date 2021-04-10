package com.sp.demo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {
	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>();
		scores.put("Abhi", 22);
		scores.put("Awadhesh", 95);
		scores.put("Nitesh", 34);
		scores.put("puspu", 33);
		scores.put("Somu", 20);

		System.out.println(scores);

		scores = sortByValue(scores);
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {

		Map<String, Integer> sortedByValue = new LinkedHashMap<>();

		// get the entry set
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		System.out.println(entrySet);
		
		// create a list since the set is unordered
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println(entryList);
		
		// sort the list by value
		entryList.sort((x,y)->x.getValue().compareTo(y.getValue()));
		System.out.println(entryList);
		
		// populate the new hash map
		for (Entry<String, Integer> entry : entryList) {
			sortedByValue.put(entry.getKey(), entry.getValue());
		}
		
		return sortedByValue;
	}

}
