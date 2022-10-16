import computer.*;
import computer.processor_components.AMD;
import computer.videocard_components.NVIDIA;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Additional> additionalList = new ArrayList<>(List.of(new Additional("Gaming", "ASUS", "ROG G17", "RGB", "Black"), new Additional("Personal", "Lenovo", "Legion 5", "LED White", "White"), new Additional("Business", "Acer", "Predator Helios 300", "RGB", "Gray")));

        List<Battery> batteryList = new ArrayList<>(List.of(new Battery("Li-lon"), new Battery("Ni-Cd"), new Battery("Ni-MH")));

        List<Case> caseList = new ArrayList<>(List.of(new Case(355, 243, 20, 2.0), new Case(354, 259, 27, 2.3), new Case(363, 261, 23, 2.4)));

        List<Memory> memoryList = new ArrayList<>(List.of(new Memory("SSD", 256), new Memory("HDD", 512), new Memory("SSD", 1024)));

        List<Multimedia> multimediaList = new ArrayList<>(List.of(new Multimedia(true, 2, true), new Multimedia(true, 5, true), new Multimedia(false, 4, true)));

        List<OperationSystem> systemList = new ArrayList<>(List.of(new OperationSystem("Windows"), new OperationSystem("Linux"), new OperationSystem("FreeDos")));

        List<Ports> portsList = new ArrayList<>(List.of(new Ports(4, true, 5.2, true, true, true, true), new Ports(3, true, 4.3, false, true, false, true), new Ports(2, true, 3.8, false, false, false, false)));

        List<Processor> processorList = new ArrayList<>(List.of(new AMD("3.30-4.90", 8, 4, "Zen 3+", "Ryzen 9", "6900HX", "AMD", 500, "Germany", "Ultra"), new Processor("2.50-4.50", 4, 8, "Comet Lake", "Core i5", "10300H", "Intel"), new Processor("2.10-4.00", 6, 8, "Zen 2+", "Ryzen 5", "2300HX", "AMD")));

        List<RAM> ramList = new ArrayList<>(List.of(new RAM(8, "DDR4"), new RAM(16, "DDR5"), new RAM(32, "DDR4")));

        List<Screen> screenList = new ArrayList<>(List.of(new Screen("IPS", "Anti-Glare", 15.6, 144), new Screen("OLED", "Anti-Glare", 16.0, 165), new Screen("IPS", "Matte", 17.2, 144)));

        List<VideoCard> videoCardList = new ArrayList<>(List.of(new VideoCard(4, "Discrete", "GeForce RTX 3050", "NVIDIA"), new NVIDIA(6, "Dicrete", "GeForce RTX 3060", "NVIDIA", 3000, "USA", "NeoComputers"), new VideoCard(4, "Integrate", "ARC 3", "INTEL")));

        Random random = new Random();

        Computer computer = new Computer(additionalList.get(random.nextInt(additionalList.size())), batteryList.get(random.nextInt(batteryList.size())), caseList.get(random.nextInt(caseList.size())), memoryList.get(random.nextInt(memoryList.size())),
                multimediaList.get(random.nextInt(multimediaList.size())), systemList.get(random.nextInt(screenList.size())), portsList.get(random.nextInt(portsList.size())), processorList.get(random.nextInt(portsList.size())), ramList.get(random.nextInt(ramList.size())), screenList.get(random.nextInt(ramList.size())), videoCardList.get(random.nextInt(videoCardList.size())));
        System.out.println(computer);


    }
}
