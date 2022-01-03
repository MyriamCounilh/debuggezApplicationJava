package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	/**
	 * @param args read interface
	 * @throws IOException teat Exception
	 *
	 */
	public static void main(String[] args) throws IOException {

		// To recover symptoms from a class
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listNotCounted = reader.getSymptoms();

		// Count and sort from a class
		ISymptomCount treater = new SymptomCount();
		TreeMap<String, Integer> treeMap = treater.getSymptomsCount(listNotCounted);

		// Write the result from a class
		ISymptomWriter writer = new SymptomWriterToFile();
		writer.writeSymptom(treeMap);

	}
}
