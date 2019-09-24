package AdapterPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdvancedGermanToEnglishDictionary extends GermanToEnglishDictionary {
    private Map<String, String> advancedContent;

    public AdvancedGermanToEnglishDictionary() {
        advancedContent = new HashMap<>();
        advancedContent.put("Schmetterling","butterfly");
    }

    @Override
    public String lookup(String from) {
        return advancedContent.get(from);
    }

    @Override
    public Set<String> words() {
        return advancedContent.keySet();
    }
}