package file_io.file_IO_Basics;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.CheckedOutputStream;

public class Write_File_Basics {

    /*
    Write File using BufferedWriter
    Write File using FileWriter/PrintWriter
    Write File using FileOutputStream
    Write File using DataOutputStream
    Write File using FileChannel
    Write File using Java 7 Path

     */
    public static void main(String[] args) throws IOException {
        usingBufferdWrter();
        usingFileWriter();
        usingFileOutputStream();
        usingDataOutputStream();
    }

    public static void usingBufferdWrter() throws IOException {
        String fileContent = "Hello Java Learner !! Welcome to how to do java file io";

        BufferedWriter writer = new BufferedWriter(new FileWriter("testFileOne.txt"));
        writer.write(fileContent);
        writer.close();
    }

    public static void usingFileWriter() throws IOException{
        String fileContent = "Hello Java Lerner !! Welcome to using file writer";
        FileWriter fileWriter = new FileWriter("testFileTwo.txt");
        fileWriter.write(fileContent);
        fileWriter.close();

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fileContent);
        printWriter.printf("Blog name is %s", "howtodoinjava.com");
        fileWriter.close();
        printWriter.close();
    }

    public static void usingFileOutputStream() throws IOException{
        String fileContent = " Hello Java Learner !! using of fileOutputStream ";
        FileOutputStream fileOutput = new FileOutputStream("testFileThree.txt");
        byte [] strByte = fileContent.getBytes(); //Convert into byte array.
        fileOutput.write(strByte);
        fileOutput.close();

    }

    public static void usingDataOutputStream() throws IOException {
        String fileContent = "Hello Java Learner !! Welcome to using DataOutputStream class";
        FileOutputStream outputStream = new FileOutputStream("testFileThree.txt");

        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
        dataOutputStream.writeUTF(fileContent);
        dataOutputStream.close();
    }

    public static void usingFileChannel() throws IOException {
        String fileContent = "Hello Java Learner !! Welcome to using FileChannel class";

        RandomAccessFile stream = new RandomAccessFile("testFileFive.txt", "rw");

        FileChannel channel = stream.getChannel();
        byte[] strByteArr = fileContent.getBytes();

        // This is to create the space in file for contented to write.
        ByteBuffer buffer = ByteBuffer.allocate(strByteArr.length);

        buffer.put(strByteArr);

        buffer.flip();
        channel.write(buffer);
        stream.close();
        channel.close();
    }
}
