package day33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {
    public static Map<String, List<String>> leftJoin(Map<String, String> mapOne, Map<String, String> mapTwo) {
        Map<String, List<String>> joinedMap = new HashMap<>();

        for (String key : mapOne.keySet()) {
            List<String> newValues = new ArrayList();

            newValues.add(mapOne.get(key));
            newValues.add(mapTwo.get(key));

            joinedMap.put(key, newValues);
        }
        return joinedMap;
    }
}
