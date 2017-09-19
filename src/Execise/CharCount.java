package Execise;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * Created by geek on 2017/9/14.
 */
public class CharCount {

    private void doString(String input) {
        char[]  chars = input.toCharArray();
        ArrayList<String> lists = new ArrayList();
        TreeSet set = new TreeSet();
        for (int i=0;i<input.length();i++){
            lists.add(String.valueOf(chars[i]));
            set.add(String.valueOf(chars[i]));
        }
        Collections.sort(lists);
        StringBuffer sb = new StringBuffer();
        for (String s:lists){
            sb.append(s);
        }
        input=sb.toString();
        int max=0;
        String maxStr = "";
        List<String> maxList = new ArrayList();

        Iterator its = set.iterator();
        while(its.hasNext()){
            String next = (String) its.next();
            int count = input.lastIndexOf(next) - input.indexOf(next)+1;
            if(count > max){
                max =count;
                maxStr = next;
                if(!maxList.isEmpty()){
                    maxList.clear();
                }
                maxList.add(next);
            }else if(count == max){
                maxList.add(next);
            }
        }
        String join = StringUtils.join(maxList, " ");
        System.out.println(join+" "+max);
    }

    public static void main(String[] args) {
        String input ="aiajsduhaiuhggruhapdoifjis";
        new CharCount().doString(input);
    }
}
