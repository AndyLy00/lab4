package computer;

public class Case  extends Root{
    private int caseLength;
    private int caseWidth;
    private int caseThickness;
    private double caseWeight;



    public Case(int caseLength, int caseWidth, int caseThickness, double caseWeight) {
        this.caseLength = caseLength;
        this.caseWidth = caseWidth;
        this.caseThickness = caseThickness;
        this.caseWeight = caseWeight;
    }

    public Case() {
    }

    public int getCaseLength() {
        return caseLength;
    }

    public int getCaseWidth() {
        return caseWidth;
    }

    public int getCaseThickness() {
        return caseThickness;
    }

    public double getCaseWeight() {
        return caseWeight;
    }

    @Override
    public String toString() {
        return "Case{" +
                "caseLength=" + caseLength +
                ", caseWidth=" + caseWidth +
                ", caseThickness=" + caseThickness +
                ", caseWeight=" + caseWeight +
                '}';
    }
}
