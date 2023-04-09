package com.chang.IO.outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {
        //out01();
        //out02();
        //out03();
        out04();
    }
    public static void out01(){
        //得到FileOutputStream对象
        String filepath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //1.new FileOutputStream(filepath)创建方式，写入内容是会覆盖原来的内容
            //2.new FileOutputStream(filepath，true);创建方式，写入内容是追加到文件后面
            fileOutputStream = new FileOutputStream(filepath);
            //写入一个字节
            fileOutputStream.write('H');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void out02(){
        //得到FileOutputStream对象
        String filename = "e:\\b.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename);
            //写入一个字符串
            String content = "hello,world";
            //str.getBytes()可以把字符串-->字节数组
            fileOutputStream.write(content.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void out03(){
        //得到FileOutputStream对象
        String filename = "e:\\c.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename);
            String content = "chang";
            fileOutputStream.write(content.getBytes(),0,2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //写入内容追加到文件中
    public static void out04(){
        String filename = "e:\\e.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename,true);
            String content = "chang";
            fileOutputStream.write(content.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
