public class binaryToTime {
    public static void main(String[] args) {
        long a =111111111;
        int c=0,b,d=1;
        while (a>0) {
            b=(int)a%10;
            b*=d;
            c+=b;
            d*=2;
            a/=10;
        }
        int m = c/60;
        int s = c%60;
        String time = "";
        time+=(char)m/10;
        time+=(char)m%10;
        time+=':';
        time+=(char)s/10;
        time+=(char)s%10;
        System.out.println(time);
    }
    
}
