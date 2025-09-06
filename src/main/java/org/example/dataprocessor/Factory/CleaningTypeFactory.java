package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Clean.CleaningType;
import org.example.dataprocessor.Clean.REMOVE_NEGATIVES;
import org.example.dataprocessor.Clean.REPLACE_NEGATIVES_WITH_ZERO;
import org.example.dataprocessor.Output.CONSOLE;
import org.example.dataprocessor.Output.OutputType;
import org.example.dataprocessor.Output.TEXT_FILE;
import org.example.dataprocessor.enums.CleaningTypes;
import org.example.dataprocessor.enums.OutputTypes;

public class CleaningTypeFactory {
    public static CleaningType getCleaningTypeByType(CleaningTypes type) {
        if (type == CleaningTypes.REMOVE_NEGATIVES) {
            return new REMOVE_NEGATIVES();
        } else if (type == CleaningTypes.REPLACE_NEGATIVES_WITH_ZERO) {
            return new REPLACE_NEGATIVES_WITH_ZERO();
        }
        throw new RuntimeException("Cleaning type is not supported " + type.name());
    }
}

