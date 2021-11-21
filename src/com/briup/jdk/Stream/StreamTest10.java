package com.briup.jdk.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos=
                new FileOutputStream("src/com/briup/jdk/Stream/a.txt");
        Stream.generate(()->{
            int num= (int) (Math.random()*100);
            return num;
        }).limit(1000000).forEach(x->{
            try {
                fos.write((x+"\n").getBytes());
                fos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
