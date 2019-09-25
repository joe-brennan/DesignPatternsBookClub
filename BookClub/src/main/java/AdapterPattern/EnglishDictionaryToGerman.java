package AdapterPattern;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EnglishDictionaryToGerman implements Dictionary {
    private Map<String, String> content;


    public EnglishDictionaryToGerman(GermanToEnglishDictionary dictionary) {
        Set<String> words = dictionary.words();
        content = words.stream().collect(
                Collectors.toMap(
                        key -> dictionary.lookup(key),
                        key -> key
                )
        );
    }

    @Override
    public String lookup(String from) {
        return content.get(from);
    }

    @Override
    public Set<String> words() {
        return content.keySet();
    }
}

