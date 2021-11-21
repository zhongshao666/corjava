package com.briup.ioTest;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamTest {
    public static void main(String[] args)
            throws IOException {
        Vector<InputStream> vc=new Vector<>();
        vc.add(
                new ByteArrayInputStream(
                        "byte...hello\n".getBytes()));
        vc.add(new FileInputStream(
                "src/com/briup/ioTest/a.txt"));
        vc.add(new FileInputStream(
                "src/com/briup/ioTest/b.txt"));
        Enumeration<InputStream> en=vc.elements();
        SequenceInputStream sis=
                new SequenceInputStream(en);
        int len;
        byte[] b=new byte[1024];
        while((len=sis.read(b))!=-1){
            System.out.write(b,0,len);
            System.out.flush();
        }
    }
}
