package param_aus_assignments;

import java.util.Scanner;


class Employee{
    String name;
    int Skill_level;
    int worked_hours;
    float wage;

    void calculate_wage(){

        if(this.Skill_level==0 || this.worked_hours==0){
            System.out.println("skill level and hours not available to calculate wage");
        }
        if(this.worked_hours<=40 ){
            if(this.Skill_level==1) {
                this.wage = this.worked_hours*50;
            }
            else if(this.Skill_level==2) {
                this.wage = this.worked_hours*70;
            }
            else if(this.Skill_level==3) {
                this.wage = this.worked_hours*100;
            }
        }
        else{
             int overtime= this.worked_hours-40;

            if(this.Skill_level==1) {
                this.wage = 40*50 + (float)(overtime*1.5*50) ;
            }
            else if(this.Skill_level==2) {
                this.wage = 40*70 + (float)(overtime*1.5*70);
            }
            else if(this.Skill_level==3) {
                this.wage = 40*100 + (float)(overtime*1.5*100);
            }


        }
      System.out.printf("the wage of employee, %s <lavel %d> for %d hours is $%.2f",this.name,this.Skill_level,this.worked_hours,this.wage);
    }



}




public class Wage {


    Employee emp1= new Employee();
    Employee emp2= new Employee();
    Employee emp3= new Employee();
    Employee emp4= new Employee();
    Employee emp5= new Employee();
    Employee emp6= new Employee();



    public void printStasticalInformation(){

        System.out.println("Statastical information & barchart");
        System.out.println("--------------------------------------------------");
        System.out.println();

        Employee EmployeeSalarymax= findMaximumSalary(emp1,emp2,emp3,emp4,emp5,emp6);

        System.out.printf("Maximum of the salaries : %.2f (earned by) %s\n",EmployeeSalarymax.wage,EmployeeSalarymax.name);

        Employee EmployeeSalarymin= findMinimumSalary(emp1,emp2,emp3,emp4,emp5,emp6);
        System.out.printf("Manimum of the salaries :  %.2f (earned by) %s \n",EmployeeSalarymin.wage,EmployeeSalarymin.name);

        float averageSalary= findAverageSalary(emp1,emp2,emp3,emp4,emp5,emp6);
        System.out.printf("Average salary : %.2f \n",averageSalary);

        printBarChart();
         System.out.println();
         System.out.println();

        System.out.println("thank you for using employee wage recording system");
        System.out.println("program is written by : 12255129");

    }

    public void printBarChart(){

        int countLessThan10=0;
        int count10To20=0;
        int countAbove20=0;

        if(emp1.worked_hours<10){
            countLessThan10++;
        }
        else if(emp1.worked_hours>=10 && emp1.worked_hours<=20){
            count10To20++;
        }
        else if(emp1.worked_hours>20){
            countAbove20++;
        }

        if(emp2.worked_hours<10){
            countLessThan10++;
        }
        else if(emp2.worked_hours>=10 && emp2.worked_hours<=20){
            count10To20++;
        }
        else if(emp2.worked_hours>20){
            countAbove20++;
        }

        if(emp2.worked_hours<10){
            countLessThan10++;
        }
        else if(emp2.worked_hours>=10 && emp2.worked_hours<=20){
            count10To20++;
        }
        else if(emp2.worked_hours>20){
            countAbove20++;
        }


        if(emp2.worked_hours<10){
            countLessThan10++;
        }
        else if(emp2.worked_hours>=10 && emp2.worked_hours<=20){
            count10To20++;
        }
        else if(emp2.worked_hours>20){
            countAbove20++;
        }


        if(emp2.worked_hours<10){
            countLessThan10++;
        }
        else if(emp2.worked_hours>=10 && emp2.worked_hours<=20){
            count10To20++;
        }
        else if(emp2.worked_hours>20){
            countAbove20++;
        }

        if(emp2.worked_hours<10){
            countLessThan10++;
        }
        else if(emp2.worked_hours>=10 && emp2.worked_hours<=20){
            count10To20++;
        }
        else if(emp2.worked_hours>20){
            countAbove20++;
        }


        System.out.print("number of employees worked less than 10 hours : ");
          while(countLessThan10>0){
              System.out.print("*");
              countLessThan10--;
          }
        System.out.println();

        System.out.print("number of employees worked  10-20 hours: ");
        while(count10To20>0){
            System.out.print("*");
            count10To20--;
        }
        System.out.println();

        System.out.print("number of employees worked  above 20 hours: ");
        while(countAbove20>0){
            System.out.print("*");
            countAbove20--;
        }
        System.out.println();


    }


