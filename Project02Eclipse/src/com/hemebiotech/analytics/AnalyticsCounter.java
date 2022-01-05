package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {


	/**
	 * @param args read interface
	 *
	 */
	public static void main(String[] args) {

		final String readSymptom = "symptoms.txt";
		final String writeSymptom = "result.out";

		Analytic analytic = new Analytic(new ReadSymptomDataFromFile(readSymptom), new SymptomCount(), new SymptomWriterToFile(writeSymptom));

		// To recover symptoms from a class
		List<String> listNotCounted = analytic.getSymptoms();

		// Count and sort from a class
		Map<String, Integer> treeMap = analytic.getSymptomsCount(listNotCounted);

		// Write the result from a class
		analytic.writeSymptom(treeMap);

	}
}
