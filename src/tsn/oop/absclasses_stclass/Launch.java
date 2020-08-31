package tsn.oop.absclasses_stclass;

import java.util.Date;

public class Launch {

    // Пример вложенного статического класса
    private static class MyTime {

        // Пример вложенного статического метода класса, для которого не надо создавать объект
        static void printTime() {
            System.out.format("%tT%n", new Date());
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Cat");
        cat.hi();
        cat.makeYourSound();

        MyTime.printTime(); // пример вызова статического метода вложенного класса

        MyDate.printDate(); // пример вызова статического метода другого класса

        // Пример создания анонимного класса
        Cat cat2 = new Cat() {
            @Override
            public void makeYourSound() {
                System.out.println("Mur-mur");
            }
        };
        cat2.makeYourSound();
        
    }
}
