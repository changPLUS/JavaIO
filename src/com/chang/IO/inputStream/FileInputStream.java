package com.chang.IO.inputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) {
        read2();
    }
    public static void read(){
        String ReadFile = "e:\\new2.txt";
        int i = 0;
        java.io.FileInputStream fileInputStream = null;
        try {
            //创建fileInputStream对象，用于读取文件
            fileInputStream = new java.io.FileInputStream(ReadFile);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法讲阻止
            //如果返回-1，表示读取完毕
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void read2(){
        String Filename1 = "e:\\new2.txt";
        byte[] buf =new byte[8];
        int readLen = 0;
        java.io.FileInputStream fileInputStream = null;
        try {
            fileInputStream = new java.io.FileInputStream(Filename1);
            while ((readLen = fileInputStream.read(buf)) != -1){
                System.out.println(new String(buf,0,readLen));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
