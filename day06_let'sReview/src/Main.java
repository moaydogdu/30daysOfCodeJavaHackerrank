import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); //Number of test cases.
        String input="";
        String inputEvens="";
        String inputOdds="";
        scanner.nextLine();//Because of scanner bug.
        for (int i = 0; i<t;i++){
            input = scanner.nextLine();
            for (int j = 0; j<input.length();j++)
            {
                if(j%2==0){
                    //That means even numbers, even-indexed characters.
                    inputEvens+=input.charAt(j);
                }
                else{
                    //That means odd numbers, odd-indexed characters.
                    inputOdds+=input.charAt(j);
                }
            }
            System.out.println(inputEvens+" "+inputOdds);
            inputEvens="";//Reset inputEvens char array
            inputOdds="";//Reset inputOdds char array
        }
    }
}
