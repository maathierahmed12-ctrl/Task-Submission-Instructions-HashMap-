import java.util.HashMap;
import java.util.Map;

public class Task1 {

}

public int Task1(String W, String str , String words) {

    Map<String, Integer> Word0 = new HashMap<>();

    for (String word : words) {
        Word0.put(word, 0);
    }

    return Word0;
}

