package IBM;

import java.util.*;

public class wildCard {
    public static void main(String[] args) {
        String a = "Afsar";
        String b = "Afs??*";
        System.out.println(wild(a, b));
    }

    static boolean wild (String a, String b){
        int i=0,j=0;
        for (;i<a.length();i++,j++){
            if (a.charAt(i)==b.charAt(j)) continue;
            else if (b.charAt(j)=='?')  continue;
            else if (b.charAt(j)=='*'){
                while (b.charAt(j)=='*')   {
                    if (j==b.length()-1)    return true;
                    if ( b.charAt(j)=='?')
                    if( b.charAt(j+1)!='*') break;
                    j++;
                } 
                while (a.charAt(i)!=b.charAt(j)){
                    i++;
                    if (a.charAt(i)==b.charAt(j))   break;
                    if (i==a.length()-1)    return false;
                }
            }
        }
        if (j==b.length())  return true;
        return false;
    }
    
}
