
public class sa1 {
    public static void main(String[] args){
        getDaysInMonth(2,2001);
}

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }else {
                return false;

        }
    }else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month >12) || (year <1 || year > 9999)){
            return -1;

        }else{
            switch (month){
                case 1:
                    System.out.println(31);
                    return 31;
                case 2:
                    if (isLeapYear(year)){
                        System.out.println(29);
                        return 29;
                    }else {
                        System.out.println(28);
                        return 28;
                    }
                case 3:
                    System.out.println(31);
                    return 31;
                case 4:
                    System.out.println(30);
                    return 30;
                case 5:
                    System.out.println(31);
                    return 31;
                case 6:
                    System.out.println(30);
                    return 30;
                case 7:
                    System.out.println(31);
                    return 31;
                case 8:
                    System.out.println(31);
                    return 31;
                case 9:
                    System.out.println(30);
                    return 30;
                case 10:
                    System.out.println(31);
                    return 31;
                case 11:
                    System.out.println(30);
                    return 30;
                case 12:
                    System.out.println(31);
                    return 31;
                default:
                    System.out.println(-1);
                    return -1;

            }
        }



    }
}
