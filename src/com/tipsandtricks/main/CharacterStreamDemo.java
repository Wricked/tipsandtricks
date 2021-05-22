package com.tipsandtricks.main;

import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("F:\\Desenvolvimentos Pessoais\\Projects\\tipsandtricks\\source.txt");
            writer = new FileWriter("F:\\Desenvolvimentos Pessoais\\Projects\\tipsandtricks\\dest.txt");

            // reads a character at a time, if it reached the end of the file, returns -1
            int content;
            while ((content = reader.read()) != -1) {
                writer.write((char) content);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
