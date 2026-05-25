public class hasSameLastDigit {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        }

        int newx = x % 10;
        int newy = y % 10;
        int newz = z % 10;

        if (newx == newy || newx == newz || newy == newz) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean isValid(int x){
        if ((x < 10 || x > 1000)){
            return false;
        }else {
            return true;
        }
    }
}