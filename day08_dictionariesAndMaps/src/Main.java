import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<=numberOfEntries;i++){
            String name = scanner.next();
            int number = scanner.nextInt();
            phoneBook.put(name, number);
            scanner.nextLine();
        }

        //System.out.println(phoneBook);

        while(scanner.hasNext()){
           String name = scanner.nextLine();
           boolean result =  phoneBook.containsKey(name);
           if (result==true)
           {
               System.out.print(name+"="+phoneBook.get(name)+"\n");
           }
           else
               System.out.println("Not found");
        }
        scanner.close();


    }
}
