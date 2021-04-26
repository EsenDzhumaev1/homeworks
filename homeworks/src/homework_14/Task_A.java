package homework_14;

public class Task_A {
    public static void separation(){
        String sep = "=";
        System.out.println(sep.repeat(30));
    }
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Esen";
        student1.age = 16;
        student1.direction = "Java";
        student1.sex = "Male";
        student1.isStudyingOffline = true;

        Student student2 = new Student();
        student2.name = "Chyngyz";
        student2.age = 29;
        student2.direction = "Java";
        student2.sex = "Male";
        student2.isStudyingOffline = true;

        Student student3 = new Student();
        student3.name = "Maxim";
        student3.age = 16;
        student3.direction = "Frontend";
        student3.sex = "Male";
        student3.isStudyingOffline = true;

        student1.displayInfo();
        separation();
        student2.displayInfo();
        separation();
        student3.displayInfo();
    }
}
