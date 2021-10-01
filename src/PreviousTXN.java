import java.util.ArrayList;
import java.util.Date;

public class PreviousTXN {

    private int amount;
    private String action;
    private int cBal;
    private static ArrayList <PreviousTXN> transactionList = new ArrayList<>();

    public PreviousTXN() {

    }

    public PreviousTXN(int amount, String action, int cBal) {
        this.amount = amount;
        this.action = action;
        this.cBal = cBal;
    }

    public void addToTransactionList(int amount, String action, int cBal) {
        PreviousTXN newTXN = new PreviousTXN(amount, action, cBal);

        transactionList.add(newTXN);

    }

    public void statement() {
        for (PreviousTXN t : transactionList) {
            if (t.action.equalsIgnoreCase("deposit")) {
                System.out.println("Deposit: $" + t.amount + " Balance: " + t.cBal);
            } else if (t.action.equalsIgnoreCase("withdraw")) {
                System.out.println("Withdrawal: $" + t.amount + " Balance: " + t.cBal);
            }
        }

        if (transactionList == null) {
            System.out.println("You have not made any transactions yet.");
        }

    }



}
