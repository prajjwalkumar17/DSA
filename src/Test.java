import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printy();
    }

    private static void printy() {
        System.out.println("Enter the contact name..");
        String name = scanner.nextLine();
        System.out.println("Enter the contact no..");
        int phone = scanner.nextInt();
        System.out.println(" -----> " + name + "  " + phone);
    }
}
