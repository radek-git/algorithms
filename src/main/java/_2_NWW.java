public class _2_NWW {

    public static void main(String[] args) {

        int x = 30;
        int y = 98;

        System.out.println("NWW liczb " + x + " i " + y + " wynosi: " + ((x*y)/nwd(x,y)));
    }

    // najpierw oblicza się NWD
    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x =x- y;
            else
                y =y- x;
        }
        return x;
    }
}
