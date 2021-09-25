import java.util.Scanner;

public class Deposit {
    int deposit;

    public void userSelectedDeposit(User user) {
        makeDeposit();
        //howMuchToDeposit();
        user.setBalance(updatedBalance(user.getBalance(), deposit));
    }

    private int makeDeposit() {
        //TODO - Add Try/Catch
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to deposit today?");
        deposit = new Validator().deposit();
        return deposit;
    }
//    private void howMuchToDeposit() {
//        System.out.println("How much would you like to deposit today?");
//    }

    private int updatedBalance(int currentBalance, int deposit) {
        int updatedBal = currentBalance + deposit;
        System.out.println("Your balance is now " + updatedBal);
        return updatedBal;
    }


}
