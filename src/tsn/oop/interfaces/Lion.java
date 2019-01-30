package tsn.oop.interfaces;

// Класс "Лев" реализует интерфейс "ЖИВОТНОЕ"
public class Lion implements IAnimal {

    @Override
    // реализация абстрактного методы
    public void makeYourSound() {
        System.out.println("Roarrr");
    }

}
