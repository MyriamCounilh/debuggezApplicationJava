package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


/**
 * Création de la classe Analytic
 * pour faire de l'injection de dépendance
 * @author myriam
 */
public class Analytic {

    private final ISymptomReader reader ;
    private final ISymptomCount treater;
    private final ISymptomWriter writer;

    /**
     * La classe Analytic instancie les classes
     * @param readerInstancied instancie la classe reader
     * @param treaterInstancied instancie la classe treater
     * @param writerInstancied instancie la classe writer
     *
     */
    public Analytic(ISymptomReader readerInstancied, ISymptomCount treaterInstancied, ISymptomWriter writerInstancied) {
        this.reader = readerInstancied;
        this.treater = treaterInstancied;
        this.writer = writerInstancied;
    }

    /**
     * Méthode pour lire les symptômes
     * @return List
     */
    public List<String> getSymptoms() {
        return this.reader.getSymptoms();
    }

    /**
     * Méthode pour compter et trier
     * @param listNotCounted Utiliser la list qui contient l'ensemble des symptômes
     * @return Map Contient les symptômes ainsi que leur occurrence
     */
    public Map<String, Integer> getSymptomsCount(List<String>  listNotCounted) {
        return this.treater.getSymptomsCount(listNotCounted);
    }

    /**
     * Méthode pour écrire les symptomes
     * @param writeTreeMap Contient les symptômes ainsi que leur occurrence
     */
    public void writeSymptom(Map<String, Integer> writeTreeMap) {
        this.writer.writeSymptom(writeTreeMap);
    }

}
