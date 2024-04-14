public class reverseEach {
    public static void main(String[] args) {
        String a = "Afsar Nadheem Bro";
        String c = "", b= "";
        a+=' ';
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)==' '){
                c+=reverse(b)+" ";
                b="";
            }
            else b+=a.charAt(i);
        }
        System.out.println(c);

    }

    static String reverse (String a){
        String b ="";
        for (int i=a.length()-1;i>=0;i--)
            b+=a.charAt(i);
        return b;
    }
    
}
