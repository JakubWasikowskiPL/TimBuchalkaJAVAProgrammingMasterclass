import java.util.Random;

public class Main {
//    Write a method called isPalindrome with one int parameter called number.
//    The method needs to return a boolean.
//    It should return true if the number is a palindrome number otherwise it should return false.
//    Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//    If both are the the same then the number is a palindrome otherwise it is not.
//    Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//    Extract the last digit of the given number by performing the modulo division (remainder).
//    Store the last digit to some variable say lastDigit = num % 10.
//    Increase the place value of reverse by one.
//    To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//    Add lastDigit to reverse.
//    Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//    Repeat steps until number is not equal to (or greater than) zero.
//    A while loop would be good for this coding exercise.


    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(223));

    }
    public static boolean isPalindrome(int number){
                int reverse=0;
                int lastDigit;
                int numberStorer=number;
                while(Math.abs(number)>0){
                    lastDigit=number%10;
                    reverse=reverse*10+lastDigit;
                    number/=10;
                }

                if(numberStorer==reverse){
                    return true;
                }else{
                    return false;
                }
    }


}
