import java.util.Scanner;

public class Deposit {
    int deposit;

    public int makeDeposit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to deposit today?");
        deposit = scan.nextInt();

        return deposit;
    }

    public int updatedBalance(int currentBalance) {
        int updatedBal = currentBalance + deposit;
        System.out.println("Your balance is now " + updatedBal);
        return updatedBal;
    }
}
