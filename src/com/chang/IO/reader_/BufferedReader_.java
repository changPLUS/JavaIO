package com.chang.IO.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {

        String filePath = "e:\\b.txt";
        //创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //按行读取内容
        String line = null;
        while ((line=bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        //关闭流，只需要关闭BufferedReader，因为底层会自动的去关闭节点流
        bufferedReader.close();
    }
}
