import java.util.Date;
import java.util.Scanner;

public class Transaction {
    private int amount;
    Validator validator;
    PreviousTXN previousTXN;


    public Transaction() {
        validator = new Validator();
        previousTXN = new PreviousTXN();

    }

    public void makeTransaction(User user, String action) {

        previousTXN = howMuchToMove(action, user.getBalance());
        user.setBalance(updatedBalance(user.getBalance(), action));
        //previousTXN.transactionList.add(previousTXN);
        //return amount;
    }




    private PreviousTXN howMuchToMove(String action, int currentBal) {
        System.out.println("How much would you like to " + action + " today?");
        if (action.equalsIgnoreCase("deposit")) {
            amount = validator.amountToDeposit();
        } else
            amount = validator.amountToWithdraw(currentBal);

        previousTXN.addToTransactionList(amount,action);
        PreviousTXN newTXN = new PreviousTXN(amount, action);

        return newTXN;
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
