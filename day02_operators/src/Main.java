import java.util.Scanner;

public class Main {

    /**Task
     * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
     * and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
     * Round the result to the nearest integer.
     */

    /**Example
     * meal_cost = 100
     * tip_percent = 15
     * tax_percent = 8
     *
     * CalculateTip = 100*0.15 = 15
     * CalculateTax = 100*0.08 = 8
     * TotalCost = meal_cost(100) + tip(15) + tax(8) = 123
     */

    /**Input & Output
     * There are  lines of numeric input:
     * The first line has a double,  (the cost of the meal before tax and tip).
     * The second line has an integer,  (the percentage of  being added as tip).
     * The third line has an integer,  (the percentage of  being added as tax).
     *
     * Sample Input
     * -----
     * 100.00
     * 15
     * 8
     * -----
     *
     * Sample Output
     * -----
     * 123
     * -----
     */

    /**Calculate Function
     * Calculates total cost of meal and rounded to nearest integer.
     * This function has no return type. Prints the results to console.
     *
     *
     *
     * @param meal_cost (meal price)
     * @param tip_percent (tip percentage)
     * @param tax_percent (tax percentage)
     */
    public static void Calculate(double meal_cost, int tip_percent, int tax_percent){
        double total_cost=meal_cost;

        //Calculate tip and add to total_cost
        total_cost+= ((meal_cost*tip_percent)/100);

        //Calculate tax and add to total_cost
        total_cost+= ((meal_cost*tax_percent)/100);

        //This function hasn't return, so print total cost.
        System.out.println(Math.round(total_cost));

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        Calculate(meal_cost,tip_percent,tax_percent);




    }
}
