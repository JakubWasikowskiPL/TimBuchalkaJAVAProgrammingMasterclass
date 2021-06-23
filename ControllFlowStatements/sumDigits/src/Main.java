import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        sumDigitsTester(15);
    }
    public static int sumDigits(int number){

        if (number>=10){
            int sum=0;
            String numberToString=Integer.toString(number);
            char[]charArray=numberToString.toCharArray();

            for(int i:charArray){
                sum+=Character.getNumericValue(i);
            }
            return sum;

        }else{
            return -1;
        }
    }
    public static void sumDigitsTester(int number){
        System.out.println("For number "+number+", sum of digits= "+sumDigits(number));
    }
}
