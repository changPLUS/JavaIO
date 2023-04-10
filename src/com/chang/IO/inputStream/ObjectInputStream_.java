package com.chang.IO.inputStream;




import com.chang.IO.ObjectOutStream_.Dog;
import java.io.*;
import java.io.FileInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "e:\\object.dat";
        ObjectInputStream ois = null;
        ois = new ObjectInputStream(new FileInputStream(fileName));
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("Dog的运行类型="+dog.getClass());
        System.out.println(dog);
        //重点细节
        //1.如果我们希望调用Dog的方法，需要向下转型
        //2.需要我们讲Dog类的定义，拷贝到可以引用的位置
        Dog dog1  = (Dog)dog;
        System.out.println(dog1.getAge());
        ois.close();
    }
}
