public class cistren {
    public static void main(String[] args) {
        double pipe1 = 9;
        double pipe2 = 9;
        double eff = 0;
        if (pipe1>0)    eff+=(1/pipe1);
        if (pipe2>0)    eff+=(1/pipe2);
        double time = (1/eff);
        System.out.println(time);
    }
    
}
