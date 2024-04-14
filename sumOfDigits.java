public class sumOfDigits {
    public static void main(String[] args) {
        int a= 12345;
        int c=0,b=0;
        while (a>0){
            b=a%10;
            c+=b;
            a=a/10;
        }
        System.out.println(c);
    }
    
}
