package com.chang.IO;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

        /*try {
            create01();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            create02();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            create03();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式1 new File(String pathname)
    public static void create01() throws IOException {
        String filePath = "e:\\new1.txt";
        File file = new File(filePath);
        file.createNewFile();
        System.out.println("文件创建成功");
    }

    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //e:\\new2.txt
    public static void create02() throws IOException{
        File parentFile = new File("e:\\");
        String fileName = "new2.txt";
        //这里的file对象，在java程序中，只是一个对象
        File file = new File(parentFile, fileName);
        //只有执行力createNewFile方法，才会真正的在磁盘创建文件
        file.createNewFile();
        System.out.println("new2文件创建成功");
    }
    //方式3 new File(String parent,String child) //根据父目录+子路径构建
    public static void create03() throws IOException{
        String parentPath = "e:\\";
        String fileName = "new3.txt";
        File file = new File(parentPath, fileName);
        file.createNewFile();
        System.out.println("new3.txt创建成功");
    }
    }

