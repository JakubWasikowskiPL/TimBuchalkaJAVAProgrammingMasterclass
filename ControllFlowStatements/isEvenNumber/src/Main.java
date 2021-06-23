public class Main {
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    // Make it also record the total number of even numbers it has found
    // and break once 5 are found
    // and at the end, display the total number of even numbers found

    public static void main(String[] args) {
        evenTester(4,20);
    }

    public static boolean isEvenNumber(int number){

        while(number%2==0){
        return true;
        }

        return false;
    }

    public static void evenTester(int startNumber, int endNumber){
        int evenNumberCounter = 0;

        while(startNumber<=endNumber) {


                startNumber++;

                if (!isEvenNumber(startNumber)) {
                continue;
                }

                System.out.println("Even number" + startNumber);
                evenNumberCounter++;
                if (evenNumberCounter >= 5) {
                    System.out.println("Even numbers found: " + evenNumberCounter);
                    break;
                 }


            }

        }
    }


