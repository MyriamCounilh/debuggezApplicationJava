package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Compter et trier à partir d'une classe
 */
public interface ISymptomCount {

    /**
     * @param listNotCounted Créer treeMap pour trier par ordre croissant
     *
     * @return TreeMap create
     * @author Myriam Counilh
     */
    Map<String, Integer> getSymptomsCount(List<String> listNotCounted);

}
