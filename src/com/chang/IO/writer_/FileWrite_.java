package com.chang.IO.writer_;

import java.io.*;

public class FileWrite_ {
    public static void main(String[] args) {

        write();
    }
    public static void write(){
        String fileName = "e:\\c.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter= new FileWriter(fileName);

            //写入单个字符
            fileWriter.write('H');
            //写入指定数组
            fileWriter.write(chars);
            //写入指定数组的指定部分
            fileWriter.write("王畅韩怡雪".toCharArray(),0,3);
            //写入整个字符串
            fileWriter.write("你好北京");
            //写入字符串的指定部分
            fileWriter.write("上海天津",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("插入完成");
    }

}

