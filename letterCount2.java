

public class letterCount2 {
    public static void main(String[] args) {
        String a = "aajaaabbbbbbbcccccccc";
        a+=" ";
        int c=1;
        for (int i=1;i<a.length();i++){
            if (a.charAt(i)==a.charAt(i-1)) c++;
            else {
                System.out.print(a.charAt(i-1));
                System.out.print(c);
                c=1;
            }
        }
    }
    
}
