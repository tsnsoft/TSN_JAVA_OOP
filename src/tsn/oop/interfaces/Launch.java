package tsn.oop.interfaces;

public class Launch {

    public static void main(String[] args) {
        IAnimal lion = new Lion();
        IAnimal dog = new Dog();
        IAnimal cat = new Cat();
        IAnimal bobcat = new Bobcat();
        IAnimal[] animalArray = {lion, dog, cat, bobcat};// мы помещаем в масив IAnimal другие классы и компилятор не ругается
        // главное, чтобы эти классы имплементировали интерфейс. Так можно делать и с абстрактными классами
        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i].makeYourSound(); // вызовет указанный метод для каждого класса
        }
        // Можно и так:
        for (IAnimal animalArray1 : animalArray) {
            animalArray1.makeYourSound();
        }
        Bobcat bobcat2 = new Bobcat();
        bobcat2.jump();
    }

}
