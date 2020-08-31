package tsn.oop.absclasses_stclass;

import java.util.Date;

// Пример класса со статическим методом
public class MyDate {

    // Пример статического метода класса, для которого не надо создавать объект
    static void printDate() {
        System.out.format("%tD%n", new Date());
    }

}
