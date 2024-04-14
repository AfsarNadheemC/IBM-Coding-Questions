import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int target = 60;
        
        System.out.println(Arrays.toString(twoSum(nums, target)));
        
    }

    static int [] twoSum (int [] a,int t){
        int x []= {-1,-1};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==t) {
                    x[0]=i;
                    x[1]=j;
                    return x;
                }
            }
        }
        return x;
    }
    
}
