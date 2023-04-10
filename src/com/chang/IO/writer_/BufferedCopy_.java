package com.chang.IO.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFile = "e:\\b.txt";
        String tarFile = "e:\\b1.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(tarFile));
            bufferedReader = new BufferedReader(new FileReader(srcFile));
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
