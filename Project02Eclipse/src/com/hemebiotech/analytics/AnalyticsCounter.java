package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) {

		// To recover symptoms from a class
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listNotCounted = reader.getSymptoms();

		// Count and sort from a class
		ISymptomCount treater = new SymptomCount();
		TreeMap<String, Integer> treeMap = treater.getSymptomsCount(listNotCounted);
		System.out.println(treeMap);

	}
}
