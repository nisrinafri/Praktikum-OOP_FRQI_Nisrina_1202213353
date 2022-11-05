import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu m1 = new Menu();
        m1.setName("Indomie");
        m1.setCategory("Noodles");
        m1.setPrice(10000);

        // TODO Insert Menu to Database
        db.insertMenu(m1);

        // TODO Display Main Menu
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to INT Restaurant");
        System.out.println("Please Register First");

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Phone Nummber: ");
        int phoneNumber = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);

        sc.close();

        // TODO Create User

        // Display Menu
    }
}
