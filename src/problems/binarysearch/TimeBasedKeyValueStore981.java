package problems.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore981 {
    private final Map<String, List<String[]>> map;

    public TimeBasedKeyValueStore981() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, (k) -> new ArrayList<>()).add(new String[]{value, Integer.toString(timestamp)});
    }

    public String get(String key, int timestamp) {
        List<String[]> timestamps = map.get(key);

        if (timestamps == null || timestamps.isEmpty()) return "";

        int l = 0;
        int r = timestamps.size() - 1;
        String result = "";
        while (l <= r) {
            int m = l + (r - l) / 2;
            int value = Integer.parseInt(timestamps.get(m)[1]);
            if(value < timestamp) {
                result = timestamps.get(m)[0];
                l = m + 1;
            } else if (value > timestamp) {
                r = m - 1;
            } else {
                return timestamps.get(m)[0];
            }
        }
        return result;
    }
}
