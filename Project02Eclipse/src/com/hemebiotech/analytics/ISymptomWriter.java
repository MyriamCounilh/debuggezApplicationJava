package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Ecrire le résultat du symptôme
 * @author Myriam Counilh
 */
public interface ISymptomWriter {

    void writeSymptom(Map<String, Integer> writeTreeMap);
}
