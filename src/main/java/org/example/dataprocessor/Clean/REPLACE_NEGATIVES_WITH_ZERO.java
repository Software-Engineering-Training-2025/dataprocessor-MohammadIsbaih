package org.example.dataprocessor.Clean;

import java.util.ArrayList;
import java.util.List;

public class REPLACE_NEGATIVES_WITH_ZERO implements CleaningType {
    @Override
    public List<Integer> clean(List<Integer> data) {
        List<Integer> cleaned = new ArrayList<>();
        for (Integer i : data) {
            if (i > 0) {
                cleaned.add(i);
            }
        }
        return cleaned;
    }
}
