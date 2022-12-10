public class TransportasiAir {
    protected Integer jumlahKursi;
    protected Integer biaya;

    public TransportasiAir(Integer jumlahKursi, Integer biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi() {
        System.out.println("Informasi Transportasi Air");
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Biaya\t\t: " + biaya);
    }

    public void berlayar() {
        System.out.println("Transportasi Air");
    }

    public void berlabuh() {
        System.out.println("Berlabuh");
    }
}
