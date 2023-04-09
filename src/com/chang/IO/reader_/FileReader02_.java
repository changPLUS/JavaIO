package com.chang.IO.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02_ {
    public static void main(String[] args) {
        read02();
    }
    public static void read02(){
        String fileName = "e:\\b.txt";
        FileReader fileReader = null;
        char[] content = new char[1024];
        int num = 0;
        try {
            fileReader = new FileReader(fileName);
            //循环读取，使用read(content),返回的是实际读取到的字符数
            while ((num = fileReader.read(content)) != -1){
                System.out.print(new String(content,0,num));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
