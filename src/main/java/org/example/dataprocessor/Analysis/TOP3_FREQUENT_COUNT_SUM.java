package org.example.dataprocessor.Analysis;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TOP3_FREQUENT_COUNT_SUM implements AnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        try {
            Map<Integer, Integer> map = new HashMap<>();
            double sum = 0;
            for (int i : data) {
                if(!map.containsKey(i)){
                    map.put(i,1);
                }
                else{
                    map.put(i,map.get(i)+1);
                }
            }
            List<Map.Entry<Integer, Integer>> top3 = map.entrySet()
            .stream()
            .sorted(
                Comparator.<Map.Entry<Integer, Integer>>comparingInt(e -> e.getValue())
                          .reversed()
                          .thenComparing(Map.Entry::getKey)
            )
            .limit(3)
            .toList();
            for(Map.Entry<Integer, Integer> entry : top3){
            sum +=(double)( entry.getValue()*entry.getKey());

            }
            return sum;
        } catch (Exception e) {
            return 0.0;
        }
    }
}