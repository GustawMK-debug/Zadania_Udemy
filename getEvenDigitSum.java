public class getEvenDigitSum {
    static void main() {
        getEvenDigitSum(252);
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number<0){
            return -1;
        }
        while (number>0){
            int digit = number % 10;
            if (digit % 2 == 0){
                sum = sum + digit;
            }
            number = number/10;
        }
        System.out.println(sum);
        return sum;


    }
}
