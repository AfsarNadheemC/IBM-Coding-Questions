

public class fizzBuzz {
    public static void main(String[] args) {
        int a = 20;
        for (int i=1;i<=a;i++){
            if (i%5!=0&&i%3!=0) {
                System.out.println(i);
                continue;
            }
            if (i%3==0){
                System.out.print("Fizz");
            }

            if (i%5==0){
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }
    
}
