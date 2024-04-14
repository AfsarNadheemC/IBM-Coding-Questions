public class parkCement {
    public static void main(String[] args) {
        int lRat = 3;
        int wRat = 2;
        int Per = 240;
        int pWidth = 3;
        int cost = 120;

        // ans = L1*W1 - L2*W2;

        int x = Per / (2*(lRat+wRat));
        int L1 = lRat*x;
        int W1 = wRat*x;
        int L2 = L1 - 2*pWidth;
        int W2 = W1 - 2*pWidth;

        int Amount = ((L1*W1) - (L2*W2))*cost;
        System.out.println(Amount);
    }
    
}
