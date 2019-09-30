import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    public void setup(String filePath, Integer fromLine, Integer toLine) {

        if (fromLine < 1) throw new IllegalArgumentException("fromLine parameter cannot be smaller than 1!");
        if (toLine < fromLine) throw new IllegalArgumentException("toLine parameter cannot be smaller than fromLine!");

        this.fromLine = fromLine;
        this.toLine = toLine;
        this.filePath = filePath;
    }

    public String read() throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);

        StringBuilder contents = new StringBuilder();

        for (int i = fromLine; i <= toLine; i++) {
            String currentLine = br.readLine();

            if (currentLine == null) break;
            contents.append(currentLine + "\n");

        }

        return contents.toString();
    }
}
