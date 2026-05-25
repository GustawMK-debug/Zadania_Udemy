public class numberToWords {

    public static void main(String[] args) {
        numberToWords(213);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int totalDigits = getDigitCount(number);
        int reversedNumber = reverse(number);

        for (int i = 0; i < totalDigits; i++) {
            int zam = reversedNumber % 10;
            reversedNumber = reversedNumber / 10;

            switch (zam) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }
}