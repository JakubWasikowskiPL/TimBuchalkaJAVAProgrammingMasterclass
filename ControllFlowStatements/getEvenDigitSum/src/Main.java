public class Main {
//    Write a method named getEvenDigitSum with one parameter of type int called number.
//    The method should return the sum of the even digits within the number.
//    If the number is negative, the method should return -1 to indicate an invalid value.

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if(number>=0){
           int sumOfTheDigits=0;
           while (number>0){
               if((number%10)%2==0){
               sumOfTheDigits+=number%10;
               }
               number/=10;
           }
           return sumOfTheDigits;
        }else {
            return -1;
        }
    }
}
