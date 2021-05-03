package homework_17;

public class HardDisk {
    int memorySize; //Gigabytes
    int numberOfDisks;
    public HardDisk(){
        this.memorySize = 1024;
        this.numberOfDisks = 3;
    }
    public HardDisk(int memorySize, int numberOfDisks){
        this.memorySize = memorySize;
        this.numberOfDisks = numberOfDisks;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getNumberOfDisks() {
        return numberOfDisks;
    }

    public void setNumberOfDisks(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }
    @Override
    public String toString(){
        return String.format("memorySize: %sGb; numberOfDisks: %s", this.memorySize, this.numberOfDisks);
    }
}
