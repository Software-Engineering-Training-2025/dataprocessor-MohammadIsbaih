package org.example.dataprocessor.enums;

public enum OutputTypes {
    /** Print "Result = <value>" to stdout */
    CONSOLE,

    /** Write "Result = <value>" to target/result.txt (overwrite, create dirs) */
    TEXT_FILE
}
