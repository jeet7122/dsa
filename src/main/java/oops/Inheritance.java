package oops;

public class Inheritance {
    public static void main(String[] args) {
        B obj1 = new B(1);
        B obj2 = new B();
    }
}
class A {
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In int A");
    }
}
class B extends A{
    public B(){
        super(5);
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("In int B");
    }
}
