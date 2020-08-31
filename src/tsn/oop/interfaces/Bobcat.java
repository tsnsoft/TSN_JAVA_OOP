package tsn.oop.interfaces;

// Класс "Рысь" наследует класс "КОШКА"
public class Bobcat extends Cat{

    @Override
    // реализация абстрактного методы
    public void makeYourSound() {
        System.out.println("Rrrr");
    }

}
