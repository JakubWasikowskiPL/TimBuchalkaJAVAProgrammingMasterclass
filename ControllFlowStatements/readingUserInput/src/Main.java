import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner =new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt=scaner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth=scaner.nextInt();
            scaner.nextLine();//handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name=scaner.nextLine(); //read new input
            int age =2021-yearOfBirth;

            if (age>=0&&age<=100){
                System.out.println("Your name is "+name+" and you are "+age+" years old");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse year of birth.");
        }
        scaner.close(); //
    }
}
