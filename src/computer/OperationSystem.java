package computer;

public class OperationSystem  extends Root{
    private String typeOfSystem;

    public OperationSystem(String typeOfSystem) {
        this.typeOfSystem = typeOfSystem;
    }

    public String getTypeOfSystem() {
        return typeOfSystem;
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "typeOfSystem='" + typeOfSystem + '\'' +
                '}';

    }

    @Override
    public void showUnit() {
        System.out.println("Operation System");
    }

    public void showUnit(String a) {
        System.out.println("The operation system is " + a);
    }

    public void showUnit(String a, String b) {
        System.out.println("The operation system is " + a + " and " + b);
    }
}