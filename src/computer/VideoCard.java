package computer;

public class VideoCard  extends Root{
    private int videoCardMemory;
    private String typeOfVideoCard;
    private String videoCardModel;
    private String videoCardCompany;

    public VideoCard(int videoCardMemory, String typeOfVideoCard, String videoCardModel, String videoCardCompany) {
        this.videoCardMemory = videoCardMemory;
        this.typeOfVideoCard = typeOfVideoCard;
        this.videoCardModel = videoCardModel;
        this.videoCardCompany = videoCardCompany;
    }

    public VideoCard() {
    }

    public int getVideoCardMemory() {
        return videoCardMemory;
    }

    public String getTypeOfVideoCard() {
        return typeOfVideoCard;
    }

    public String getVideoCardModel() {
        return videoCardModel;
    }

    public String getVideoCardCompany() {
        return videoCardCompany;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "videoCardMemory=" + videoCardMemory +
                ", typeOfVideoCard='" + typeOfVideoCard + '\'' +
                ", videoCardModel='" + videoCardModel + '\'' +
                ", videoCardCompany='" + videoCardCompany + '\'' +
                '}';
    }
}
