package homework_19.Task_A;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java", "Не знаю", 1, "Нурсултан Таалайбеков");
        Student[] students = new Student[20];
        students[0] = new Student("20.08.04", "Джумаев", "Эсен", "Male", 16);
        Group group1 = new Group(students, course1, "15.03.21", 2);
        Lessons lessons = new Lessons("8.05.21", 4, course1, "19:00", true, false);
        System.out.println(lessons);
    }
}
