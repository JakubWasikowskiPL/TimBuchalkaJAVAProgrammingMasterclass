import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntVelue=10;
        int anotherIntValue=myIntVelue;

        System.out.println("myIntVelue = "+myIntVelue);
        System.out.println("anotherIntVelue = "+anotherIntValue);
        anotherIntValue++;
        System.out.println("myIntVelue = "+myIntVelue);
        System.out.println("anotherIntVelue = "+anotherIntValue);

        int []myIntArray=new int[5];
        int []anotherArray=myIntArray;//refrenced to the same array myIntArray

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+ Arrays.toString(anotherArray));

        anotherArray[0]=1;
        System.out.println("after change myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = "+ Arrays.toString(anotherArray));

        anotherArray=new int[]{4,5,6,7,8}; //dereferencing array
        modifyArray(myIntArray);
        System.out.println("after change myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = "+ Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[]array){
        array[0]=2;
        array=new int[]{1,2,3,4,5};
    }
}
