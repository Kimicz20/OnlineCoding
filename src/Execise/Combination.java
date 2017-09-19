package Execise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by geek on 2017/9/14.
 */
public class Combination {

    private static void listAll(List<String> candiate, String prefix) {
        System.out.println(prefix);

        for(int i=0;i<candiate.size();i++){
            List tmp = new LinkedList(candiate);
            listAll(tmp,prefix+tmp.remove(i));
        }
    }

    public static void main(String[] args) {
        String[] array = new String[]{"1","2","2","4"};
        listAll(Arrays.asList(array),"");
    }
}
