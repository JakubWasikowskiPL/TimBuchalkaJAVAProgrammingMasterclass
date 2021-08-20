import java.util.Arrays;

public class Main {
//    Write a method called reverse() with an int array as a parameter.
//
//    The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//    To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//    For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
//
//    The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
//
//    and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
//
//    TIP: When swapping the elements, use a variable to temporarily hold the current element.
//
//    NOTE: The method should be defined as private static.
//
//    NOTE: Do not add a main method to the solution code.
    public static void main(String[] args) {
        int[]array={1,5,3,7,11,9};
        System.out.println("Array = "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = "+ Arrays.toString(array));

    }
    private static void reverse(int[]array){
        int maxIndex=array.length -1;
        int halfLength=(array.length)/2;
        //Optimized version, code goes half a way in comparision to the unoptimized version
        // and uses only temp int
        for (int i=0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
