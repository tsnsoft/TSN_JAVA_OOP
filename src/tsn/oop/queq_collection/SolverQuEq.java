package tsn.oop.queq_collection;

// Класс "Решатель квадратного уравнения"
public class SolverQuEq {
    private double a, b, c; // Входные данные
    private AnswerQuEq answerQuEq; // Ответы x1 и x2

    // Секция начальной инициализации класса
    {
        answerQuEq = null;
    }

    // Конструктор класса с тремя входными параметрами
    public SolverQuEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double d = (b * b) - 4 * a * c;
        try {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1))
                    && (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                answerQuEq = new AnswerQuEq(x1, x2);
            }
        } catch (Exception e) {
            answerQuEq = null;
        }

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public AnswerQuEq getSolutionQuEq() {
        return answerQuEq;
    }

    @Override
    public String toString() {
        String s = "Решенние для " + "a=" + a + ", b=" + b + ", c=" + c +":\t";
        if (answerQuEq != null) {
            return s + answerQuEq+"\n";
        } else {
            return s + "не существует\n";
        }
    }

}
