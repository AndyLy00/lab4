package computer.processor_components;

import computer.Processor;

public class Intel extends Processor {
    private double price;
    private String madein;
    private String shop;

    public Intel(String frequency, int cores, int cache, String architecture, String typeOfCPU, String CPUModel, String CPUCompany, double price, String madein, String shop) {
        super(frequency, cores, cache, architecture, typeOfCPU, CPUModel, CPUCompany);
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
        return "Intel{" +
                "price='" + price + '\'' +
                ", madein='" + madein + '\'' +
                ", shop='" + shop + '\'' +
                '}';
    }
}
