package Learning.Basic;

public class Datatypes {
    public static void main(String[] args) {
        //These are PRIMITIVES DATATYPES
        int shreyash = 'A';
        boolean b1 = true;
        boolean b2 = false;
        byte palak = -128; //ranges from -128 to 127
        byte palak2 = 127;
        short a1 = -32768;
        short a2 = 32767;
        float f1 = 3.14f;
        float f2 = 3.145145145145f; // can only go up to 7 decimal points
        double d1 = 1.7124578451245784512; // can only go up to 15 digit after the decimal point
        System.out.println(shreyash);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(palak2);
        System.out.println(palak);
        System.out.println(b1);
        System.out.println(b2);

        //These are NON-PRIMITIVES Datatypes
        String a = "shreyash damodar";
        System.out.println(a);
        Car mum = new Car("A2Z","HYUNDAI",2025);
        mum.display();

        Fruite apple = new Fruite("Kashmiri apple",200);
        apple.display();

        System.out.println(apple.name);
    }
}

class Car {
    String model;
    String name;
    int year;

    Car(String model,String name, int year){
        this.model = model;
        this.name = name;
        this.year = year;
    }

    void display(){
        System.out.println(model+" "+name+" "+year);
    }
}

class Fruite {
    String name;
    int price;

    Fruite(String name, int price){
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(name+" "+price);
    }
}
