public class operators {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        boolean a = true;
        boolean b = false;
        if (y > x && a == b) {
            System.out.println(y);
        } else if (x == y || a != b) {
            System.out.println("EQUAL");
        } else {
            System.out.println(x);
        }
    }
}