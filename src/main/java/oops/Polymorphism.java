package oops;

public class Polymorphism {
    public static void main(String[] args) {
        E obj = new F();
        obj.show();
    }
}
class E{
    void show(){
        System.out.println("In E show");
    }
}
class F extends E{
    @Override
    void show(){
        System.out.println("In F show");
    }
}
class G extends E{

}
