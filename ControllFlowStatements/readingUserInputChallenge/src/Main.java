import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int loopCouner=0;
        int numberSum=0;
        Scanner scanner=new Scanner(System.in);
        while(loopCouner<10){
            System.out.println("Enter number #"+(loopCouner+1)+": ");


            if(scanner.hasNextInt()) {
                numberSum+=scanner.nextInt();
                loopCouner++;

            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();//handle end of line(enter key), after else to remove invalid content which can cause endless loop and printing of Invalid Number
        }
        scanner.close();
        System.out.println("Sum of the numbers= "+numberSum);
    }
}
