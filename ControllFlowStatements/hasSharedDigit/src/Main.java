public class Main {
//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(11,23));
    }
    public static boolean hasSharedDigit(int firstNumber,int secondNumber){
        String firstString=Integer.toString(firstNumber);
        String secondString=Integer.toString(secondNumber);
        if(firstNumber>10&&secondNumber>=10&&firstNumber<=99&&secondNumber<=99) {
            for (char firstChar : firstString.toCharArray()) {
                for (char secondChar : secondString.toCharArray()) {
                    if (firstChar == secondChar) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

}
