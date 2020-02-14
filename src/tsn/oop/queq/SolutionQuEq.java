package tsn.oop.queq;

// Класс "Ответы квадратного уравнения"
public class SolutionQuEq {

    private final double x1; // Поле x1
    private final double x2; // Поле x2

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
