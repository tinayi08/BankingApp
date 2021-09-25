import java.util.Scanner;

public class Deposit {
    int deposit;

    public int makeDeposit() {
        //TODO - Add Try/Catch
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

    public boolean anotherDeposit() {
        //TODO - Add Try/Catch
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to make another deposit?");
        System.out.println("Enter 1 for Yes and 2 for No");
        int answer = scan.nextInt();
        if (answer == 1) {
            return true;
        } else
            return false;

    }
}
