package org.example.dataprocessor.Analysis;

import java.util.Collections;
import java.util.List;

public class MEDIAN implements AnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        try {
            Collections.sort(data);
            int n = data.size();
            if (n % 2 == 1) {
                return data.get(n / 2);
            } else {
                return (data.get(n / 2 - 1) + data.get(n / 2)) / 2.0;
            }
        } catch (Exception e) {
            return Double.NaN;
        }
    }
}