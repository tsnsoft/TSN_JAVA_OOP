package tsn.oop.queq_collection;

// Класс "Ответ квадратного уравнения"
public class AnswerQuEq {

    private double x1; // Скрытое вещественное поле x1
    private double x2; // Скрытое вещественное поле x2

    // Конструктор с 2-мя параметрами
    public AnswerQuEq(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    // Геттер для x1
    public double getX1() {
        return x1;
    }

    // Геттер для x2
    public double getX2() {
        return x2;
    }

    // Переопределение метода для распечатки объекта
    @Override
    public String toString() {
           return String.format("x1=%.3f   x2= %.3f", getX1(), getX2());
    }

    
}
