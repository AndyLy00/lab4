package computer.videocard_components;

import computer.VideoCard;

public class MSI extends VideoCard {
    private double price;
    private String madein;
    private String shop;


    public MSI(int videoCardMemory, String typeOfVideoCard, String videoCardModel, String videoCardCompany, double price, String madein, String shop) {
        super(videoCardMemory, typeOfVideoCard, videoCardModel, videoCardCompany);
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
        return "MSI{" +
                "price='" + price + '\'' +
                ", madein='" + madein + '\'' +
                ", shop='" + shop + '\'' +
                '}';
    }
}
