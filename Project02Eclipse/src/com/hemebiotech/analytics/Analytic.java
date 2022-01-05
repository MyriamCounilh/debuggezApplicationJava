package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Analytic {

    private final ISymptomReader reader ;
    private final ISymptomCount treater;
    private final ISymptomWriter writer;

    public Analytic(ISymptomReader readerInstancied, ISymptomCount treaterInstancied, ISymptomWriter writerInstancied) {
        this.reader = readerInstancied;
        this.treater = treaterInstancied;
        this.writer = writerInstancied;
    }

    public List<String> getSymptoms() {

        return this.reader.getSymptoms();
    }

    public Map<String, Integer> getSymptomsCount(List<String>  listNotCounted) {
        return this.treater.getSymptomsCount(listNotCounted);
    }

    public void writeSymptom(Map<String, Integer> writeTreeMap) {

        this.writer.writeSymptom(writeTreeMap);
    }

}
