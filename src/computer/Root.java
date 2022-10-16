package computer;

public class Root {
    public void showUnit() {
        System.out.println("Root");
    }

    public void cost(double pretInitial, double pretTransport, double procentArenda, double venit, double pretFinal) {
        pretFinal = pretInitial + pretTransport + procentArenda + venit;
        System.out.println(pretFinal);
    }

    public void  fullPorts() {
        System.out.println("Full setup!");
    }
}
