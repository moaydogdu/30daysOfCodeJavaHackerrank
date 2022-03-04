import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); //Defines number of test cases.
        Person person;

        for (int i = 1; i<=testCases;i++){
            person = new Person(scanner.nextInt());
            person.amIOld();
            person.yearPasses();
            person.amIOld();
            System.out.println();
        }
    }

    static class Person {
        int age;

        /**Constructor method of Person class.
         *
         * @param initialAge
         */
        public Person(int initialAge){
            //Constructor with parameters.

            //Checking initialAge parameter
            if(initialAge<0){
                //That means initialAge parameter is negative.

                /**Task :  The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative;
                 *  if a negative argument is passed as initialAge, the constructor should set age to 0 and
                 * print "Age is not valid, setting age to 0.."
                 */

                System.out.print("Age is not valid, setting age to 0.\n");
                age=0;
            }
            else{
                //That means age is not negative. So lets assign initialAge to age variable.
                age=initialAge;
            }
        }

        /**yearPasses method increases the age instance variable by 1.
         *
         */
        public void yearPasses(){

            ageUp();
            ageUp();
            ageUp();
        }

        public void amIOld(){
            //This method perform the following conditional statements.
            //1-  if age < 13 then prints "You are young.."
            //2- if age>= 13 and age <18 then prints "You are teenager.."
            //Otherwise prints "You are old.."

            if(age<13){
                System.out.println("You are young.");
            }
            else if(age>=13 && age<18){
                System.out.println("You are a teenager.");
            }
            else{
                System.out.println("You are old.");
            }
        }

        private void ageUp(){
            if (age>=0){
                age++;
            }
        }
    }
}
