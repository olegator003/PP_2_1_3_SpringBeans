package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Timer timer;
    private final Animal animal;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, @Lazy Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        animal.makeSound();
        System.out.println("At:");
        System.out.println(timer.getElapsedTime());
        System.out.println("________________________");
    }
}
