package IO.IO_file;

import java.io.File;
import java.util.Arrays;

/**
 * Created by H.J
 * 2018/4/28
 */
public class DirList {

    public static void main(String[] args){

        File path = new File(".");

        String[] list;

        if(args.length == 0) list = path.list();
        else list = path.list(new DirFilter(args[0]));

        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);

        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
