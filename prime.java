public class prime {
    public static void main(String[] args) {
        int n=50;
        for (int i=2;i<=n;i++){
            if (primeCheck(i))   
            System.out.println(i);
        }
    }

    static boolean primeCheck(int n){
        for (int j=2;j<sqrt(n);j++){
            if (n%j==0) return false;
        }
        return true;
    }

    static int sqrt(int n){
        for (int i=0;i<n;i++){
            if (i*i>n) return n;
        }
        return -1;
    }
    
}
