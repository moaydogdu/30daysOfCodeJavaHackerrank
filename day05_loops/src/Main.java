import java.util.Scanner;
public class Main {

    /**Task : Given an integer n, prints its 10 multiples.
     *Each multiple n x i(where 1<=i<=10) should be printed on a new line in the form : n x i = result.
     */

    /**Input format : A single integer n.
     * Constraints : 2<=n<=20
     *
     */

    /**Output format : Print 10 lines of output; each line i(where 1<=i<=10)
     * contains result of nxi in the form.
     * n x i = result
     *
     */

    /** Sample Input and Output
     *
     * Input
     * -----
     * 2
     * -----
     *
     * Output
     * -----
     * 2 x 1 = 2
     * 2 x 2 = 4
     * 2 x 3 = 6
     * 2 x 4 = 8
     * . . . . .
     * 2 x 10 = 20
     * ------
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }

    }
}
