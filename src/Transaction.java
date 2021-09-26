import java.util.Scanner;

public class Transaction {
    int amount;
    Validator validator;

    public Transaction() {
        validator = new Validator();
    }

    public void makeTransaction(User user, String action) {
        howMuchToMove(action);
        //howMuchToDeposit();
        user.setBalance(updatedBalance(user.getBalance(), action));
    }

    private int howMuchToMove(String action) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to " + action + " today?");
        //TODO - Try to make this better
        amount = validator.amountToMove();
        //amount = new Validator().deposit();
        return amount;
    }
//    private void howMuchToDeposit() {
//        System.out.println("How much would you like to deposit today?");
//    }

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
