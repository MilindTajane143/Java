interface Animal {
    void sound(); // Abstract method
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

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling the sound method
        dog.sound(); // Output: Dog barks
        cat.sound(); // Output: Cat meows
    }
}
