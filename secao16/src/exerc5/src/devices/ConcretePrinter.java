package secao16.src.exerc5.src.devices;

import secao16.src.exerc5.src.devices.interfaces.Printer;

public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
