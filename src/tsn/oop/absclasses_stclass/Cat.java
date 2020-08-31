package tsn.oop.absclasses_stclass;

public class Cat extends AAnimal {//наследование от животного, чтобы получить еще более конкретное животное

    @Override
    // Реализация абстрактного метода у дочерненго класса Animal
    public void makeYourSound() {
        System.out.println("Mauuu");
    }

}
