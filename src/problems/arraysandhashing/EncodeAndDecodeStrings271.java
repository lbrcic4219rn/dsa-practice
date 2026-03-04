package problems.arraysandhashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings271 {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int pointer = 0;

        while (pointer < str.length()) {
            int lenStart = pointer;
            while(str.charAt(pointer) != '#') pointer++;
            int len = Integer.parseInt(str.substring(lenStart, pointer));
            pointer++;
            result.add(str.substring(pointer, pointer + len));
            pointer += len;
        }

        return result;
    }
}
