package tsn.oop.absclasses;

// АБСТРАКТНЫЙ КЛАСС "ЖИВОТНОЕ"
public abstract class Animal {

    public String name; // может содержать поля

    public abstract void makeYourSound(); // метод без реализации (абстрактный)

    public void hi() { // метод с реализацией
        System.out.println("Hello, I'm " + name);
    }

}
