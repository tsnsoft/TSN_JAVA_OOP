package tsn.oop.absclasses;

public class Cat extends Animal {//наследование от животного, чтобы получить еще более конкретное животное

    @Override
    // Реализация абстрактного метода у дочерненго класса Animal
    public void makeYourSound() {
        System.out.println("Mauuu");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Cat";
        cat.hi();
        cat.makeYourSound();
    }

}
