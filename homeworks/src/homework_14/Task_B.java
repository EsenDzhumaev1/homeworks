package homework_14;

public class Task_B {
    public static void separation(){
        String sep = "=";
        System.out.println(sep.repeat(30));
    }
    public static void main(String[] args) {
        CompSpecs comp1 = new CompSpecs();
        comp1.cpu = "i3-4170";
        comp1.gpu = "gtx750";
        comp1.canPlayCyberPunk = false;

        CompSpecs comp2 = new CompSpecs();
        comp2.cpu = "2 Duo E8400";
        comp2.gpu = "gt710";
        comp2.canPlayCyberPunk = false;

        CompSpecs comp3 = new CompSpecs();
        comp3.cpu = "i5-10400";
        comp3.gpu = "rtx2060";
        comp3.canPlayCyberPunk = true;

        comp1.displayInfo();
        separation();
        comp2.displayInfo();
        separation();
        comp3.displayInfo();
    }

}
