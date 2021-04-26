package homework_14;

public class CompSpecs {
    String cpu;
    String gpu;
    boolean canPlayCyberPunk;
    void displayInfo(){
        System.out.printf("Процессор: %s\nВидеокарта: %s\n", cpu, gpu);
        if (canPlayCyberPunk) System.out.println("Киберпанк потянет");
        else System.out.println("Киберпанк не потянет");
    }
}
