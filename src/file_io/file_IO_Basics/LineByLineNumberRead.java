package file_io.file_IO_Basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineByLineNumberRead {

    public static void main(String[] args) {

    }

    private static void readFromFile(String fileName) throws FileNotFoundException {
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName));

        // Print the initial line number

    }
}
