public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }
    public static boolean hasSameLastDigit(int firstNumber,int secondNumber,int thirdNumber){
        if(isValid(firstNumber)&&isValid(secondNumber)&&isValid(thirdNumber)){
            int firstNumLastDigit=firstNumber%10;
            int secondNumLastDigit=secondNumber%10;
            int thirdNumLastDigit=thirdNumber%10;

            if(firstNumLastDigit==secondNumLastDigit||firstNumLastDigit==thirdNumLastDigit||secondNumLastDigit==thirdNumLastDigit){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }

    }
    public static boolean isValid(int numberToCheck){
        if(numberToCheck>=10&&numberToCheck<=1000){
            return true;
        }else{
            return false;
        }
    }
}
