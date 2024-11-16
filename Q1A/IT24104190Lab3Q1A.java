import java.util.Scanner;

public class IT24104190Lab3Q1A{
    public static void main (String[] args){

Scanner first = new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice : ");
double price_1kg = first.nextDouble();

System.out.print("Kilograms you want to buy : ");
double kg_you_want = first.nextDouble();


double payment = price_1kg*kg_you_want;
System.out.println("How much need to pay(LKR) : "+payment);

    }

}