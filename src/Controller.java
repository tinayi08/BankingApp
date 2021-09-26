import java.util.Scanner;

public class Controller {

    Transaction transaction;
    PreviousTXN previousTxn;
    Balance balance;
    int currentBal;
    User user;

    public Controller() {
        transaction = new Transaction();
        previousTxn = new PreviousTXN();
        balance = new Balance();

    }

    public void run() {
        welcomeMessage(initUser());
        do {
            menu();
            selection(user);
        } while (again("return to the main menu?"));
        System.out.println("Thank you for banking with us.");
    }

    private User initUser() {
        user = new User();
        user.createUser();
        return user;
    }

    private void welcomeMessage(User initUser) {
        System.out.println("Welcome to the bank, " + initUser.name + ". What would you like" +
                " to do today?");
    }

    private void menu() {
        System.out.println("\nSelect from the following options:");
        System.out.println("1 - Check your balance");
        System.out.println("2 - Make a deposit");
        System.out.println("3 - Make a withdrawal");
        System.out.println("4 - View the previous transaction");
        System.out.println("5 - Exit");
    }


    private void selection (User user) {
        int selection = transaction.validator.selection(1,5);

        if(selection == 1) {
            user.setBalance(balance.currentBalance(user));
            System.out.println("Current balance is: " + user.getBalance());

        } else if (selection == 2) {
            do {
                transaction.makeTransaction(user, "deposit");
            } while(again("make another deposit?"));

        } else if (selection == 3) {
            do {
                transaction.makeTransaction(user,"withdraw");
            } while (again("make another withdraw?"));
        } else if (selection == 4) {

        } else
            return;
    }

    private boolean again(String title) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWould you like to " + title);
        //System.out.println("Enter 1 for Yes or 2 for No");
        String answer = transaction.validator.yesOrNo();
        //int answer = transaction.validator.selection(1,2);
        if (answer.equalsIgnoreCase("yes")) {
            return true;
        } else
            return false;
    }

}
