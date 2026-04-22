import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args) {

    }

    public static HashMap<String, Boolean> wordMultiple(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Boolean> result = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> M = map.entrySet()) {
            if (M.getValue() >= 2) {
                result.put(M.getKey(), true);
            } else {

                result.put(M.getKey(), false);

            }
            return result;
        }
    }
}



