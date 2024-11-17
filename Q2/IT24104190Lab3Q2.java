import java.util.Scanner;

public class IT24104190Lab3Q2{
   public static void main(String[] args){ 

      Scanner obj_1 = new Scanner(System.in);

System.out.print("Enter the monthly salary : ");
double monthly_salary = obj_1.nextDouble();

System.out.print("Enter the number of OT hours : ");
double ot_hours = obj_1.nextDouble();

System.out.print("Enter the OT hourly rate : ");
double ot_hour_rate = obj_1.nextDouble();

double ot_amount = ot_hours * ot_hour_rate;
double total_salary = monthly_salary + ot_amount;

System.out.println("The total salary including OT is : " + total_salary);  





}

}