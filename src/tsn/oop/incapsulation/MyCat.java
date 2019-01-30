package tsn.oop.incapsulation;

import java.awt.Color;

public class MyCat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor(Color.BLACK);
        cat.setSex("man");
        cat.setWeight(20);
        System.out.println(cat.getColor());
        System.out.println(cat.getSex());
        System.out.println(cat.getWeight());
        System.out.println(cat);
    }

}
