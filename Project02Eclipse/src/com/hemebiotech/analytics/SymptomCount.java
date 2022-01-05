package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple implementation pour compter les symptômes
 * @author Myriam Counilh
 */
public class SymptomCount implements ISymptomCount {

    /**
     *
     * @param listNotCounted Créer treeMap pour trier par ordre croissant
     * La bouche for ajoute l'occurence à chaque symptômes s'il existe déjà
     * @return treemap Contient les symptômes ainsi que leur occurrence
     */
    @Override
    public Map<String, Integer> getSymptomsCount(List<String> listNotCounted) {

        TreeMap<String, Integer> treemap = new TreeMap<>();

        for (String symptomName: listNotCounted) {
            if (!symptomName.isEmpty()) {
                if (treemap.containsKey(symptomName)) {
                    treemap.put(symptomName, treemap.get(symptomName) + 1);
                } else {
                    treemap.put(symptomName, 1);
                }
            }
        }

        return treemap;
    }
}
