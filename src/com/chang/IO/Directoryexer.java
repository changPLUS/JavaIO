package com.chang.IO;

import java.io.File;

public class Directoryexer {
    public static void main(String[] args) {
        //del();
        //del02();
        del03();
    }
    //判断e:\\new1.txt是否存在，如果存在就删除
    public static void del(){
        File file = new File("e:\\new1.txt");
        if (file.exists()){
            if (file.delete()){
                System.out.println("文件删除成功");
            }else {
                System.out.println("文件删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    //判断e:\\demo02是否存在，存在就删除，否则提示不存在
    //这里我们需要体会到，在java编程中，目录也被当作文件
    public static void del02(){
        File file = new File("e:\\demo02");
        if (file.exists()){
            if (file.delete()){
                System.out.println("该目录删除成功");
            }else {
                System.out.println("该目录删除失败");
            }
        }else {
            System.out.println("该目录不存在");
        }
    }
    //判断E:\\demo\\a\\b\\c 目录是否存在，如果存在就提示已经存在，否则就创建
    public static void del03(){
        File file = new File("E:\\demo\\a\\b\\c");
        if (file.exists()){
            System.out.println("该目录存在");
        }else {
            if (file.mkdirs()){//创建一级目录使用mkdir(),创建多级目录，使用mkdirs()
                System.out.println(file+"目录创建成功");
            }else {
                System.out.println(file+"创建失败");
            }
        }

    }
}
