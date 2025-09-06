package org.example.dataprocessor.Output;

import java.io.FileWriter;
import java.io.IOException;

public class TEXT_FILE implements OutputType {
    @Override
    public void print(double data) {
        try {
            FileWriter writer = new FileWriter("target/result.txt", false); // true = append, false = overwrite
            writer.write(data+"\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
