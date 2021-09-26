import java.util.Scanner;

public class Transaction {
    int amount;
    Validator validator;

    public Transaction() {
        validator = new Validator();
        //PreviousTXN should be here OR Transaction should be in PreviousTXN
    }

    public void makeTransaction(User user, String action) {
        howMuchToMove(action, user.getBalance());
        user.setBalance(updatedBalance(user.getBalance(), action));
        //return amount;
    }

    private void howMuchToMove(String action, int currentBal) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to " + action + " today?");
        if (action.equalsIgnoreCase("deposit")) {
            amount = validator.amountToDeposit();
        } else
            amount = validator.amountToWithdraw(currentBal);

        //return amount;
    }


    private int updatedBalance(int currentBalance, String action) {
        int updatedBal = 0;
        if (action.equalsIgnoreCase("deposit")) {
            updatedBal = currentBalance + amount;
        } else
            updatedBal = currentBalance - amount;
        System.out.println("Your balance is now " + updatedBal);
        return updatedBal;
    }


}
