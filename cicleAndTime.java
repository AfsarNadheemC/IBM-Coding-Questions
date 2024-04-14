public class cicleAndTime {
    public static void main(String[] args) {
        int distance = 10000;
        int speed = 5;
        int seconds = distance/speed;
        int total = 0;
        String [] time = {"05:45","04:54","10:40","09:45"};
        for (String j:time){
            int t=0,c=0,b=0;
            for (int i=0;i<j.length();i++){
                if (j.charAt(i)==':'){
                    t+=c*60;
                    c=0;
                }
                else{
                    c*=10;
                    b=(int)j.charAt(i)-48;
                    c+=b;
                }
            }
            t+=c;
            total+=t;
        }
        System.out.println(seconds-total);
    }
    
}
