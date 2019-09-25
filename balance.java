import java.util.Scanner;



public class balance {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 0;
        String text = "";
        int result;
        while(balance < 0) {
            text = "Your balance: \u0024" + balance + ".";
            text += "\nAmount to withdraw:";



            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            balance = balance - amount;


        }

        text = "Your balance is empty!";
        text += "\nIt is now \u0024" + balance + ".";
        System.out.println(text);
    }

}
