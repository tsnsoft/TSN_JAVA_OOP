package tsn.oop.polymorphism;

import java.util.Date;

public class Launch {

    public static void main(String[] args) {
        Robot myRobot = new Robot();
        // вызов полиморфных (перегруженных) методов с разными параметрами
        myRobot.activation();
        myRobot.activation("Neo");
        myRobot.activation(3);
        myRobot.activation("Алиса", "Глеб", "Боб");
        myRobot.activation(new Date(), "Кэти", 12, 1200.0f);

        Robot myRobot2 = new Robot("Rescuer"); // создание объекта через полиморфный конструктор с параметром
        myRobot2.activation();
    }

}
