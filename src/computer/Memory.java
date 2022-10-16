package computer;

public class Memory  extends Root{
    private String typeOfMemory;
    private int storage;

    public Memory(String typeOfMemory, int storage) {
        this.typeOfMemory = typeOfMemory;
        this.storage = storage;
    }

    public String getTypeOfMemory() {
        return typeOfMemory;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "typeOfMemory='" + typeOfMemory + '\'' +
                ", storage=" + storage +
                '}';
    }
}
