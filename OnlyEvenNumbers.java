public class sa3 {
    static void main() {
        int x = 5;
        int y = 20;
        while (x <= y){
            x++;
            if (isEvennumber(x) == false) {
                continue;
            }
            System.out.println(x);
        }

    }
    public static boolean isEvennumber(int number){
        if (number % 2 == 0){

            return true;
        }else {

            return false;
        }


    }
}
