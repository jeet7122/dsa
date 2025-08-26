package oops;

public class Encapsulation {
    public static void main(String[] args) {
        Human navin = new Human();
        navin.name = "Navin";
        navin.setAge(16);
        System.out.println("Name:" + navin.name + " Age:" + navin.getAge());

        Human gang = new Human(100, "Gang Gang");
        System.out.println("Name:" + gang.name + " Age:" + gang.getAge());
    }
}

class Human{
    public String name;
    private int age;
    public Human(){

    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

