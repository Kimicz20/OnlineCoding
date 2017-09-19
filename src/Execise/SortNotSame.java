package Execise;

/**
 * Created by geek on 2017/9/14.
 */
public class SortNotSame {

    private static int count=0;

    private static void Pailie(String s, String s1) {
        if(s.length()<1){
            count++;
        }
        else{
            int index[]=new int[s.length()];
            for (int i=0;i<s.length();i++){
                index[i]=s.indexOf(s.charAt(i));
            }
            for(int i=0;i<s.length();i++){
                if(i == index[i]){
                    Pailie(s.substring(1),s1+s.substring(0,1));
                }
                s=s.substring(1)+s.substring(0,1);
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
//        String s ="1223";
//        Pailie(s,"");
        try{
            throw new OutOfMemoryError();
        }catch (RuntimeException e){
            System.out.println("a");
        }
    }
}
