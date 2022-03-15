import java.util.Scanner;

public class Main {

    /**
     * This method is reversed given string.
     * @param string
     * @return reversedString
     */
    public static String stringReverse(String string){
        String reversedString = "";
        for(int i = string.length()-1; i>=0;i--){
            reversedString+=string.charAt(i);
        }
        return reversedString;
    }

    /**
     * If you give a base-10 number as a n, this method will be return reverse of base-2 number as a String.
     * @param n Represent base-10 integer number.
     * @return String reversed binary.
     */
    public static String convertBinary(int n){

        //Attribute field.
        int remainder;
        String binary="";

        if(n>=2){
            //Then divide.
            remainder = n%2;
            binary+=remainder;
            n = n-remainder;
            n = n/2;
            if(n!=0){
                binary+=convertBinary(n);
            }
        }
        else{
            //That means we have 0 or 1 as n.
            binary+=n;

        }
        return binary;

    }

    /**
     * This method finds maximum consecutive number in given binary(base-2 as a String type)
     * @param binary Represents your binary.
     * @return Maximum consecutive number as a integer consecutive.
     */
    public static int findConsecutiveNumber(String binary){
        //Attribute field
        int consecutive = 0;
        int consecutiveCounter=0;

        //Find maximum consecutive
        for (int i = 0;i<binary.length();i++){
            if (binary.charAt(i)=='1'){
                //That means we have 1.
                consecutiveCounter++;
                if(consecutiveCounter>consecutive){
                    consecutive = consecutiveCounter;
                }
            }
            else
            {
                //That means we have 0.
                consecutiveCounter=0;
            }
        }
        return consecutive;

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binary = stringReverse(convertBinary(number));
        //System.out.println(binary); //Shows binary.
        System.out.println(findConsecutiveNumber(binary));


    }
}
