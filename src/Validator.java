import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    public int selection(int begRange, int endRange) {
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                selection = scan.nextInt();
                userIntInput(selection, begRange, endRange);
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Please select a valid entry between " + begRange
                        + " and " + endRange + ":");
                scan.next();
            }
        }
        return selection;
    }

    private int userIntInput(int selection, int begRange, int endRange) {
        while (selection < begRange || selection >endRange) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please select a valid entry between " + begRange
            + " and " + endRange + ":");
            selection = scan.nextInt();
        }
        return selection;

    }

    public int amountToMove() {
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        int deposit = 0;
        while (!isValid) {
            try {
                deposit = scan.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid entry:");
                scan.next();
            }
        }
        return deposit;
    }

    public String yesOrNo() {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        boolean isValid = false;
        while (!isValid) {
            try {
                answer = scan.next();
                while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                    System.out.println("Please enter yes or no");
                    answer = scan.next();
                }
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter yes or no");
                scan.next();
            }
        }
        return answer;
    }
}
