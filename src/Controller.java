import java.util.Scanner;

public class Controller {

//    public static void main(String[] args) {
//        Controller m = new Controller();
//        m.welcome(m.initUser());
//    }
//
    public void run() {
        welcome(initUser());
    }

    public User initUser() {
        User user = new User();
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
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();
        if(selection == 1) {


        }
    }
}
