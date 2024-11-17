import java.util.Scanner;

public class IT24104190Lab3Q3 {
    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);

      
        System.out.print("Enter the Rupee amount: ");
        int amount = ob1.nextInt();

        System.out.println("");
        int[] amount_of_notes = {5000, 1000, 500, 200, 100, 50, 20, 10, 05, 02, 01};

        
        for (int amount_of_note : amount_of_notes) {
            int count = amount / amount_of_note; 
            System.out.println(amount_of_note + " Notes - " + count);
            amount %= amount_of_note;
        }

        ob1.close();
    }
}