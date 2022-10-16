package computer.type_of_computers;

import computer.*;

public class Lenovo extends Computer {
    private double price;
    private String madein;
    private String shop;

    public Lenovo(Additional additional, Battery battery, Case computerCase, Memory memory, Multimedia multimedia, OperationSystem operationSystem, Ports ports, Processor processor, computer.RAM RAM, Screen screen, VideoCard videoCard, double price, String madein, String shop) {
        super(additional, battery, computerCase, memory, multimedia, operationSystem, ports, processor, RAM, screen, videoCard);
        this.price = price;
        this.madein = madein;
        this.shop = shop;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }


    @Override
    public String toString() {
        return "Lenovo{" +
                "price='" + price + '\'' +
                ", madein='" + madein + '\'' +
                ", shop='" + shop + '\'' +
                '}';
    }
}
