
import java.util.ArrayList;

public class FibbonacciTriangle {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        System.out.println(a);
        a.add(1);
        System.out.println(a);
        for (int i=0;i<3;i++){
            a.add(a.get(a.size()-1)+a.get(a.size()-2));
            System.out.println(a);
        }
    }
    
}
