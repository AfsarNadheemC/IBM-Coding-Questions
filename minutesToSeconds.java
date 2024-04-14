public class minutesToSeconds {
    public static void main(String[] args) {
        String a = "04:54";
        int c = 0, b,total=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)==':'){
                total+=c*60;
                c=0;
            }
            else{
                c*=10;
                b=(int)a.charAt(i)-48;
                c+=b;
            }
        }
        total+=c;
        System.out.println(total);
    }
    
}
