package org.example;

import org.example.dataprocessor.DataProcessorService;
import org.example.dataprocessor.Factory.ProcessorFactory;
import org.example.dataprocessor.enums.AnalysisTypes;
import org.example.dataprocessor.enums.CleaningTypes;
import org.example.dataprocessor.enums.OutputTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> data = new ArrayList<>();

        System.out.print("Enter your cleaning type(REMOVE_NEGATIVES, REPLACE_NEGATIVES_WITH_ZERO): ");
        CleaningTypes cleaningType = CleaningTypes.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter your analysis type(MEAN, MEDIAN, STD_DEV, P90_NEAREST_RANK, TOP3_FREQUENT_COUNT_SUM): ");
        AnalysisTypes analysisType = AnalysisTypes.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter your output type(CONSOLE, TEXT_FILE): ");
        OutputTypes outputType = OutputTypes.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter your list of numbers: ");
        String numbers = scanner.nextLine();
        for (String s : numbers.split(" ")) {
            data.add(Integer.parseInt(s));
        }

        DataProcessorService dataProcessorService = new DataProcessorService();
        dataProcessorService.process(cleaningType,analysisType,outputType,data);
    }
}