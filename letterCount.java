

public class letterCount {
    public static void main(String[] args) {
        String a = "a5b7c8";
        char b;
        int c;
        for (int i=0;i<a.length();i++){
            if (i%2!=0) {
                c=a.charAt(i)-48;
                for (int j=0;j<c;j++){
                    System.out.print(a.charAt(i-1)+" ");
                }
            }
        }
    }
}
