package computer;

public class Screen  extends Root{
    private String display;
    private String displayCover;
    private double diagonal;
    private int refreshRate;

    public Screen(String display, String displayCover, double diagonal, int refreshRate) {
        this.display = display;
        this.displayCover = displayCover;
        this.diagonal = diagonal;
        this.refreshRate = refreshRate;
    }

    public Screen() {
    }

    public String getDisplay() {
        return display;
    }

    public String getDisplayCover() {
        return displayCover;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public String toString() {
        return "Screen{" +
                " display='" + display + '\'' +
                ", displayCover='" + displayCover + '\'' +
                ", diagonal=" + diagonal +
                ", refreshRate=" + refreshRate +
                '}';
    }
}
