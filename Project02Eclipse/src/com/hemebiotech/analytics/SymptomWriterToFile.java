package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple implementation for write symptom
 */
public class SymptomWriterToFile implements ISymptomWriter {
    /**
     * @param writeTreeMap
     * Create try catch to treat exception
     */
    @Override
    public void writeSymptom(TreeMap<String, Integer> writeTreeMap) {

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
