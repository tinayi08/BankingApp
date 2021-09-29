import java.util.Date;

public class PreviousTXN {

    int amount;
    String action;
    Date date;

    public PreviousTXN() {

    }


    public PreviousTXN(int amount, String action) {
        this.amount = amount;
        this.action = action;
        //this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void statement() {
        if (this.action == null) {
            System.out.println("You have not made any transactions yet.");
            return;
        } else if (this.action.equalsIgnoreCase("deposit")) {
            System.out.println("You have deposited $" + amount + " into your account today.");
        } else if (this.action.equalsIgnoreCase("withdraw")) {
            System.out.println("You have withdrawn $" + amount + " from your account today.");
        }
    }

    public void transaction() {
        System.out.println(date + action + "$" + amount);
    }
    public void lastTransaction(int selection, int amount) {

        if (selection == 2) {
            transaction();
        } else if (selection == 3) {
            transaction();
        } else
            System.out.println("You have not made a transaction yet.");
    }


}
