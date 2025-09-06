package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Analysis.AnalysisType;
import org.example.dataprocessor.Clean.CleaningType;
import org.example.dataprocessor.Output.OutputType;
import org.example.dataprocessor.enums.AnalysisTypes;
import org.example.dataprocessor.enums.CleaningTypes;
import org.example.dataprocessor.enums.OutputTypes;

import java.util.List;

public class ProcessorFactory {
    public static CleaningType clean(CleaningTypes cleaningType) {
        return CleaningTypeFactory.getCleaningTypeByType(cleaningType);
    }

    public static AnalysisType analyze(AnalysisTypes analysisType) {
        return AnalysisTypeFactory.getAnalysisTypeByType(analysisType);
    }

    public static OutputType print(OutputTypes outputType) {
        return OutputTypeFactory.getOutputTypeByType(outputType);
    }
}
