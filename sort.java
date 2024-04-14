public class sort {
    public static void main(String[] args) {
        AutoSort as = new AutoSort();
        as.add(2);
        as.add(4);
        as.add(3);
        as.add(29);
        as.add(5);
        as.add(10);
        as.add(17);
        as.add(3);
        as.a[2]--;
        as.check();
        as.a[2]++;
        as.a[2]++;
        as.display();
    }
}
