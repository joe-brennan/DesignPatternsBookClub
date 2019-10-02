package AdapterPattern;

import java.util.Set;
import java.util.stream.Collectors;

public class EnglishDictionaryToGerman1 implements Dictionary {
    private GermanToEnglishDictionary dictionary;


    public EnglishDictionaryToGerman1(GermanToEnglishDictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String lookup(String from) {
        return convertToEnglish(dictionary.lookup(from));
    }

    @Override
    public Set<String> words() {
        return dictionary.words();
    }

    // private method which will switch the look up
    private String convertToEnglish(String from) {
//        return dictionary.words().stream().reduce(
//
//                        key -> dictionary.lookup(from),
//                        key -> key
//                )
//        );
//    }
        return null;
    }
}

