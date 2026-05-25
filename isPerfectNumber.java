public class isPerfectNumber {
    static void main() {
        isPerfectNumber(5);
    }
    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i< number;i++){
            if (number%i ==0){
                sum = sum +i;
            }
        }
        if (sum == number){
            System.out.println("TRUE");
            return true;

        }else {
            System.out.println("FALSE");
            return false;
        }
    }
}
