import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> listMenu = new ArrayList<Menu>();

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu) {
        listMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        System.out.println("Our Menu");
        System.out.println("============================");
        for (int i = 1; i < listMenu.size(); i++) {
            System.out.println(
                    1 + i + "|" + listMenu.get(i).name + "|" + listMenu.get(i).category + "|" + listMenu.get(i).price);

        }
    }

    // TODO Create Method to Search Menu from Database
    public void searchMenu(Menu menu) {

    }

}
