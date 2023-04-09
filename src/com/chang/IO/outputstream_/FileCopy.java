package com.chang.IO.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        copy();
    }
    public static void copy(){
        String originallyfile = "e:\\a.jpg";
        String targetfile = "e:\\a1.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] content = new byte[1024];
        int num = 0;
        try {
            fileInputStream   = new FileInputStream(originallyfile);
            fileOutputStream = new FileOutputStream(targetfile);
            while ((num = fileInputStream.read(content)) != -1){
                fileOutputStream.write(content,0,num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
