public class hasSharedDigit {
    static void main() {
        hasSharedDigit(34,11);
    }
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }

        int xLeft = x / 10;
        int xRight = x % 10;

        int yLeft = y / 10;
        int yRight = y % 10;

        if (xLeft == yLeft || xLeft == yRight || xRight == yLeft || xRight == yRight) {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }
}
