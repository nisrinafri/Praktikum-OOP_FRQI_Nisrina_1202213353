public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public static Object getLock() {
        return lock;
    }

    public void makeFood() {
        synchronized (Restaurant.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("The restaurant is waiting for the waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            waitingForPickup = true;
            System.out.println("\nThe restaurant is making food number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("The restaurant is telling the waiter to get the food\n");
        }
    }
}