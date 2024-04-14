package IBM;

public class wildCardElimination {
    public static void main(String[] args) {
        String a = "Afsar";
        String b = "A*ar";
        int i,j;
        for (i=b.length()-1,j=a.length()-1;j>=0 && i>=0;i--,j--){
            System.out.println(i); 
            if (a.charAt(j)==b.charAt(i)||b.charAt(i)=='?'){
                a=a.substring(0, j)+a.substring(j+1);
                b=b.substring(0, i)+b.substring(i+1);
            }
            else if (b.charAt(i)=='*'){
                b=b.substring(0, i)+b.substring(i+1);
                i--;
                while(a.charAt(j)!=b.charAt(i)){
                    a=a.substring(0, j)+a.substring(j+1);
                    j--;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        if (a.length()==0)  System.out.println("yes");
        else System.out.println("No");
    }
    
}
