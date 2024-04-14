import java.util.ArrayList;

public class stringArrayAddition {
    public static void main(String[] args) {
        String a [] = { "(10,20,3)", "(4,5,6)", "(7,8,9)" } ;
        ArrayList <Integer> ar = new ArrayList <> ();
        int c = 0, b = 0;
        for (int i=1;i<a[0].length();i++){
            if (a[0].charAt(i)==','||a[0].charAt(i)==')'){
                ar.add(c);
                c=0;
            }
            else {
                c*=10;
                b=(int)a[0].charAt(i)-48;
                c+=b;
            }
        }
        for (int j=1;j<a.length;j++){
            int x = 0;
            for (int i=1;i<a[j].length();i++){
                if (a[j].charAt(i)==','||a[j].charAt(i)==')'){
                    ar.set(x,ar.get(x++)+c);
                    c=0;
                }
                else {
                    c*=10;
                    b=(int)a[j].charAt(i)-48;
                    c+=b;
                }
            }
        }
        System.out.println(ar);
    }
    
}
