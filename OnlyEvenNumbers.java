public class sa3 {

    public static void main(String[] args) {
        int x = 4;
        int y = 20;
        int ileeven = 0;
        int wszystkie = 0;

        while (x <= y) {
            x++;

            if (!isEvennumber(x)) {
                wszystkie++;
                continue;
            }
            System.out.println("Even number " + x);
            ileeven++;

            if (ileeven >= 5) {
                break;
            }
        }
        System.out.println("Total odd numbers found = " + wszystkie);
        System.out.println("Total even numbers found = " + ileeven);
    }

    public static boolean isEvennumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
