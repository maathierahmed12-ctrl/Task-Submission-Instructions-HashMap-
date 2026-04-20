import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {

        public static HashMap<String, String> firstSwap (String[]Strings str){
            HashMap<String, String> firstSwap = new HashMap<>();
            for (String str : strings) {
                if (firstSwap.containsKey(str)) {
                    firstSwap.put(str, firstSwap.get(str) + 1);
                } else {
                    firstSwap.put(str, 1);
                }
                return firstSwap.remove();
            }
        }
    }
}