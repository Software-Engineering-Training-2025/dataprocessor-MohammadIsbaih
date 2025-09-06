package org.example.dataprocessor;

import org.example.dataprocessor.Factory.ProcessorFactory;
import org.example.dataprocessor.enums.AnalysisTypes;
import org.example.dataprocessor.enums.CleaningTypes;
import org.example.dataprocessor.enums.OutputTypes;

import java.util.*;


public class DataProcessorService {

    public double process(CleaningTypes cleaningType, AnalysisTypes analysisType, OutputTypes outputType, List<Integer> data) throws Exception {

        try {

            List<Integer> cleaned = ProcessorFactory.clean(cleaningType).clean(data);
            double analyzed = ProcessorFactory.analyze(analysisType).analyze(cleaned);
            ProcessorFactory.print(outputType).print(analyzed);

            return analyzed;
        }

        catch (Exception e){
        throw new UnsupportedOperationException("Student must implement process(...)");
        }
    }
}

