package com.chang.IO.ObjectOutStream_;

import java.io.*;

public class ObjectOutStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\object.dat";
        ObjectOutputStream objectOutputStream = null;
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('畅');
        objectOutputStream.writeDouble(1.1);
        objectOutputStream.writeUTF("王畅爱韩怡雪");
        objectOutputStream.writeObject( new Dog(19,"鹏"));
        objectOutputStream.close();
    }
}
