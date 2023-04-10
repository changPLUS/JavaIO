package com.chang.IO.writer_;

import java.io.*;

public class BufferCopy1_ {
    public static void main(String[] args) throws IOException {
       // FileInputStream
        //InputStream
        //ObjectOutputStream
        //FileOutputStream
        String srcFile = "D:\\安装文件\\微信\\weixin\\WeChat Files\\wxid_go3jaemxyj2522\\FileStorage\\Video\\2023-04\\ec5ba1240193a1eeb2af038128dc593f.mp4";
        String tarFile= "e:\\2.mp4";
        int i ;
        byte[] bytes = new byte[4096];
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        bi =  new BufferedInputStream(new FileInputStream(srcFile));
        bo = new BufferedOutputStream(new FileOutputStream(tarFile));
        while ((i = bi.read(bytes)) != -1){
            bo.write(bytes,0,i);
        }
        System.out.println("1111");
        if (bi != null){bi.close();}

        if (bo != null){bo.close();}

    }

}
