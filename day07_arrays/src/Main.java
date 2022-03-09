import java.util.Scanner;
public class Main {

    public static void printReverseOfIntegerArray(int[] array){

        for (int i = array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }

    public static void printIntegerArray(int[] array){
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i<arraySize;i++){
            array[i] = scanner.nextInt();
        }

        //printIntegerArray(array);
        //System.out.println();
        printReverseOfIntegerArray(array);


    }
}
