import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        String agency, clientName;
        double balance;

        System.out.print("Please, enter the agency number: ");
        number = sc.nextInt();

        System.out.print("Please, enter the agency name: ");
        agency = sc.next();

        System.out.print("Please, enter your name: ");
        clientName = sc.next();

        System.out.print("Please, enter your balance: ");
        balance = sc.nextDouble();

        System.out.printf("Hello %s, thanks for creating an account in our bank! Your agency is %s, account %d and your balance %.2f ready to withdraw", clientName,agency,number,balance);
    }
}
