import java.util.Scanner;

public class Controller {

    Deposit deposit;
    Withdraw withdraw;
    PreviousTXN previousTxn;
    Balance balance;
    int currentBal;
    User user;

    public Controller() {
        deposit = new Deposit();
        withdraw = new Withdraw();
        previousTxn = new PreviousTXN();
        balance = new Balance();
    }

    public void run() {
        welcome(initUser());
        selection(user);
    }

    public User initUser() {
        user = new User();
        user.createUser();
        return user;
    }

    public void welcome (User initUser) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the bank, " + initUser.name + ". What would you like" +
                " to do today?");
        System.out.println("Select from the following options");
        System.out.println("1 - Check your balance");
        System.out.println("2 - Make a deposit");
        System.out.println("3 - Make a withdrawal");
        System.out.println("4 - View the previous transaction");
        System.out.println("5 - Exit");

    }

    public void selection (User user) {
        //TODO - TRY CATCH & Validator
        //TODO - Create a loop so it can select different options
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();
        if(selection == 1) {
            //currentBal = balance.currentBalance(user);
            user.setBalance(balance.currentBalance(user));
            //System.out.println("Current balance is: " + currentBal);
            System.out.println("Current balance is: " + user.getBalance());

        } else if (selection == 2) {
            do {
                deposit.makeDeposit();
                user.setBalance(deposit.updatedBalance(user.getBalance()));
            } while (deposit.anotherDeposit());

        }
    }
}
