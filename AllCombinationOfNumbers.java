import java.util.ArrayList;

public class AllCombinationOfNumbers {
    public static void main(String[] args) {
        int n = 6;
        ArrayList <Integer> a = new ArrayList<>();
        for (int k=1;k<=n;k++)
        print(a, 1, k, n);
    }

    static void print (ArrayList<Integer> a,int i, int k,int n){
        if (i>n){
            if (a.size()==k){
            System.out.println(a);
        }
        return;
        }
        a.add(i);
        print(a, i+1, k, n);
        a.remove(a.size()-1);
        print(a, i+1, k,n);
    }
    
}
