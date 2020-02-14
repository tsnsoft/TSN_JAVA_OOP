package tsn.oop.queq;

// Класс "Квадратное уравнение"
public class QuEq {

    private double a, b, c; // Входные переменные
    private SolutionQuEq solutionQuEq; // Ответы x1 и x2

    // Конструктор класса с тремя входными параметрами
    public QuEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double d = (b * b) - 4 * a * c;
        try {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1)) &&
                    (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                solutionQuEq = new SolutionQuEq(x1, x2);
            } else {
                solutionQuEq = null;
            }
        } catch (Exception e) {
                solutionQuEq = null;
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

    public SolutionQuEq getSolutionQuEq() {
        return solutionQuEq;
    }
    
}
