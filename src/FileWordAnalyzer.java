import java.util.ArrayList;
import java.util.List;

public class FileWordAnalyzer {
    private FilePartReader filePartReader;
    private List<String> result = new ArrayList<>();

    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List getWordsInAlphabeticalOrder() {
        return result;
    }

    public List getWordsContainingSubstring(String substring) {
        return result;
    }

    public List getPalindromes() {
        return result;
    }
}
