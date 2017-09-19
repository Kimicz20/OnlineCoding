package 牛客2017第三次编程;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by geek on 2017/9/19.
 */
public class Main {

    private static void f0() {
        Scanner in = new Scanner(System.in);
        String a;
        while(in.hasNext()){
            a = in.next();
            int result = 0;
            for(int i=1;i<a.length();i++){
                if(a.charAt(i-1) == a.charAt(i)){
                    result++;
                    i++;
                }
            }
            System.out.println(result);
        }
    }

    public static boolean isIn(char c){
        if(c=='A' || c=='T'|| c=='C'||c =='G'){
            return true;
        }
        return false;
    }


    private static void f1() {
        Scanner in = new Scanner(System.in);
        String a;
        while(in.hasNext()){
            a = in.next();
            int[] n = new int[a.length()];
            int max=0;
            for(int i=0;i<a.length();i++){
                char curr = a.charAt(i);
                if(!isIn(curr)){
                   n[i]=0;
                }else{
                    if(i==0)
                        n[i]=1;
                    if(i>0 && n[i-1]>=0){
                        n[i]=n[i-1]+1;
                    }
                    if(max<n[i]){
                        max=n[i];
                    }
                }
            }
            System.out.println(max);
        }
    }
    static int count=0;
    private static void doubleStr(String a) {
        int mid = a.length()/2;
        String a0 = a.substring(0,mid);
        String a1 = a.substring(mid);
        if (!a0.equals(a1)){
            a = a.substring(0,a.length()-2);
            count=count+2;
            doubleStr(a);
        }
    }

    private static void f2() {
        Scanner in = new Scanner(System.in);
        String a;
        while(in.hasNext()){
            a = in.next();
            if(a.length()%2==0){
                count=count+2;
                doubleStr(a.substring(0,a.length()-2));
            }else{
                count++;
                doubleStr(a.substring(0,a.length()-1));
            }

            System.out.println(a.length()-count);
        }
    }

    private static void f3() {
        Scanner in = new Scanner(System.in);
        String a;
        while(in.hasNext()) {
            a = in.next();
            char[] chars = a.toCharArray();
            List<Character> list = new ArrayList<>();
            for (char c :chars){
                if(list.contains(c)){
                    list.remove(list.indexOf(c));
                }else{
                    list.add(c);
                }
            }
            System.out.println(list.size());
        }
    }

    private static void f4() {
        Scanner scanner = new Scanner(System.in);
        int len=scanner.nextInt();
        long ans=1;
        boolean[] visited = new boolean[len+1];
        for(int i=2; i<=len; i++) {
            if(visited[i])
                continue;
            for(int j=2*i; j<=len; j+=i)
                visited[j] = true;
            int count=0;
            long k=i;  //int会溢出
            while(k<=len) {
                k*=i;
                count++;
            }
            ans=ans*(count+1)%1000000007;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
//        f0();
//        f1();
//        f2();
//        f3();
        f4();
    }
}