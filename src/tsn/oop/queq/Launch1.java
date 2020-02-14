package tsn.oop.queq;

import java.util.Scanner;

public class Launch1 {

    public static void main(String[] args) {
        // Вычисление квадратного уравнения
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения");

        System.out.print("Введите a=");
        a = sc.nextDouble();
        System.out.print("Введите b=");
        b = sc.nextDouble();
        System.out.print("Введите c=");
        c = sc.nextDouble();

        QuEq ur = new QuEq(a, b, c); // Создаем класс для решения уравнения

        if (ur.getSolutionQuEq() != null) { // Проверка наличия рещения
            System.out.println(ur);
        } else {
            System.out.println("Нет решения!");
        }
        try {
        } catch (Exception e) {
        }

    }

}
