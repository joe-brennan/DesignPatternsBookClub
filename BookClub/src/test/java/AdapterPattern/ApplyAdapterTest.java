package AdapterPattern;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplyAdapterTest {
    EnglishDictionaryToGerman dictionary = new EnglishDictionaryToGerman();
    EnglishDictionaryToGerman advancedDictionary = new EnglishDictionaryToGerman();
//    EnglishDictionaryToGerman dictionary = new EnglishDictionaryToGerman(new GermanToEnglishDictionary());
//    EnglishDictionaryToGerman advancedDictionary = new EnglishDictionaryToGerman(new AdvancedGermanToEnglishDictionary());

    @Test
    public void givenEnglishWordConvertToGermanCorrectly(){
        assertEquals("Katze",dictionary.lookup("cat"));
    }

    @Test
    public void givenEnglishWordConvertToAdvanceGermanCorrectly(){
        assertEquals("Schmetterling",advancedDictionary.lookup("butterfly"));
    }

}