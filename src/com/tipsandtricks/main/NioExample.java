package com.tipsandtricks.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args) throws IOException {
/*        FileInputStream fileInputStream = new FileInputStream("F:\\Desenvolvimentos Pessoais\\Projects\\tipsandtricks\\source.txt");
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int result = fileChannel.read(byteBuffer);
        System.out.println("File read successfully: " + result + " bytes.");*/

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\Desenvolvimentos Pessoais\\Projects\\tipsandtricks\\dest.txt");
        FileChannel writeChannel = fileOutputStream.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "This is a test string 2/";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("File written successfully.");
    }
}
