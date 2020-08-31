package tsn.oop.polymorphism;

import java.util.Date;

public class Robot {

    private String nameRobot; // поле имени робото

    public Robot() { // конструктор по-умолчанию
        nameRobot = "Чудо-Робот";
    }

    public Robot(String nameRobot) { // полиморфный конструктор с дополнительным параметром
        this.nameRobot = nameRobot;
    }

    public void activation() {
        System.out.println("Приветик, я " + nameRobot + "!");
    }

    public void activation(String name) {
        System.out.println("Мне нравится твое имя, " + name + "!");
    }

    public void activation(int numCoffee) {
        System.out.println("Понял, делаю кофе на " + numCoffee + " порции...");
    }

    public void activation(String... friends) {
        System.out.println("Отлично, отошлю приветсвтвие этим ребятам:");
        for (String value : friends) { // цикл по переданным параметрам
            System.out.println("* " + value);
        }
    }

    public void activation(Date date, String name, int hour, float money) {
        System.out.format("Хорошо, %tD закину %s в %d часов %.2f тенге на телефон!%n ", date, name, hour, money);
    }

}
