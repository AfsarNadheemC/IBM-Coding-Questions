public class excell {
    public static void main(String[] args) {
        String a = "B10:F20";
        int r1,r2=0,l1=0,l2;
        int c=0,t;
        r1=(int)a.charAt(0)-64;
        for (int i=1;i<a.length();i++){
            if (a.charAt(i)==':'){
                l1=c;
                c=0;
                i++;
                r2=(int)a.charAt(i)-64;
            }
            else {
                c*=10;
                t=(int)a.charAt(i)-48;
                c=c+t;
            }
        }
        l2 = c;
        System.out.println((r2-r1+1)*(l2-l1+1));
    }
    
}
