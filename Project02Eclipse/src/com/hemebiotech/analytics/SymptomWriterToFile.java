package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

/**
 * Simple implémentation pour écrire un symptôme
 * Création d'une variable final
 * @author myriam
 */
public class SymptomWriterToFile implements ISymptomWriter {

    private final String filepath;

    public SymptomWriterToFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Ecrit les symptômes dans un fichier filepath;
     * @param writeTreeMap contient la Map avec les symptômes ainsi que leur occurrence
     */
    @Override
    public void writeSymptom(Map<String, Integer> writeTreeMap) {

        /*
          Try Ecrire les symptômes depuis la variable final
          La boucle For Afin d'écrire chaque symptôme avec leur occurrence, ajoute un saut de ligne
          Catch pour gérer une exception.
         */
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
