package homework_17;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(17, "HP", "TN");
        Comp comp = new Comp("Jump", "gtx750"); //Марка корпуса :D
        //наверно в задании имелся ввиду ноутбук
        comp.setDisplay(display); //Да, да, я сижу с квадратным моником
        System.out.println("Comp:\n" + comp);
    }
}
