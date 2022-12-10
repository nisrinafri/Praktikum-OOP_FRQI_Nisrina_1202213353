public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir = new TransportasiAir(5, 5000);
        transportasiAir.informasi();

        System.out.println();

        Sampan boat = new Sampan(10, 10000, 2);
        boat.informasi();
        boat.berlayar();
        boat.berlabuh();
        boat.berlabuh(2);

        System.out.println();

        Kapal ship = new Kapal(30, 20000, "Diesel");
        ship.informasi();
        ship.berlayar();
        ship.berlayar(20);
        ship.berlabuh();
    }

}
