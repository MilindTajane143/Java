class GarbageDemo {
    protected void finalize() {
    System.out.println("Garbage collected");
    }
   }
   public class Main {
    public static void main(String[] args) {
    // Testing Student Class
    Student s1 = new Student("John", 101, 85.5);
    s1.display();
   
    // Testing BankAccount Class
    BankAccount account = new BankAccount();
    account.deposit(5000);
    account.withdraw(2000);
    account.checkBalance();
   
    // Testing Car Class
    Car car1 = new Car("Toyota", "Corolla", 20000);
    car1.display();
   
    // Testing Inheritance
    CarVehicle car = new CarVehicle();
    car.type();
    car.carType();
   
    // Testing Method Overloading
    AreaCalculator ac = new AreaCalculator();
    System.out.println("Circle Area: " + ac.area(5));
    System.out.println("Rectangle Area: " + ac.area(4, 6));
    System.out.println("Triangle Area: " + ac.area(4, 6, true));
   
    // Testing Method Overriding
    Person p = new StudentPerson();
    p.showDetails();
   
    // Testing Encapsulation
    Customer cust = new Customer();
    cust.setName("Alice");
    cust.setAge(30);
    System.out.println("Customer Name: " + cust.getName() + ", Age: " + cust.getAge());
   
    // Testing Abstract Class
    Shape circle = new Circle();
    circle.draw();
    Shape rectangle = new Rectangle();
    rectangle.draw();
   
    // Testing Interface
    Animal dog = new Dog();
    dog.sound();
    Animal cat = new Cat();
    cat.sound();
   
    // Testing Garbage Collection
    GarbageDemo gd = new GarbageDemo();
    gd = null;
    System.gc();
    }
   }