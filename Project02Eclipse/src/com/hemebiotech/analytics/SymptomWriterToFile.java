package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

/**
 * Simple implementation for write symptom
 * @author myriam
 * Création d'une variable final
 */
public class SymptomWriterToFile implements ISymptomWriter {

    private final String filepath;

    public SymptomWriterToFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Ecrit les symptômes
     * @param writeTreeMap
     * Try Ecrire les symptômes depuis la variable final
     * La boucle For Afin d'écrire chaque symptôme avec leur occurrence, ajoute un saut de ligne
     * Catch pour gérer une exception.
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
