package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String,String> words;

    public Dictionary()
    {
        this.words = HashMap.newHashMap(20);
    }

    public void addWord(String word, String translation)
    {
        words.put(word,translation);
    }

    public String translate(String word)
    {
        if(words.containsKey(word))
        {
            return words.get(word);
        }
        else
        {
            return "word not found";
        }
    }

    public int numberOfWords()
    {
        return words.size();
    }
}
