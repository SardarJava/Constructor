public class Fish {
    public Fish(){ }

    String name;
    int age;



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

    public Fish (String name, int age){
        this.name = name;
        this.age = age;
    }

// Fish Class Console:
        /* Fish fish2 = new Fish("Nemo ", 4);
        System.out.print(fish2.getName());
        System.out.println(fish2.getAge());

        Fish fish1 = new Fish();
        fish1.setName("Sazanio ");
        fish1.setAge(5);
        System.out.print(fish1.getName());
        System.out.print(fish1.getAge());
        System.out.println(); */



}
