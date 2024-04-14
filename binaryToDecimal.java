
public class binaryToDecimal {
    public static void main(String[] args) {
        int a = 8;
        int c = 0 , b,g=a,h=1;;
        while (a>0){
            b=(a%2);
            b*=h;
            c+=b;
            h*=10;
            a=a/2;
        }
        System.out.println("The binary value of "+g+" is "+c);
    }
     
}