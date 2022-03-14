import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Result.factorial(scanner.nextInt()));
        scanner.close();
    }
}

class Result{
    /**Factorial with recursion.
     *
     * @param n is n!
     * @return
     */
    public static int factorial(int n){

        int result=1;
        if(n==1||n==0){
            return result;
        }
        else
        {
            result*=n;
            return result*=factorial(n-1);
        }
    }

}


