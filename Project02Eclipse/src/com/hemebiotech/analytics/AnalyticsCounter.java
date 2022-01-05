package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	/**
	 * @param args read interface
	 * Création de variable final
	 */
	public static void main(String[] args) {

		final String readSymptom = "symptoms.txt";
		final String writeSymptom = "result.out";

		Analytic analytic = new Analytic(new ReadSymptomDataFromFile(readSymptom), new SymptomCount(), new SymptomWriterToFile(writeSymptom));

		// Pour récupérer les symptômes d'une classe
		List<String> listNotCounted = analytic.getSymptoms();

		// Compter et trier à partir d'une classe
		Map<String, Integer> treeMap = analytic.getSymptomsCount(listNotCounted);

		// Ecrire le résultat d'une classe
		analytic.writeSymptom(treeMap);

	}
}
