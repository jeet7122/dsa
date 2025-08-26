package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
class C{
    void show(){
        System.out.println("In A show");
    }
}
class D extends C{
    @Override
    void show(){
        System.out.println("In B show");
    }
}
