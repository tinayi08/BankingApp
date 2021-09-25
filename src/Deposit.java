import java.util.Scanner;

public class Deposit {
    int deposit;

    public void userSelectedDeposit(User user) {
        do {
            makeDeposit();
            user.setBalance(updatedBalance(user.getBalance()));
        } while (anotherDeposit());
    }

    private int makeDeposit() {
        //TODO - Add Try/Catch
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to deposit today?");
        deposit = scan.nextInt();

        return deposit;
    }

    private int updatedBalance(int currentBalance) {
        int updatedBal = currentBalance + deposit;
        System.out.println("Your balance is now " + updatedBal);
        return updatedBal;
    }

    private boolean anotherDeposit() {
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
