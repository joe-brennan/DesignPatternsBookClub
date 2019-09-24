package AdapterPattern;

import java.util.HashMap;
import java.util.Set;


public class GermanToEnglishDictionary implements Dictionary {
    private HashMap<String, String> content;

    public GermanToEnglishDictionary() {
        content = new HashMap<>();
        content.put("Hund", "dog");
        content.put("Katze", "cat");
    }

    public String lookup(String from) {
        return content.getOrDefault(from, "unknown word");
    }

    public Set<String> words() {
        return content.keySet();
    }

}
