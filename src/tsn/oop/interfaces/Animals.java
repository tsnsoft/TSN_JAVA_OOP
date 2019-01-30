package tsn.oop.interfaces;

public class Animals {

    public static void main(String[] args) {
        IAnimal lion = new Lion();
        IAnimal dog = new Dog();
        IAnimal cat = new Cat();
        IAnimal[] animalArray = {lion, dog, cat};// мы помещаем в масив IAnimal другие классы и компилятор не ругается
        // главное, чтобы эти классы имплементировали интерфейс. Так можно делать и с абстрактными классами
        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i].makeYourSound(); // вызовет указанный метод для каждого класса
        }
        // Можно и так:
        for (IAnimal animalArray1 : animalArray) {
            animalArray1.makeYourSound();
        }

    }

}
