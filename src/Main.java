public class Main {
    public static void main(String[] args) {


        Student student = new Student("Jerry  ", 18, 19, 28, 19);
        System.out.println(student.getName());
        System.out.print(student.getAge() + " ");

        Student student1 = new Student();
        student1.setName("Tommy  ");
        student1.setAge(19);
        System.out.println(student1.getName());
        System.out.print(student1.getAge());


    }}