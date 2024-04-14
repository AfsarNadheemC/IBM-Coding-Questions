package IBM;

import java.util.Arrays;

public class arrangingCounts {
    public static void main(String[] args) {
        String a = "a2b5a5v9b1c5g2";
        char [] c = new char[a.length()];
        int [] b = new int [a.length()];
        for (int i=0;i<a.length();i=i+2){
            if (pre(i, a)){
                c[i]=a.charAt(i);
                for (int j=i;j<a.length()-1;j=j+2){
                    if (a.charAt(j)==c[i]){
                        b[i]=b[i]+(int)a.charAt(j+1)-48;
                    }
                }
            }

        }
        for (int i=0;i<a.length();i++){
            if (b[i]>0)
            System.out.print(c[i]+""+b[i]);
        }
    }

    static boolean pre (int x,String a){
        for (int i=0;i<x;i++){
            if (a.charAt(x)==a.charAt(i))   return false;
        }
        return true;
    }
    
}
