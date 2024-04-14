public class secondsToHours {
    public static void main(String[] args) {
        int second = 3666;
        int hr = second/3600;
        second %= 3600;
        int min = second/60;
        second %= 60;
        String a ="";
        a+=(char)hr/10;
        a+=(char)hr%10;
        a+=':';
        a+=(char)min/10;
        a+=(char)min%10;
        a+=':';
        a+=(char)second/10;
        a+=(char)second%10;
        System.out.println(a);
    }
}
