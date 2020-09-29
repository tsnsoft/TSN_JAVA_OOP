package tsn.oop.innerclass.demo2;

// Класс "Решатель квадратного уравнения"
public class SolverQuEq {

    // Вложенный класс "Ответ квадратного уравнения"
    class AnswerQuEq {

        private double x1; // Скрытое поле x1
        private double x2; // Скрытое поле x2

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

    // Чтение из поля x1 внутреннего класса AnswerQuEq (метод 1)
    public double getX1() {
        return getSolutionQuEq().x1; 
    }

    // Чтение из поля x2 внутреннего класса AnswerQuEq (метод 2)
    public double getX2() {
        return answerQuEq.x2; 
    }
    
    public AnswerQuEq getSolutionQuEq() {
        return answerQuEq;
    }

    @Override
    public String toString() {
        String s = "Решенние для " + "a=" + a + ", b=" + b + ", c=" + c + ":\t";
        if (answerQuEq != null) {
            return s + answerQuEq + "\n";
        } else {
            return s + "не существует\n";
        }
    }

}
