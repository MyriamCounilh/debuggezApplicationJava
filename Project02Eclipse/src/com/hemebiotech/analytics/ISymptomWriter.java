package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Gère l'écriture des symptômes
 * @author Myriam Counilh
 */
public interface ISymptomWriter {

    /**
     * Ecrit les symptômes
     * @param writeTreeMap Contient l'ensemble des symptômes avec leur occurrence par ordre alphabétique
     */
    void writeSymptom(Map<String, Integer> writeTreeMap);
}
