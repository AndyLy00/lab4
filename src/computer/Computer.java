package computer;

public class Computer extends Root{
    private Additional additional;
    private Battery battery;
    private Case computerCase;
    private Memory memory;
    private Multimedia multimedia;
    private OperationSystem operationSystem;
    private Ports ports;
    private Processor processor;
    private RAM RAM;
    private Screen screen;
    private VideoCard videoCard;



    public Computer(computer.Additional additional,  computer.Battery battery, computer.Case computerCase, computer.Memory memory, computer.Multimedia multimedia, computer.OperationSystem operationSystem, computer.Ports ports, computer.Processor processor, computer.RAM RAM, computer.Screen screen, VideoCard videoCard) {
        this.additional = additional;
        this.battery = battery;
        this.computerCase = computerCase;
        this.memory = memory;
        this.multimedia = multimedia;
        this.operationSystem = operationSystem;
        this.ports = ports;
        this.processor = processor;
        this.RAM = RAM;
        this.screen = screen;
        this.videoCard = videoCard;
    }

    public Computer() {
    }

    public computer.Additional getAdditional() {
        return additional;
    }

    public computer.Battery getBattery() {
        return battery;
    }

    public computer.Case getComputerCase() {
        return computerCase;
    }

    public computer.Memory getMemory() {
        return memory;
    }

    public computer.Multimedia getMultimedia() {
        return multimedia;
    }

    public computer.OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public computer.Ports getPorts() {
        return ports;
    }

    public computer.Processor getProcessor() {
        return processor;
    }

    public computer.RAM getRAM() {
        return RAM;
    }

    public computer.Screen getScreen() {
        return screen;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "additional=" + additional +
                ", battery=" + battery +
                ", computerCase=" + computerCase +
                ", memory=" + memory +
                ", multimedia=" + multimedia +
                ", operationSystem=" + operationSystem +
                ", ports=" + ports +
                ", processor=" + processor +
                ", RAM=" + RAM +
                ", screen=" + screen +
                ", videoCard=" + videoCard +
                '}';
    }

    @Override
    public void cost(double pretInitial, double pretTransport, double procentArenda, double venit, double pretFinal) {
        pretFinal = pretInitial + pretTransport + procentArenda + venit;
        System.out.println(pretFinal);
    }

    public void cost(double pretInitial, double pretTransport, double procentArenda, double venit, double pretFinal, double reducere) {
        pretFinal = (pretInitial + pretTransport + procentArenda + venit) - reducere;
        System.out.println(pretFinal);
    }
}
