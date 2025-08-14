class Animal {
    void eat() {
        System.out.println("Animal is sleep....");
    }
}

class Cat extends Animal {
    void purrs() {
        System.out.println("Cat is purrs....");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.purrs();
    }
}