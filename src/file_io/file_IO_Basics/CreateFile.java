package file_io.file_IO_Basics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Paths.*;

public class CreateFile  {
    public static void main(String[] args)throws IOException {

        //Create file using Char Stream class
        File file = new File("testFileOne.txt");
        if(file.createNewFile()){
            System.out.println("File has been created");

        }else {
            System.out.println("File is already exists");
        }
        //write the file
        FileWriter writer = new FileWriter(file);
        writer.write("Test Data");
        writer.close();// good practice, always keep the pointer close at the end of a file creation.

        //Create and write the file using stream (byte code)
        String data = "testFileTwo.txt";
        FileOutputStream outputStream = new FileOutputStream(data);

        outputStream.write(data.getBytes());
        outputStream.close(); // close the stream

        //Create and write file using NIO(New Input Output)
        String newData = "File writing using NIO";
        Files.write(Paths.get("testFileThree.txt"), newData.getBytes());

    }
}
