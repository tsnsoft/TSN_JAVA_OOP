package tsn.oop.encapsulation_extends;

import java.awt.Color;

public class Launch {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor(Color.BLACK);
        cat.setSex("man");
        cat.setWeight(20);
        System.out.println(cat.getColor());
        System.out.println(cat.getSex());
        System.out.println(cat.getWeight());
        System.out.println(cat);
        
        Bobcat bobcat = new Bobcat();
        bobcat.makeSound();
        bobcat.setWeight(12);
        
        // cat.makeSound(); // Так делать нельзя
        // cat.weight = -777; // Так делать нельзя
    }

}
