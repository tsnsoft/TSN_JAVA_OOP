package tsn.oop.queq;

import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {
        // Вычисление квадратного уравнения
        double a, b, c;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения");

        System.out.print("Введите a=");  a = sc.nextDouble();
        System.out.print("Введите b=");  b = sc.nextDouble();
        System.out.print("Введите c=");  c = sc.nextDouble();

        QuEq ur = QuEq(a, b, c); // Создаем класс для решения уравнения
        
        if (ur.getSolutionQuEq() != null) {
            System.out.format("x1=%.3f%nx2= %.3f%n", ur.getX1(), ur.getX2());
        } else {
            System.out.println("Нет решения!");
        }
        try {
        } catch (Exception e) {
        }
    }

}
