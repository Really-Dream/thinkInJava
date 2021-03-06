package IO.BufferedInput;

import util.Property;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by H.J
 * 2018/5/8
 * 缓冲输入文件
 */
public class BufferedInputFile {

    public static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null){
            sb.append(new StringBuilder(s)).append(new StringBuilder("\n"));
        }
        in.close();
        return sb.toString();
    }
    public static void main(String args[]) throws IOException{
        System.out.println(read(Property.getProperties("IOPath")+"BufferedInput\\BufferedInputFile.java"));
    }
}
