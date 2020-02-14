package tsn.oop.queq;

// Класс "Ответы квадратного уравнения"
public class SolutionQuEq {

    private double x1; // Скрытое поле x1
    private double x2; // Скрытое поле x2

    // Конструктор с 2-мя параметрами
    public SolutionQuEq(double x1, double x2) {
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

}
