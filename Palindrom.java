public class sa5 {
    static void main() {
        isPalindrome(1221);
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int current = number;
        while (current != 0){
            int digit  = current %10;
            reverse = reverse*10 + digit;
            current = current/10;
        }
        if (reverse == number){
            System.out.println("Palidnrom");
            return true;
        }else {
            System.out.println("Nie palindrom");
            return false;
        }
    }
}
