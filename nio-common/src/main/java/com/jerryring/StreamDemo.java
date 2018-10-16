package com.jerryring;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-16
 */

//字节流
//    流分类：
//            1.Java的字节流
//            InputStream是所有字节输入流的祖先，而OutputStream是所有字节输出流的祖先。
//            2.Java的字符流
//            Reader是所有读取字符串输入流的祖先，而writer是所有输出字符串的祖先。
//            InputStream，OutputStream,Reader,writer都是抽象类。所以不能直接new
public class StreamDemo {
    public static void main(String[] args) throws IOException {



        //使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");

        // 准备好一个输出的对象
        OutputStream out = null;


        out = new FileOutputStream(f);

        //写操作
        String str = "Hello World!!!";

        // 字符串转byte数组
        byte b[] = str.getBytes();

        out.write(b);
//        强制性清空缓冲区中的内容
        out.flush();

        // out.close();
    }
}
