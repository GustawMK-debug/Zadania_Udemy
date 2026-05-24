public class sa6 {
    static void main() {
        sumFirstAndLastDigit(5241);
    }
    public static int sumFirstAndLastDigit(int number){
        int suma = 0;
        int last = number % 10;
        if (number < 0){
            return -1;
        }

        while (number >= 10){
            number = number / 10;
        }
        int first = number;
        suma = last+ first;
        System.out.println(suma);
        return suma;
    }

}
