package secao16.src.exerc5.src.devices;

import secao16.src.exerc5.src.devices.interfaces.Scanner;

public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}
