package homework_16.Task_B;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        Course course1 = new Course();
        Student student1 = new Student();

        student1.setBirthDate("20.08.04");
        student1.setSurname("Джумаев");
        student1.setName("Эсен");
        student1.setSex("Male");
        student1.setAge(16);

        Student[] students = new Student[1];
        students[0] = student1;
        //Создаю массив из одного студента, ибо мне лень всё это заполнять
        //А так принцип работы мне понятен

        course1.setName("Java");
        course1.setDateOfCreation("Не знаю");
        course1.setId(1);
        course1.setNameOfTeacher("Нурсултан Таалайбеков");

        group1.setStudents(students);
        group1.setCourse(course1);
        group1.setDateOfStart("15.03.21"); //Наверно
        group1.setMonthsDuration(2);

        System.out.println(group1.getInfo());
    }
}
