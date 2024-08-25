package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public void makeSound() {System.out.println("meow");}
}
