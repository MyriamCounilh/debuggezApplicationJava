package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;


/**
 * Write of result the symptom
 * @author Myriam Counilh
 */
public interface ISymptomWriter {

    void writeSymptom(TreeMap<String, Integer> writeTreeMap) throws IOException;

}
