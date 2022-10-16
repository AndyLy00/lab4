package computer.memory_components;

import computer.Memory;

public class Segregate extends Memory {
    private String mark;
    private double price;

    public Segregate(String mark,String typeOfMemory, int storage, double price) {
        super(typeOfMemory, storage);
        this.mark = mark;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Segregate{" +
                "mark='" + mark + '\'' +
                ", price=" + price +
                '}';
    }
}
