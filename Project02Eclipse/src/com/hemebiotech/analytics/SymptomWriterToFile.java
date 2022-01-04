package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

/**
 * Simple implementation for write symptom
 */
public class SymptomWriterToFile implements ISymptomWriter {
    /**
     * @param writeTreeMap
     * Ecrit les symptômes dans un fichier result.out
     */
    @Override
    public void writeSymptom(Map<String, Integer> writeTreeMap) {

        try (FileWriter fileWriter = new FileWriter("result.out")){
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
