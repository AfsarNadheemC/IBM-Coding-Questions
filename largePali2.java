public class largePali2 {
    public static void main(String[] args) {
        String a = "lsdfredsa";
        System.out.println(pali(a));
    }

    static String pali (String a){
        if (check(a))
        return a;
        return pali(a.substring(0, i)+a.substring(i+1, a.length()));
        return "";
    }

    static boolean check (String a){
        for (int i=0,j=a.length()-1;i<a.length()/2;i++,j--){
            if (a.charAt(i)!=a.charAt(j))   return false;
        }
        return true;
    }
    
}
