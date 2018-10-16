package com.jerryring;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-16
 */
//refer to:  https://blog.csdn.net/cynhafa/article/details/6882061
//字节流是最基本的，所有的InputStream和OutputStream的子类都是,主要用在处理二进制数据，它是按字节来处理的
//        但实际中很多的数据是文本，又提出了字符流的概念，它是按虚拟机的encode来处理，也就是要进行字符集的转化
//        这两个之间通过 InputStreamReader,OutputStreamWriter来关联，实际上是通过byte[]和String来关联
//        在实际开发中出现的汉字问题实际上都是在字符流和字节流之间转化不统一而造成的
//
//        在从字节流转化为字符流时，实际上就是byte[]转化为String时，
//public String(byte bytes[], String charsetName)
//        有一个关键的参数字符集编码，通常我们都省略了，那系统就用操作系统的lang
//        而在字符流转化为字节流时，实际上是String转化为byte[]时，
//        byte[]    String.getBytes(String charsetName)
//        也是一样的道理
public class CharacterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileWriter fileWriter = null;
        fileWriter = new FileWriter(file);

        String s = "hello io";
        byte[] sc = s.getBytes();
        fileWriter.write(s);
        fileWriter.close();

    }

}
