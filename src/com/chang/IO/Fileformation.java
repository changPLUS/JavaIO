package com.chang.IO;

import java.io.File;
import java.io.FileNotFoundException;

public class Fileformation {
    public static void main(String[] args) {
        try {
            method();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void method() throws FileNotFoundException {
        File file = new File("e:\\new1.txt");

        //调用相应的方法，得到对应信息
        System.out.println("文件名字="+file.getName());
        System.out.println("文件绝对路径="+file.getAbsolutePath());
        System.out.println("文件父级目录="+file.getParent());
        System.out.println("文件大小(字节)="+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("是否为文件="+file.isFile());
        System.out.println("是否为目录="+file.isDirectory());
    }
}
