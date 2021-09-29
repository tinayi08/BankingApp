import java.util.ArrayList;
import java.util.Date;

public class PreviousTXN {

    private int amount;
    private String action;
    public static ArrayList <PreviousTXN> transactionList = new ArrayList<>();


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

        if (this.action == null) {
            System.out.println("You have not made any transactions yet.");
            return;
        }
//        } else if (this.action.equalsIgnoreCase("deposit")) {
//            System.out.println("You have deposited $" + amount + " into your account today.");
//        } else if (this.action.equalsIgnoreCase("withdraw")) {
//            System.out.println("You have withdrawn $" + amount + " from your account today.");
//        }

        for (PreviousTXN t : transactionList) {
            if (this.action.equalsIgnoreCase("deposit")) {
                System.out.println("You have deposited $" + amount + " into your account today.");
            } else if (this.action.equalsIgnoreCase("withdraw")) {
                System.out.println("You have withdrawn $" + amount + " from your account today.");
            }
        }
    }



}
