package tsn.oop.interfaces;

// Класс "Кошка" реализует интерфейс "ЖИВОТНОЕ"
public class Cat implements IAnimal {

    @Override
    // реализация абстрактного методы
    public void makeYourSound() {
        System.out.println("Mauuu");
    }

}
