package com.briup.exerxise15;

import java.io.*;

public class T4 {


    public static void main(String[] args) {
        //普通文件->IO流->copy
        //目录文件:寻找目录所有子文件->file.mkdir()
        File from = new File("src/com/briup/exerxise15/test");
//        File to = new File("src/com/briup/exerxise15/testcopy");
        for (File f : from.listFiles()) {
            check(f, "src/com/briup/exerxise15/testcopy");
        }
    }

    //判断目录子文件
    private static void check(File file, String path) {
        String copyPath = path + "\\" + file.getName();
        if (file.isDirectory()) {
            System.out.println(copyPath);
            new File(path+"\\"+file.getName()).mkdir();
            for (File f : file.listFiles()) {

                check(f, copyPath);
            }
        } else {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            copy(file, copyPath);
                        }
                    }
            ).start();

        }
    }

    private static void copy(File f, String path) {
        System.out.println(f.getPath());
        System.out.println(path);
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            fw = new FileWriter(path);
            int len;
            char[] arr = new char[128];
            while ((len = fr.read(arr)) != -1) {
                fw.write(arr,0,len);
            }
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}



/*
class Work extends Thread {
    private File file;
    String path="src/com/briup/exerxise14/";
    public Work() {
    }

    public Work(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        if(file.isDirectory()){
            File file1;
            file1=new File(path+file.getName());
            if(!file1.exists()){
                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (!file.isDirectory()) {
            InputStream input = null;

            OutputStream output = null;

            try {

                input = new FileInputStream(file);

//                output = new FileOutputStream();

                byte[] buf = new byte[1024];

                int bytesRead;

                while ((bytesRead = input.read(buf)) != -1) {

                    output.write(buf, 0, bytesRead);

                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    assert input != null;
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    assert output != null;
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files
            ) {
//                work1(f);//判断完往回走
            }
        }
    }
}*/
