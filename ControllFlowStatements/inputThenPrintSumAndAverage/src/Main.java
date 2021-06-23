import java.util.Scanner;

public class Main {
//    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//    The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//    When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//    XX represents the sum of all entered numbers of type int.
//    YY represents the calculated average of all numbers of type long.

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        int counter=0;
        int SUM=0;
        long AVG=0;

        while (true){
            System.out.println("Podaj "+(counter+1)+" liczbę");
            if (scanner.hasNextInt()){
                SUM+=scanner.nextInt();
                AVG=Math.round(SUM/(counter+1));
                counter++;
            }else{
                break;
            }

        }
        System.out.println("SUM = "+ SUM +" AVG = "+ AVG );
        scanner.close();
    }
}
