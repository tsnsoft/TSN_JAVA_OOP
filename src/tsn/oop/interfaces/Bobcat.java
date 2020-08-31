package tsn.oop.interfaces;

// Класс "Рысь" наследует класс "КОШКА" и реализует интрефейс "ЖИВОТНОЕ"

public class Bobcat extends Cat implements IAnimal {

    @Override
    // реализация абстрактного методы
    public void makeYourSound() {
        System.out.println("Rrrr");
    }
    
    public void jump() {
        System.out.println("jump!");
    }

}
