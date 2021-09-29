import java.util.ArrayList;
import java.util.Date;

public class PreviousTXN {

    private int amount;
    private String action;
    private static ArrayList <PreviousTXN> transactionList = new ArrayList<>();

    public PreviousTXN() {

    }

    public PreviousTXN(int amount, String action) {
        this.amount = amount;
        this.action = action;
    }

    public void addToTransactionList(int amount, String action) {
        PreviousTXN newTXN = new PreviousTXN(amount, action);

        transactionList.add(newTXN);

    }

    public void statement() {

        for (PreviousTXN t : transactionList) {
            if (t.action.equalsIgnoreCase("deposit")) {

                System.out.println("You have deposited $" + t.amount + " into your account today.");
            } else if (t.action.equalsIgnoreCase("withdraw")) {
                System.out.println("You have withdrawn $" + t.amount + " from your account today.");
            }

        }

        if (transactionList == null) {
            System.out.println("You have not made any transactions yet.");
        }

    }



}
