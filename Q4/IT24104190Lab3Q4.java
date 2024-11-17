import java.util.Scanner;

public class IT24104190Lab3Q4{
   public static void main(String[] args){

      Scanner obj_1 = new Scanner(System.in);

System.out.print("Enter a five-digit number: ");
int five_dig_no = obj_1.nextInt();

if (five_dig_no < 10000 || five_dig_no > 99999) {
   System.out.println("Warning:- please enter the 5 digit number!");

}
else {

while(five_dig_no > 0) {

int digit = five_dig_no / 10000;
System.out.print(digit + " ");
five_dig_no %= 10000;
five_dig_no *= 10;

}
System.out.println();
}

obj_1.close();

}
}