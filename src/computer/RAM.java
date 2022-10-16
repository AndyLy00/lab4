package computer;

public class RAM  extends Root{
    private int RAM;
    private String typeOfRAM;

    public RAM(int RAM, String typeOfRAM) {
        this.RAM = RAM;
        this.typeOfRAM = typeOfRAM;
    }

    public int getRAM() {
        return RAM;
    }

    public String getTypeOfRAM() {
        return typeOfRAM;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "RAM=" + RAM +
                ", typeOfRAM='" + typeOfRAM + '\'' +
                '}';
    }
}
