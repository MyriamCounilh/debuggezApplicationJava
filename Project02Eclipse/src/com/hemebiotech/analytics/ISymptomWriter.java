package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;


/**
 * Write of result the symptom
 * @author Myriam Counilh
 */
public interface ISymptomWriter {

    void writeSymptom(Map<String, Integer> writeTreeMap) throws IOException;

}
