package org.example.dataprocessor.Analysis;

import java.util.Collections;
import java.util.List;

import static java.lang.Math.ceil;

public class P90_NEAREST_RANK implements AnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        try {

            Collections.sort(data);
            int n = data.size();
            int rank = (int) ceil(0.9 * n) - 1;
            return data.get(rank);
        } catch (Exception e) {
            return Double.NaN;
        }
    }
}