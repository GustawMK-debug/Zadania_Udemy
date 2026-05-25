public class getGreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 1;
        int limit = 0;
        if (first < second) {
            limit = first;
        } else {
            limit = second;
        }

        for (int i = 1; i <= limit; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}