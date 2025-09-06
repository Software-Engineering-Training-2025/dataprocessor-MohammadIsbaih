package org.example.dataprocessor.Analysis;

import java.util.List;

public class STD_DEV implements AnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        try {


            AnalysisType meanType = new MEAN();
            double mean = meanType.analyze(data);
            double sum = 0;
            for (int num : data) {
                sum += Math.pow(num - mean, 2);
            }
            return Math.sqrt(sum / data.size());
        } catch (Exception e) {
            return Double.NaN;
        }
    }
}