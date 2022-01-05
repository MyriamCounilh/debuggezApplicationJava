package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

/**
 * Simple implementation for write symptom
 */
public class SymptomWriterToFile implements ISymptomWriter {

    private final String filepath;

    public SymptomWriterToFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * @param writeTreeMap
     * Ecrit les symptômes dans un fichier result.out
     */
    @Override
    public void writeSymptom(Map<String, Integer> writeTreeMap) {

            try (FileWriter fileWriter = new FileWriter(filepath)) {
                for (Map.Entry<String, Integer> symptomUnique : writeTreeMap.entrySet()) {
                    fileWriter.write(symptomUnique.getKey() + ": " + symptomUnique.getValue() + "\n");
                    System.out.println(symptomUnique.getKey() + ": " + symptomUnique.getValue());
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Catch FileWriter");
            }

    }
}
