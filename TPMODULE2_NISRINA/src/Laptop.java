public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public void informasi(){
        System.out.println("Laptop Information:");
        System.out.println("\tDrive\t\t: " + drive);
        System.out.println("\tRAM\t\t\t: " + ram + " GB");
        System.out.println("\tProcessor\t: " + processor + " GHz");
        System.out.println("\tWebcam\t\t: " + webcam);
    }
    public void bukaGame(String nama_game){
        System.out.println("Opening " + nama_game + "...");
    }
    public void kirimEmail(String email){
        System.out.println("Sending Email to " + email);
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Sending Email from " + email1 + " to " + email2);
    }




}
