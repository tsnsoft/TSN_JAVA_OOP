package tsn.oop.absclasses_stclass;

// АБСТРАКТНЫЙ КЛАСС "ЖИВОТНОЕ"
public abstract class AAnimal {

    private String name; // может содержать поля

    public abstract void makeYourSound(); // метод без реализации (абстрактный)

    public void hi() { // метод с реализацией
        System.out.println("Hello, I'm " + name);
    }

    public String getName() { // метод с реализацией
        return name;
    }

    public void setName(String name) { // метод с реализацией
        this.name = name;
    }
 
}
