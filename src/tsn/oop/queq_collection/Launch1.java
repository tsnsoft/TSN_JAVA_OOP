package tsn.oop.queq_collection;

import java.util.Scanner;

public class Launch1 {

    public static void main(String[] args) {
        // Вычисление квадратного уравнения
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения");
        System.out.print("Введите a="); a = sc.nextDouble();
        System.out.print("Введите b="); b = sc.nextDouble();
        System.out.print("Введите c="); c = sc.nextDouble();

        SolverQuEq eq = new SolverQuEq(a, b, c); // Создаем объект для решения уравнения

        if (eq.getSolutionQuEq() != null) { // Проверка наличия рещения
            System.out.println(eq);
        } else {
            System.out.println("Нет решения!");
        }
        try {
        } catch (Exception e) {
        }

    }

}
