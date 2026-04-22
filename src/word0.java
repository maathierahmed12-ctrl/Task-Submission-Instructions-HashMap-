import java.util.HashMap;
import java.util.Map;

public class word0 {

}

public int word0(String W, String str , String words) {

    Map<String, Integer> Word0 = new HashMap<>();

    for (String word : words) {
        Word0.put(word, 0);
    }

    return Word0;
}

