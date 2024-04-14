public class AutoSort {
    static int size = 8;
    public static int [] a= new int[8];
    static int i = 0;

    private void expand (){
        int b [] = new int [size*2];
        for (int j=0;j<i;j++)
        b[j]=a[j];
        a=b;
    }

    public void add (int x){
        a[i]=x;
        if (i>0) check(i);
        i++;
        if (i==size)   expand();
    }
    

    public void remove (int x){
        int r=0,g=0;
        for (int j=0;j<i;j++){
            if (a[j]==x)    {
                r++;
                g=j;
            }
        }
        if (r==1)   removePos(g);
        else {
            System.out.println("Invalid value");
        }
        i--;
    }

    public void removePos(int g){
            for (int j=g;j<i;j++){
                a[j]=a[j+1];
            }
            i--;

    }

    public void check (){
        for (int x=0;x<i;x++){
            if (a[x]<a[x-1])    {
                sort(x);
            }
        }
        return;
    }

    static void sort (int x){
        if (a[0]>a[x])  {
            int y = a[x];
            for (int k=x;k>0;k--){
                a[k]=a[k-1];
            }
            a[0]=y;
        }
        else {
            int k;
            for (k=0;k<x-1;k++){
                if (a[x]>=a[k]&&a[x]<=a[k+1]) break;
            }
            int y = a[x];
            for (int j=x;j>k+1;j--){
                a[j]=a[j-1];
            }
            a[k+1]=y;
        }
    }

    public void display (){
        for (int j=0;j<i;j++)
            System.out.print(a[j]+" ");
    }
}
