package computer;

public class Ports  extends Root{
    private int USB;
    private boolean audio;
    private double bluetoothVersion;
    private boolean typeC;
    private boolean HDMI;
    private boolean VGA;
    private boolean ethernet;

    public Ports(int USB, boolean audio, double bluetoothVersion, boolean typeC, boolean HDMI, boolean VGA, boolean ethernet) {
        this.USB = USB;
        this.audio = audio;
        this.bluetoothVersion = bluetoothVersion;
        this.typeC = typeC;
        this.HDMI = HDMI;
        this.VGA = VGA;
        this.ethernet = ethernet;
    }

    public Ports() {
    }

    public int getUSB() {
        return USB;
    }

    public boolean isAudio() {
        return audio;
    }

    public double getBluetoothVersion() {
        return bluetoothVersion;
    }

    public boolean isTypeC() {
        return typeC;
    }

    public boolean isHDMI() {
        return HDMI;
    }

    public boolean isVGA() {
        return VGA;
    }

    public boolean isEthernet() {
        return ethernet;
    }

    @Override
    public String toString() {
        return "Ports{" +
                "USB=" + USB +
                ", audio=" + audio +
                ", bluetoothVersion=" + bluetoothVersion +
                ", typeC=" + typeC +
                ", HDMI=" + HDMI +
                ", VGA=" + VGA +
                ", ethernet=" + ethernet +
                '}';
    }

    @Override
    public void fullPorts() {
        if (audio && typeC && HDMI && VGA && ethernet) {
            System.out.println("Full setup!");
        } else {
            System.out.println("We have a better setup...");
        }
    }
}
