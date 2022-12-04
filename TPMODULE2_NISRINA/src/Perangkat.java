public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi() {
        System.out.println("Device Information:");
        System.out.println("\tDrive\t\t: " + drive);
        System.out.println("\tRAM\t\t\t: " + ram + " GB");
        System.out.println("\tProcessor\t: " + processor + " GHz");
    }
}