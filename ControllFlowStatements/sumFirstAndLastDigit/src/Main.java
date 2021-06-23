public class Main {
//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//    The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
//    If the number is negative then the method needs to return -1 to indicate an invalid value.

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));
    }
    public static int sumFirstAndLastDigit(int number){

        if(number>=0){
            int firstDigit=0;
            int lastDigit;
            if(number<10){
                return 2*number;
            }else{
                lastDigit=number%10;
                while(number>=10){
                    number=number/10;
                    firstDigit=number;
                }

                return firstDigit+lastDigit;
            }

        }else{
            return -1;
        }
    }
}
