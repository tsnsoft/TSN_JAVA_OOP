
package tsn.oop.innerclass.demo1;

public class MyCalc {

    private class Answer {
        private final double sumX1X2;
        private final double multX1X2;
        public Answer(double sumX1X2, double multX1X2) {
            this.sumX1X2 = sumX1X2;
            this.multX1X2 = multX1X2;
        }
    }
    
    private final double x1;
    private final double x2;
    private final Answer answer;
    
    public MyCalc(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        //sumX1X2 = x1 + x2;
        //multX1X2 = x1 * x2;
        answer = new Answer(x1, x2);
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getSumX1X2() {
        return answer.sumX1X2;
    }

    public double getMultX1X2() {
        return answer.multX1X2;
    }

    @Override
    public String toString() {
        return "Вот расчет для " + "x1=" + x1 + " и x2=" + x2 + ": сумма=" + 
                answer.sumX1X2 + ", а произведение=" + answer.multX1X2;
    }

}
