package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Count and sort form a class
 */
public interface ISymptomCount {

    /**
     * @param listNotCounted
     * Create TreeMap for sorted in ascending order
     *
     * @return TreeMap create
     * @author Myriam Counilh
     */
    Map<String, Integer> getSymptomsCount(List<String> listNotCounted);

}
