public class PreviousTXN {


    public void lastTransaction(int selection, int amount) {
        if (selection == 2) {
            System.out.println("Your last transaction was a deposit of $" + amount);
        } else if (selection == 3) {
            System.out.println("Your last transaction was a withdraw of $" + amount);
        } else
            System.out.println("You have not made a transaction yet.");
    }


}
