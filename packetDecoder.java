public class packetDecoder {
    public static void main(String[] args) {
        String a = "0100100001100101011011000110110001101111";
        a+=" ";
        int c = 0,h=128,b;
        for (int i=0;i<a.length();i++){
           // System.out.print(a.charAt(i));
            if ((i+1)%8==0){
                System.out.println(c);
                c=0;
                h=128;
            }
            b=(int)a.charAt(i)-48;
            b*=h;
            h/=2;
            c+=b;
        }
    }
    
}
