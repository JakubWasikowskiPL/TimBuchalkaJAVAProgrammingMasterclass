public class Main {
//    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//    The method should return the greatest common divisor of the two numbers (int).
//    The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber){
        if(firstNumber<10||secondNumber<10){
            return -1;
        }else{
           int smallerValue=Math.min(firstNumber,secondNumber);
           for(int commonDivisor=smallerValue;commonDivisor>0;commonDivisor--){
               if(firstNumber % commonDivisor ==0 && secondNumber%commonDivisor==0){
                   return commonDivisor;
               }
           }
        }
        return -1;
    }
}
