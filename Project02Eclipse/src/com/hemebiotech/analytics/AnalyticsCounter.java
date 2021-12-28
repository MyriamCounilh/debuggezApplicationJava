package com.hemebiotech.analytics;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		// To recover symptoms from a class
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> unlistedList = reader.getSymptoms();
		System.out.println(unlistedList);
	}
}
