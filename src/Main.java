import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("test");

        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setup("src/fileToRead.txt", 1, 15);

        String result = filePartReader.read();
        System.out.println(result);

    }
}
