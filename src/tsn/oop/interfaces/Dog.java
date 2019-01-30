package tsn.oop.interfaces;

// класс может имплементировать любое количество интерфейсов
public class Dog implements IAnimal {

    // аннотация @Override говорит о том что метод переопределен
    @Override
    public void makeYourSound() {
        System.out.println(ANIMAL + ": " + "Woof - woof");
    }

}
