public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        System.out.println("Handphone Information:");
        System.out.println("\tDrive\t\t: " + drive);
        System.out.println("\tRAM\t\t\t: " + ram + " GB");
        System.out.println("\tProcessor\t: " + processor + " GHz");
        System.out.println("\tFingerprint\t: " + fingerprint);
    }
    public void telfon(int no_hp){
        System.out.println("Calling " + no_hp + "...");
    }
    public void kirimSMS(int no_hp){
        System.out.println("Sending SMS to " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Sending SMS from " + no_hp1 + " to " + no_hp2);
    }

}
