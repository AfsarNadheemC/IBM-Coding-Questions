public class fibbonaciTriangle {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for (int i=0;i<=8;i++){
            for (int j=0;j<=i;j++){
                System.out.print(b+" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
    
}