    public void takeDetails(){
        // scanner is to take input
        Scanner sc = new Scanner(System.in);
         String name;
         int skill_level;
         int Work_hours;

 //take details of employee 1
            System.out.print("enter name of employee 1 : ");
            name =  sc.nextLine();

           //name validation
           while(name.isEmpty() || name.equals(" ")){
               System.out.println("error ! name should not be blank");
               System.out.print("enter name of employee 1 : ");
                 name=  sc.nextLine();
           }
           emp1.name=name;
           name=" ";

       //take skill
            System.out.println("skill level(1,2,3) of employee ,"+emp1.name+" : ");
             skill_level=  sc.nextInt();
         //skill validation
        while(skill_level>3 || skill_level<1) {
            System.out.println("error ! ");
            System.out.println("skill level(1,2,3) of employee "+emp1.name+" : ");
            skill_level=  sc.nextInt();
        }
        emp1.Skill_level=skill_level;

       //take hours
        System.out.println("enter work hours of employee ,"+emp1.name+" : ");
        emp1.worked_hours =  sc.nextInt();

       emp1.calculate_wage();
        System.out.println();



//take details of employee 2
        System.out.print("enter name of employee 2 : ");
        name =  sc.nextLine();

        //name validation
        while(name.isEmpty() || name.equals(" ")){
            System.out.println("error ! name should not be blank");
            System.out.print("enter name of employee 2 : ");
            name=  sc.nextLine();
        }
        emp2.name=name;
        name=null;

    //take skill
        System.out.println("skill level(1,2,3) of employee ,"+emp2.name+" : ");
        skill_level=  sc.nextInt();
        //skill validation
        while(skill_level>3 || skill_level<1) {
            System.out.println("error ! ");
            System.out.println("skill level(1,2,3) of employee "+emp2.name+" : ");
            skill_level=  sc.nextInt();
        }
        emp2.Skill_level=skill_level;

        //take hours
        System.out.println("enter work hours of employee ,"+emp2.name+" : ");
        emp2.worked_hours =  sc.nextInt();

        emp2.calculate_wage();

//take details of employee 3
        System.out.print("enter name of employee 3 : ");
        name =  sc.nextLine();

        //name validation
        while(name.isEmpty() || name.equals(" ")){
            System.out.println("error ! name should not be blank");
            System.out.print("enter name of employee 3 : ");
            name=  sc.next();
        }
        emp3.name=name;
        name=null;

        //take skill
        System.out.println("skill level(1,2,3) of employee ,"+emp3.name+" : ");
        skill_level=  sc.nextInt();
        //skill validation
        while(skill_level>3 || skill_level<1) {
            System.out.println("error ! ");
            System.out.println("skill level(1,2,3) of employee "+emp3.name+" : ");
            skill_level=  sc.nextInt();
        }
        emp3.Skill_level=skill_level;

        //take hours
        System.out.println("enter work hours of employee ,"+emp3.name+" : ");
        emp3.worked_hours =  sc.nextInt();

        emp3.calculate_wage();



        //take name of employee 4
        System.out.print("enter name of employee 4 : ");
        name =  sc.nextLine();

        //name validation
        while(name.isEmpty() || name.equals(" ")){
            System.out.println("error ! name should not be blank");
            System.out.print("enter name of employee 4 : ");
            name=  sc.next();
        }
        emp4.name=name;
        name=null;

        //take skill
        System.out.println("skill level(1,2,3) of employee ,"+emp4.name+" : ");
        skill_level=  sc.nextInt();
        //skill validation
        while(skill_level>3 || skill_level<1) {
            System.out.println("error ! ");
            System.out.println("skill level(1,2,3) of employee "+emp4.name+" : ");
            skill_level=  sc.nextInt();
        }
        emp4.Skill_level=skill_level;

        //take hours
        System.out.println("enter work hours of employee ,"+emp4.name+" : ");
        emp4.worked_hours =  sc.nextInt();

        emp4.calculate_wage();




 //take details of employee 5
        System.out.print("enter name of employee 5 : ");
        name =  sc.nextLine();

        //name validation
        while(name.isEmpty() || name.equals(" ")){
            System.out.println("error ! name should not be blank");
            System.out.print("enter name of employee 5 : ");
            name=  sc.next();
        }
        emp5.name=name;
        name=null;

        //take skill
        System.out.println("skill level(1,2,3) of employee ,"+emp5.name+" : ");
        skill_level=  sc.nextInt();
        //skill validation
        while(skill_level>3 || skill_level<1) {
            System.out.println("error ! ");
            System.out.println("skill level(1,2,3) of employee "+emp5.name+" : ");
            skill_level=  sc.nextInt();
        }
        emp5.Skill_level=skill_level;

        //take hours
        System.out.println("enter work hours of employee ,"+emp5.name+" : ");
        emp5.worked_hours =  sc.nextInt();

        emp5.calculate_wage();



 //take details of employee 6
        System.out.print("enter name of employee 6 : ");
        name =  sc.nextLine();

        //name validation
        while(name.isEmpty() || name.equals(" ")){
            System.out.println("error ! name should not be blank");
            System.out.print("enter name of employee 6 : ");
            name=  sc.next();
        }
        emp6.name=name;
        name=null;


        //take skill
        System.out.println("skill level(1,2,3) of employee ,"+emp6.name+" : ");
        skill_level=  sc.nextInt();
        //skill validation
        while(skill_level>3 || skill_level<1) {
            System.out.println("error ! ");
            System.out.println("skill level(1,2,3) of employee "+emp6.name+" : ");
            skill_level=  sc.nextInt();
        }
        emp6.Skill_level=skill_level;

        //take hours
        System.out.println("enter work hours of employee ,"+emp6.name+" : ");
        emp6.worked_hours =  sc.nextInt();

        emp6.calculate_wage();
        }


