public class Main {
//    Write a method named isPerfectNumber with one parameter of type int named number.
//    If number is < 1, the method should return false.
//    The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public  static  boolean isPerfectNumber(int number) {
        int factorSum = 0;
        if (number < 1) {
            return false;
        }else {
            for (int iter = 1; iter < number; iter++) {
                if ( number % iter == 0) {
                    factorSum += iter;
                }
            }
            return factorSum == number;
        }
    }
}
