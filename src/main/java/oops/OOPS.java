package oops;

public class OOPS {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 200;
        Mobile.type = "SmartPhone";

        obj1.show();
        obj2.show();
        Mobile.show1();
    }
}
class Mobile{
    static String type = "Phone";
    String brand;
    int price;
     void show(){
        System.out.println("Brand: " + brand + " Price: " + price + " Type: " + type);
    }
    static void show1(){
        System.out.println("I am static method");
    }
}
