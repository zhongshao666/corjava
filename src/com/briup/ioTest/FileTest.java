package com.briup.ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;

/*
/Users/huzhongliang/Documents/idea_work/corejava_test/src/com/briup/ioTest/a.txt
 src/com/briup/ioTest/a.txt
 com/briup/ioTest/a.txt
 file:///Users/huzhongliang/Desktop/corejava/jdk6_api_ch/index.html
 */
public class FileTest {
    public static void main(String[] args) {
//        File ur=new File(URI.create("file:///Users/huzhongliang/Documents/idea_work/corejava_test/src/com/briup/ioTest/a.txt"));
//        File file=
//                new File("src/com/briup/ioTest/","a.txt");
//        File file1=
//                new File("src/com/briup/ioTest/a.txt");
        //是否可读
//        System.out.println(file1.canRead());
        //是否可写
//        System.out.println(file1.canWrite());
        //是否可执行
//        System.out.println(file1.canExecute());
//        File file2=
//                new File("src/com/briup/ioTest/b.txt");
//        try {
        //创建文件
//            file2.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file2=
//                new File("src/com/briup/ioTest/");
//        try {
//            for(int i=0;i<5;i++) {
                ///var/folders/89/nt046cb17_5f4bx_ktm445jc0000gn/T/test8390663386023739128.txt
                //创建临时文件，在操作系统中默认存放临时文件的位置
//                File file =
//                        File.createTempFile("test", ".txt");
        //在指定目录下生成临时文件
//                File file =
//                        File.createTempFile("test",
//                                ".txt",
//                                new File("src/com/briup/ioTest/"));
//
//                Thread.sleep(2000);
//                System.out.println(file);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date().getTime());

//        File file2=
//                new File("src/com/briup/ioTest/test1520695378512148957.txt");
        //删除文件
//        boolean b=file2.delete();
//        System.out.println(b);
        //判断文件路径是否存在，存在true
//        System.out.println(file2.exists());
//        File file2=
//                new File("src/com/briup/ioTest/a.txt");
//        File file= null;
//        String path=null;
//        try {
//            ////获取文件或者目录相对操作系统的绝对路径
//            file = file2.getCanonicalFile();
//            System.out.println(file);
//            path=file2.getCanonicalPath();
//            System.out.println(path);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //获取文件或者目录相对操作系统的绝对路径
//        File file=file2.getAbsoluteFile();
//        System.out.println(file);
        //获取文件或者目录相对操作系统的绝对路径
//        String file1=file2.getAbsolutePath();
//        System.out.println(file1);
//            File file2=
//                    new File("src/com/briup/ioTest/");
//            //获取当前能使用的空间
//            System.out.println(file2.getFreeSpace()/1024.0/1024/1024);
//            //获取所有的使用的和空闲的空间（除了操作系统之外的空间）
//            System.out.println(file2.getTotalSpace()/1024.0/1024/1024);
//            //可以用于指定路径虚拟机可用字节
//            System.out.println(file2.getUsableSpace()/1024.0/1024/1024);
//            //判断路径是不是一个目录
//            System.out.println(file2.isDirectory());
//            //判断路径是否是一个文件
//            System.out.println(file2.isFile());
//            //判断文件是否是隐藏文件 .XXXX
//            System.out.println(file2.isHidden());
//            //返回文件路径对应的目录或者文件的大小
//            System.out.println(file2.length());
//        File file2=
//                    new File("src/com/briup/ioTest/");
//        //返回指定目录下的所有的文件及目录
//            String str[]=file2.list();
//            for(String s:str){
//                System.out.println(s);
//            }
//        String[] paths=file2.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                //return name.endsWith(".txt");
//                //return name.matches(".*In.*");
//                return name.startsWith("Byte");
//            }
//        });
//        for(String path:paths){
//            System.out.println(path);
//        }
        //列出系统中的根路径
//        File[] f=File.listRoots();
//        System.out.println(Arrays.toString(f));
        //touch a.txt
        File file2=
                new File("src/com/briup/ioTest/test/data");
        //将当前的file对象转化为请求资源标识符
        System.out.println(file2.toURI());
    }
}
