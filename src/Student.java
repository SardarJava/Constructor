public class Student {

    public Student (){}

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student (String name, int ... age) {
    this.name = name;
        for (int a:age) {
            System.out.println(a);}


    /* To console :
        Student student = new Student("Jerry  ", 18);
        System.out.print(student.getName());
        System.out.println(student.getAge());

        Student student1 = new Student();
        student1.setName("Tommy  ");
        student1.setAge(19);
        System.out.print(student1.getName());
        System.out.println(student1.getAge());*/



    }
}
