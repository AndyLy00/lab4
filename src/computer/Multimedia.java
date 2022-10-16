package computer;

public class Multimedia  extends Root{
    private boolean camera;
    private int numberOfSpeakers;
    private boolean microphone;

    public Multimedia(boolean camera, int numberOfSpeakers, boolean microphone) {
        this.camera = camera;
        this.numberOfSpeakers = numberOfSpeakers;
        this.microphone = microphone;
    }

    public Multimedia() {
    }

    public boolean isCamera() {
        return camera;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public boolean isMicrophone() {
        return microphone;
    }


    @Override
    public String toString() {
        return "Multimedia{" +
                "camera=" + camera +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", microphone=" + microphone +
                '}';
    }
}
