package com.chang.IO;

public class test {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader_());
        bufferedReader.readFile();
        BufferedReader bufferedReader1 = new BufferedReader(new StringReader_());
        bufferedReader1.readString();
    }
}
