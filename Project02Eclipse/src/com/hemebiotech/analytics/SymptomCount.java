package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * simple implementation for count symptom
 */
public class SymptomCount implements ISymptomCount {

    /**
     * @param listNotCounted
     * create treemap and for counter symptom
     *
     * @return treemap
     * @author Myriam Counilh
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
