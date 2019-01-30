package tsn.oop.interfaces;

// ИНТЕРФЕЙС "ЖИВОТНОЕ"
//вместо class пишем interface
public interface IAnimal { //в интерфейсе находятся методы

    //в интерфейсе можно объявлять константы
    String ANIMAL = "Животное";//по умолчанию, все поля static, final public

    void makeYourSound(); // Метод издать свой голос
}
