package org.example.dataprocessor.Output;

public class CONSOLE implements OutputType {
    @Override
    public void print(double data) {
        System.out.println("Result = "+data);
    }
}
