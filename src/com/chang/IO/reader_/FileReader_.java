package com.chang.IO.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        read();
    }
    public static void read(){
        String fileName = "e:\\b.txt";
        FileReader fileReader = null;
        int num = 0;
        try {
            fileReader = new FileReader(fileName);
            while ((num = fileReader.read()) != -1){
                System.out.print((char)num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
