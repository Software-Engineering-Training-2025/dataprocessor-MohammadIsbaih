package org.example.dataprocessor.Factory;

import org.example.dataprocessor.Output.CONSOLE;
import org.example.dataprocessor.Output.OutputType;
import org.example.dataprocessor.Output.TEXT_FILE;
import org.example.dataprocessor.enums.OutputTypes;

public class OutputTypeFactory {
    public static OutputType getOutputTypeByType(OutputTypes type) {
        if (type == OutputTypes.CONSOLE) {
            return new CONSOLE();
        } else if (type == OutputTypes.TEXT_FILE) {
            return new TEXT_FILE();
        }
        throw new RuntimeException("Output type is not supported " + type.name());
    }
}