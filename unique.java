import java.util.ArrayList;

public class unique {
    public static void main(String[] args) {
        int a = 1232;
        ArrayList <Integer> ar = new ArrayList<>();
        while (a>0){
            ar.add(a%10);
            a/=10;
        }
        for (int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();j++){
                if (ar.get(i)==ar.get(j))   {
                    System.out.println("Not");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
    
}
