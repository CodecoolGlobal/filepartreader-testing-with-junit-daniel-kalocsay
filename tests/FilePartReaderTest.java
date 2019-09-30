import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    @Test
    // public void testFileNotFound
    public void Should_ThrowException_IfCannotFindFile() {
        FilePartReader filePartReader = new FilePartReader();

        assertThrows(NoSuchFileException.class, () -> {
            filePartReader.setup("hue", 1, 5);
            filePartReader.read();
        });
    }

    @Test
    // public void testFromLineIsNotOver0
    public void Should_ThrowException_IfFromLineIsUnder0() {
        FilePartReader filePartReader = new FilePartReader();

        assertThrows(IllegalArgumentException.class, () -> {
            filePartReader.setup("hue", 0, 5);
        });
    }

    @Test
    // public void testFromLineIsNotOverToLine
    public void Should_ThrowException_IfToLineIsSmallerThanFromLine() {
        FilePartReader filePartReader = new FilePartReader();

        assertThrows(IllegalArgumentException.class, () -> {
            filePartReader.setup("hue", 4, 2);
        });

    }
}