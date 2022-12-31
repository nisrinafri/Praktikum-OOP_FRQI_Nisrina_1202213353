public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("===========================");
        System.out.println("Customer ID\t: " + this.customerID);
        System.out.println("Number Of Food\t: " + this.orderQty);
        System.out.println("Total Price\t: " + orderQty * foodPrice);
        System.out.println("===========================");
    }

    public void getFood() {
        synchronized (Restaurant.getLock()) {

            System.out.println("The waiter is delivering the food");
            Restaurant restoran = new Restaurant();
            restoran.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("The waiter is telling the restaurant to make another food\n");

        }
    }
}