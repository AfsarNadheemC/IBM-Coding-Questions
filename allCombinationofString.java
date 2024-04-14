public class allCombinationofString {
    public static void main(String[] args) {
        String a = "asdgjfdsa";
        for (int k=a.length();k>0;k--){
            if (combi("", a, k,0)){02
                System.out.println(k);
                return;
            }
        }
    }

    static String combi (String s, String a, int k,int i){
        if (i>=a.length()){
            if (s.length()==k){
                if (pali(s)){
                    System.out.println(s);
                    return s;
                }

            }
        }
        s+=a.charAt(i);
        combi(s, a, k, i+1);
        s=s.substring(0, s.length()-1);
        combi(s, a, k, i+1);
    }

    static boolean pali (String a){
        for (int i=0,j=a.length()-1;i<a.length()/2;i++,j--){
            if (a.charAt(i)!=a.charAt(j))   return false;
        }
        return true;
    }
    
}
