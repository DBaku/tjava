// Implementation des Interface in einer Klasse
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    
}