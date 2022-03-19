import java.util.Scanner;

/**
 * This is a base(super) class of Student class.
 *
 */
class Person {

    //Attribute Fields.
    private String firstName;
    private String lastName;

    public Person(String _firstName, String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
    }


}

/**
 * This is a sub(derived) class of Person Class.
 */
class Student extends Person {

    private int idNumber;
    private int[] scores;


    public Student(String _firstName, String _lastName, int _idNumber, int[] _scores) {
        super(_firstName, _lastName);
        this.idNumber = _idNumber;
        this.scores = _scores;
        System.out.println("Name: "+_lastName+", "+_firstName);
        System.out.println("ID: "+idNumber);
        System.out.println("Grade: "+calculate());
    }

    public char calculate(){

        int average=0;

        for (int score:
                scores) {
            average+=score;
        }

        average= average/scores.length;
        char grade=' ';
        if(average>=0 && average<=100){

            if(average>=90){
                grade='O';
            }
            else if(average>=80){
                grade='E';
            }
            else if(average>=70){
                grade='A';
            }
            else if(average>=55){
                grade='P';
            }
            else if(average>=40){
                grade='D';
            }
            else grade='T';

        }




        return grade;
    }


}


public class Solution {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();
        int numberOfScores=scanner.nextInt();
        int[] scores = new int[numberOfScores];

        for (int i = 0;i<numberOfScores;i++){
            scores[i] = scanner.nextInt();
        }

        Student student = new Student(firstName,lastName,idNumber,scores);




    }
}