    Employee findMaximumSalary(Employee emp1,Employee emp2,Employee emp3,Employee emp4,Employee emp5,Employee emp6){

        Employee max=null;

        if(emp1.wage>=emp2.wage && emp1.wage>=emp3.wage && emp1.wage>=emp4.wage && emp1.wage>=emp5.wage && emp1.wage>=emp6.wage){
            max= emp1;
        }
        else if(emp2.wage>=emp1.wage && emp2.wage>=emp3.wage && emp2.wage>=emp4.wage && emp2.wage>=emp5.wage && emp2.wage>=emp6.wage){
            max=emp2;
        }
        else if(emp3.wage>=emp1.wage && emp3.wage>=emp2.wage && emp3.wage>=emp4.wage && emp3.wage>=emp5.wage && emp3.wage>=emp6.wage){
            max=emp3;
        }
        else if(emp4.wage>=emp1.wage && emp4.wage>=emp2.wage && emp4.wage>=emp3.wage && emp4.wage>=emp5.wage && emp4.wage>=emp6.wage){
            max=emp4;
        }
        else if(emp5.wage>=emp1.wage && emp5.wage>=emp2.wage && emp5.wage>=emp3.wage && emp5.wage>=emp4.wage && emp5.wage>=emp6.wage){
            max=emp5;
        }
        else if(emp6.wage>=emp1.wage && emp6.wage>=emp2.wage && emp6.wage>=emp3.wage && emp6.wage>=emp4.wage && emp6.wage>=emp5.wage){
            max=emp6;
        }

        return max;
    }

    Employee findMinimumSalary(Employee emp1,Employee emp2,Employee emp3,Employee emp4,Employee emp5,Employee emp6){

        Employee min=null;

        if(emp1.wage<=emp2.wage && emp1.wage<=emp3.wage && emp1.wage<=emp4.wage && emp1.wage<=emp5.wage && emp1.wage<=emp6.wage){
            min= emp1;
        }
        else if(emp2.wage<=emp1.wage && emp2.wage<=emp3.wage && emp2.wage<=emp4.wage && emp2.wage<=emp5.wage && emp2.wage<=emp6.wage){
            min=emp2;
        }
        else if(emp3.wage<=emp1.wage && emp3.wage<=emp2.wage && emp3.wage<=emp4.wage && emp3.wage<=emp5.wage && emp3.wage<=emp6.wage){
            min=emp3;
        }
        else if(emp4.wage<=emp1.wage && emp4.wage<=emp2.wage && emp4.wage<=emp3.wage && emp4.wage<=emp5.wage && emp4.wage<=emp6.wage){
            min=emp4;
        }
        else if(emp5.wage<=emp1.wage && emp5.wage<=emp2.wage && emp5.wage<=emp3.wage && emp5.wage<=emp4.wage && emp5.wage<=emp6.wage){
            min=emp5;
        }
        else if(emp6.wage<=emp1.wage && emp6.wage<=emp2.wage && emp6.wage<=emp3.wage && emp6.wage<=emp4.wage && emp6.wage<=emp5.wage){
            min=emp6;
        }

        return min;
    }

    float findAverageSalary(Employee emp1,Employee emp2,Employee emp3,Employee emp4,Employee emp5,Employee emp6){
       float average= (float)((emp1.wage+emp2.wage+emp3.wage+emp4.wage+emp5.wage+emp6.wage)/6);
        return average;
    }




    }
