package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Analysis.*;
import org.example.dataprocessor.Clean.CleaningType;
import org.example.dataprocessor.Clean.REMOVE_NEGATIVES;
import org.example.dataprocessor.Clean.REPLACE_NEGATIVES_WITH_ZERO;
import org.example.dataprocessor.enums.AnalysisTypes;
import org.example.dataprocessor.enums.CleaningTypes;

public class AnalysisTypeFactory {
    public static AnalysisType getAnalysisTypeByType(AnalysisTypes type) {
        if (type == AnalysisTypes.MEAN) {
            return new MEAN();
        } else if (type == AnalysisTypes.MEDIAN) {
            return new MEDIAN();
        }else if (type == AnalysisTypes.STD_DEV) {
            return new STD_DEV();
        }else if (type == AnalysisTypes.P90_NEAREST_RANK) {
            return new P90_NEAREST_RANK();
        }else if (type == AnalysisTypes.TOP3_FREQUENT_COUNT_SUM) {
            return new TOP3_FREQUENT_COUNT_SUM();
        }
        throw new RuntimeException("Analysis type is not supported " + type.name());
    }
}
