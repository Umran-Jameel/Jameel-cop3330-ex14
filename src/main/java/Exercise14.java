import java.util.*;

public class Exercise14 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String am = in.nextLine();
        double amount = Double.parseDouble(am);

        System.out.print("What is the state? ");
        String state = in.nextLine();

        if (state.equals("WI"))
        {
            System.out.printf("The subtotal is $%.2f.\nThe tax is $0.55.\nThe total is $%.2f.", amount, amount + 0.55);
            return;
        }

        System.out.printf("The total is $%.2f.", amount);

    }
}
