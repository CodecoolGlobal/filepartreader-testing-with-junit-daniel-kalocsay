import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setup("src/fileToRead.txt", 1, 5);

        String allContent = filePartReader.read();
        System.out.println(allContent);

        System.out.println("");

        String limitedContent = filePartReader.readLines();
        System.out.println(limitedContent);

        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);

        System.out.println(fileWordAnalyzer.getWordsInAlphabeticalOrder());

        System.out.println(fileWordAnalyzer.getWordsContainingSubstring("e"));

        System.out.println(fileWordAnalyzer.getPalindromes());

    }
}
