package com.tipsandtricks.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteStreamExample {
    public static void main (String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("F:\\source.txt");
            outputStream = new FileOutputStream("F:\\dest.txt");

            // reads a byte at a time, if it reached the end of the file, returns -1
            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write((byte) content);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
