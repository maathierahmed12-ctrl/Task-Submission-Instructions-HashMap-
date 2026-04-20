import java.util.HashMap;
import java.util.Map;

public class Task4 {

}

public int Task( String str ,int count  ) {

    Map<String, Integer> wordCount = new HashMap<>();

    wordCount.put(w, 9);

    for (String word : count) {
        wordCount.put(word, 0);
        count ++;
    }

    return count;
}}