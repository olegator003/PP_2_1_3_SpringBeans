package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
