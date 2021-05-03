package homework_17;

public class RAM {
    int memorySize;
    String manufacturer;
    public RAM(){
        this.memorySize = 8;
        this.manufacturer = "Kingston";
    }
    public RAM(int memorySize, String manufacturer){
        this.memorySize = memorySize;
        this.manufacturer = manufacturer;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString(){
        return String.format("memorySize: %sGb; manufacturer: %s", this.memorySize, this.manufacturer);
    }
}
