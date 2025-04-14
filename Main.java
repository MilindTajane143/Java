class GarbageDemo {
    void cleanUp() {
        System.out.println("Garbage collected (manual cleanup)");
    }
}

class Vehicle {
    void type() {
        System.out.println("This is a vehicle");
    }
}

class CarVehicle extends Vehicle {
    void carType() {
        System.out.println("This is a car");
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Person {
    void showDetails() {
        System.out.println("Person details");
    }
}

class StudentPerson extends Person {
    void showDetails() {
        System.out.println("Student details");
    }
}

class Customer {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Testing Inheritance
        CarVehicle car = new CarVehicle();
        car.type();
        car.carType();

        // Testing Method Overriding
        Person p = new StudentPerson();
        p.showDetails();

        // Testing Encapsulation
        Customer cust = new Customer();
        cust.setName("Milind Tajane");
        cust.setAge(22);
        System.out.println("Customer Name: " + cust.getName() + ", Age: " + cust.getAge());

        // Testing Interface
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();

        // Testing Garbage Collection
        GarbageDemo gd = new GarbageDemo();
        gd.cleanUp(); // Explicit cleanup call
        gd = null;
        System.gc(); // JVM may or may not run garbage collection
    }
}
