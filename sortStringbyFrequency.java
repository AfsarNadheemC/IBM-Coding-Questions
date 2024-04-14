import java.util.Arrays;

public class sortStringbyFrequency {
    public static void main(String[] args) {
        String a = "asdfghjygfdadgtadr";
        String a2 = "";
        System.out.println(a);
        char c [] = new char [a.length()];
        int b [] = new int [a.length()];
        int t = 0;
        int j;
        for (int i=0;i<a.length();i++){
            if (pre(i, a))  {
                c[t]=a.charAt(i);
                for(j=i;j<a.length();j++){
                    if (a.charAt(i)==a.charAt(j))   b[t]++;
                }
                t++;
            }
        }
        for (int i=0;i<a.length();i++){
            for (j=i+1;j<a.length();j++){
                if (b[i]<b[j]){
                    int x = b[i];
                    b[i]= b[j];
                    b[j]=x;
                    char y= c[i];
                    c[i]= c[j];
                    c[j]=y;
                }
            }
        }
        for (int i=0;i<a.length();i++){
            for (j=0;j<b[i];j++){
                a2+=c[i];
            }
        }
        System.out.println(a2);
    }

    static boolean pre (int x,String a){
        for (int i=0;i<x;i++){
            if (a.charAt(x)==a.charAt(i))   return false;
        }
        return true;
    }
    
}
