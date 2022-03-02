import java.util.Scanner;

public class Main {
    
    /**Task
     * Given an integer, n, perform the following conditional actions:
     *-If  is odd, print Weird
     *-If  is even and in the inclusive range of 2 to 5, print Not Weird
     *-If  is even and in the inclusive range of 6 to 20, print Weird
     *-If  is even and greater than 20, print Not Weird
     *
     * Complete the stub code provided in your editor to print whether is weird.
     *
     */

    //Constraints 1<=n<=100

    /**Input & Output
     *A single line containing a positive integer, n.
     * Sample Input
     * -----
     * 3
     * -----
     *
     * Sample Output
     * -----
     * Weird
     * -----
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //1<=n<=1001

        if(n%2==0){
            //That means n is even number.
            if(n>=2 && n<=5){
                //That means n is a even number and in the range of 2 to 5.
                //Print "Not Weird"
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20){
                //That means n is a even number and in the range of 6 to 20.
                System.out.println("Weird");
            }
            else{
                //n cannot be odd number because of first condition
                //So it cannot be 1
                //So it has to be in the range of 22 to 100
                //That means n is greater than 20
                System.out.println("Not Weird");
            }

        }
        else{
            //n is a odd number.
            System.out.println("Weird");
        }
    }
}
