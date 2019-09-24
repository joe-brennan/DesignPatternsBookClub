package AdapterPattern;

import java.util.Set;

public interface Dictionary {
    /**
     * Lookup a given word in the dictionary;
     * If the word is not there, then return "unknown word".
     */
    String lookup(String from);

    /**
     * Give all words that are defined in the dictionary.
     */
    Set<String> words();
}
