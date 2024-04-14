public class sumOfDigits2 {
    public static void main(String[] args) {
        int a=12345;
        System.out.println(sum(a));
        
    }
    
    static int sum (int n){
        int c=0,b;
        while (n>0){
            b=n%10;
            c=c+b;
            n/=10;
        }
        if (c>9)   return sum(c);
        return c;
    }
    
}
