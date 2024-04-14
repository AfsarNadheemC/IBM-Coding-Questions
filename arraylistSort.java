import java.util.ArrayList;

public class arraylistSort {
    public static void main (String [] args){
        ArrayList <Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        ar.add(1);
        for (int i=0;i<ar.size();i++){
            for (int j=i+1;j<ar.size();j++){
                if (ar.get(i)>ar.get(j)){
                    int x = ar.get(i);
                    ar.set(i,ar.get(j));
                    ar.set(j,x);
                }
            }
        }
        System.out.println(ar);
    }
    
}
