public class sa4 {

    public static void main(String[] args) {
        sumDigits(1223);


    }
        public static int sumDigits(int number){
            int sum = 0;
        if (number <0){
            System.out.println(-1);
            return -1;

        }else {
            while (number>0){
                sum += number % 10;
                number = number/10;

            }

        }
        System.out.println(sum);
        return sum;





    }
}
