public class Sampan extends TransportasiAir {
    protected Integer layar;

    public Sampan(Integer jumlahKursi, Integer biaya, Integer layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override

    public void informasi() {
        System.out.println("Informasi Transportasi Air");
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Biaya\t\t: " + biaya);
    };

    public void berlayar() {
        System.out.println("Sampan sedang berlayar dengan " + layar + " layar");
    };

    public void berlabuh() {
        System.out.println("Sampan sedang berlabuh");
    };

    public void berlabuh(Integer jangkar) {
        System.out.println("Sampan sedang berlabuh dengan " + jangkar + " jangkar");
    };

}
