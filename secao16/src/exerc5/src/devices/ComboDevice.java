package secao16.src.exerc5.src.devices;

import secao16.src.exerc5.src.devices.interfaces.Printer;
import secao16.src.exerc5.src.devices.interfaces.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }
}
