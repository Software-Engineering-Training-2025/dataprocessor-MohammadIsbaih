package org.example.dataprocessor.Analysis;

import java.util.List;

public class MEAN implements AnalysisType {

    @Override
    public double analyze(List<Integer> data) {
        try {
            double sum = 0;
            for (int num : data) {
                sum += num;
            }
            return sum / data.size();
        } catch (Exception e) {
            return Double.NaN;
        }
    }
}