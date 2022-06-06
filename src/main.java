import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        String text = "chop chop chop chop chop chop zone zone zone rah rah dope";
        String [] textArray = text.split(" ");
        HashMap<String, Integer> mappedWords = new HashMap<>();
        for (String word:textArray){
            if (!mappedWords.containsKey(word)){
                mappedWords.put(word,1);
            } else{
                mappedWords.replace(word,mappedWords.get(word) + 1);
            }
        }
    }
}
