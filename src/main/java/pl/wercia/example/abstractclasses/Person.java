package pl.wercia.example.abstractclasses;

public abstract class Person {

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public abstract void talk();

}
