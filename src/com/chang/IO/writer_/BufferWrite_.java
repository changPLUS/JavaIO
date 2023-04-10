package com.chang.IO.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
* 演示BufferWriter使用
* */
public class BufferWrite_ {
    public static void main(String[] args) throws IOException {
        String filename = "e:\\abc.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename,true));//想要内容追加的话，在节点流里设置true
        String content = "韩顺平教育";
        bufferedWriter.write(content);
        bufferedWriter.newLine();
        bufferedWriter.write("韩顺平教育222");
        bufferedWriter.newLine();
        bufferedWriter.write("韩顺平教育33");
        bufferedWriter.newLine();
        //说明:关闭外层流即可，传入的new FileWriter(filePath),会在底层关闭
        bufferedWriter.close();

    }
}
