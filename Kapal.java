public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(Integer jumlahKursi, Integer biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi() {
        System.out.println("Informasi Transportasi Air");
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Biaya\t\t: " + biaya);
    };

    public void berlayar() {
        System.out.println("Kapal sedang berlayar");
    };

    public void berlayar(Integer kecepatan) {
        System.out.println("Kapal sedang berlayar dengan " + kecepatan + " knot");
    };

    public void berlabuh() {
        System.out.println("Kapal sedang berlabuh");
    };

}
