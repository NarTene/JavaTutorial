package file_io.file_IO_Basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadOnly_File {

    public static void main(String[] args) {

    }

    public static void readOnlyUsingSetWritable() throws IOException {
        File readOnly = new File("testFileSix.txt");
        //this is how you can set file to be read only
        // boolean rw = readonly.setWritable(true)
        boolean flag = readOnly.setReadOnly();

        if (flag == true){

            System.out.println("File is read only");
        } else {
            System.out.println("File is not read only");
        }

        FileWriter writer = new FileWriter(readOnly);
        writer.write("please test this read only file");
        writer.close();
    }
}
