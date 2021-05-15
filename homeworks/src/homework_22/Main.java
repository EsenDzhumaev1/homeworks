package homework_22;

public class Main {
    public static void main(String[] args) {
        Credit cr1 = new Credit(123, 2000000, 9, 0.02);
        Credit cr2 = new Credit(124, 3000000, 12, 0.015);
        Credit cr3 = new Credit(125, 1000000, 6, 0.03);
        Credit cr4 = new Credit(126, 5000000, 12, 0.01);
        Credit cr5 = new Credit(127, 4000000, 12, 0.015);
        Credit.displayInfo();
    }
}
