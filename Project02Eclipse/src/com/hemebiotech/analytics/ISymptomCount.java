package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Compter et trier à partir d'une classe
 */
public interface ISymptomCount {

    /**
     * Retourne la Map contenant les symptômes avec leur occurrence par ordre alphabétique
     * @param listNotCounted Contient la liste des symptômes
     *
     * @return Map contenant les symptômes avec leur occurrence par ordre alphabétique
     * @author Myriam Counilh
     */
    Map<String, Integer> getSymptomsCount(List<String> listNotCounted);

}
