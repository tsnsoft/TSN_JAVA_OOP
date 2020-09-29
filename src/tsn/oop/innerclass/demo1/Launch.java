package tsn.oop.innerclass.demo1;

public class Launch {

    public static void main(String[] args) {
        MyCalc calc = new MyCalc(3,7);
        System.out.println(calc);
        System.out.println(calc.getX1());
        System.out.println(calc.getX1());
        System.out.println(calc.getSumX1X2());
        System.out.println(calc.getMultX1X2());
        
        
        System.out.println(new MyCalc(13,27));
        System.out.println(new MyCalc(33,5));
        System.out.println(new MyCalc(25,85));
        
    }

    
}
