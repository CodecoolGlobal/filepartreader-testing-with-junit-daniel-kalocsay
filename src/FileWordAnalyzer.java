import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnalyzer {
    private FilePartReader filePartReader;
    private List<String> allWords;

    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List getWordsInAlphabeticalOrder() throws IOException {
        allWords = Arrays.asList(filePartReader.read().split("\\s+"));

        Collections.sort(allWords);
        return allWords;
    }

    public List getWordsContainingSubstring(String substring) throws IOException {
        allWords = Arrays.asList(filePartReader.read().split("\\s+"));

        List<String> results = new ArrayList<>();

        for (String word : allWords) {
            if (word.contains(substring)) results.add(word);
        }

        return results;
    }

    public List getPalindromes() {
        return allWords;
    }
}
