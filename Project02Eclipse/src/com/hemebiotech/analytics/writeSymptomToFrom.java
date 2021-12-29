package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;

/**
 * Simple implementation for write symptom
 */
public class writeSymptomToFrom implements ISymptomWriter {

    FileWriter writer = new FileWriter ("result.out");

    public writeSymptomToFrom() throws IOException {
        System.out.println("result.out");
    }
}
