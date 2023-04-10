package com.chang.IO;

public class BufferedReader extends Reader_ {
    private Reader_ reader_;
    //接收Reader_子类对象
    public
    BufferedReader(Reader_ reader_){
        this.reader_ = reader_;
    }
    public void readFile(){
        reader_.readFile();
    }
    public void readString(){
        reader_.readString();
    }
}
