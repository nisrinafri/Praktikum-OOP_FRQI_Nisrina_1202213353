public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Sandisk", 16, (float) 3.2);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone("Sandisk", 8, (float) 1.6, true);
        hp.informasi();
        hp.telfon(14045);
        hp.kirimSMS(765434);
        hp.kirimSMS(14045, 14022);

        System.out.println();

        Laptop laptop = new Laptop("ROG", 32, 16, true);
        laptop.informasi();
        laptop.bukaGame("Roblox");
        laptop.kirimEmail("elon@twitter.com");
        laptop.kirimEmail("hi@mcd.com", "yo@kfc.com");

    }
}
