package param_aus_assignments;


/*
      Display a welcome message at the beginning “Welcome to m2ES Employee Wage Recording System”
      and an exit message such as “Thank you for using the Employee Wage Recording System” and the
      final line “Program written by <your student ID>”

    -> allow a user to enter the details of N employees including their
       ->names,
       ->skill levels (which is defined as level 1, 2 and 3), and
       ->the number of hours they work in a week.
       ->N should be equal to the highest digit in your student ID

    -> It will then display the salary that the employee should receive (see sample output
        at Appendix II for formatting details).

    ->The standard rates of wage depend on the skill levels, which are set
       level 1-> 50
       level 2-> 70
       level 3-> 100
    -> while the employee will be paid at one and one-half times the usual rate for any hours over 40

    -> validation an employee name is not blank
    ->validation skill level must be 1 or 2, or 3.
    ->All dollar values will be formatted to two decimal places (see output screeshot)
    ->Show a data set in a tabular format

    6. Show relevant statistical information after N employees
        a. heading for the statistics “Statistical Information and Bar Chart”
        b. the minimum and maximum salary with the corresponding names of the employees
        c. the average salary
        d. a simple bar chart indicating the number of employees working in a specific time length interval
           of hours worked such as hours worked less than 10, hours worked 10-20, and hours worked
           above than 20.

 Note: if more than one employee has an equal maximum or minimum salary, you just need to only output
       one of the employees’ names.


 */


import java.util.Scanner;




public class Assignment1_WorkerWage {

    public static void main(String[] args) {


        System.out.println("Welcome to m2ES Employee Wage Recording System");
        System.out.println("my id is 6xyz , 6 is the highest digit");

        System.out.println("6 employees details will be captured below");
        System.out.println();

        Wage w= new Wage();

        w.takeDetails();
        w.printStasticalInformation();





    }




}
