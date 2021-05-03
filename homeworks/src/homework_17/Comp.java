package homework_17;

import java.util.Arrays;

public class Comp {
    Display display;
    String brand;
    String color;
    HardDisk hdd;
    String GPU;
    RAM ram;
    USB[] usb;
    Keyboard keyboard;
    public Comp(String brand, String GPU){
        this.GPU = GPU;
        this.display = new Display();
        this.brand = brand;
        this.color = "black";
        this.hdd = new HardDisk();
        this.ram = new RAM();
        this.usb = new USB[]{new USB(1), new USB(2)};
        this.keyboard = new Keyboard();
    }
    public Comp(String GPU, Display display, String brand, String color, HardDisk hdd, RAM ram, USB[] usb, Keyboard keyboard){
        this.GPU = GPU;
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.hdd = hdd;
        this.ram = ram;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HardDisk getHdd() {
        return hdd;
    }

    public void setHdd(HardDisk hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public USB[] getUsb() {
        return usb;
    }

    public void setUsb(USB[] usb) {
        this.usb = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString(){
        return String.format("display: %s\n" +
                "GPU: %s\n" +
                "brand: %s\n" +
                "color: %s\n" +
                "hdd: %s\n" +
                "ram: %s\n" +
                "usb: %s\n" +
                "keyboard: %s",
                this.display,this.GPU ,this.brand, this.color, this.hdd, this.ram, Arrays.toString(this.usb), this.keyboard);
    }
}
