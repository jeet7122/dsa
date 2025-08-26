package oops;

public class Abstraction {
    public static void main(String[] args) {
        Wagon obj = new Wagon();
        obj.drive();
        obj.playMusic();
    }
}
abstract class Car{
    abstract void drive();
    void playMusic(){
        System.out.println("playing music");
    }
}
class Wagon extends Car{
    @Override
    void drive() {
        System.out.println("i know how to drive");
    }
}
