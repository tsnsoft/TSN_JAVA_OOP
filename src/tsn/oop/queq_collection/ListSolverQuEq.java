package tsn.oop.queq_collection;

import java.util.ArrayList;
import java.util.List;

// Класс коллекции-списка квадратных уравнеий с их решениями
public class ListSolverQuEq {

    private List<SolverQuEq> listSolverQuEq; // Список объектов квадратных уравнений

    // Секция инициализации класса
    {
        listSolverQuEq = new ArrayList<>(); 
    }

    // Добавление к списку объектов-уравнений нового уравнения с авторешением
    public void addQuEq (double a, double b, double c){
        listSolverQuEq.add(new SolverQuEq(a,b,c));
    }
    
    // Переопрелеление метода распечатки объекта
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); // Текстовая переменная с возможностью изменять содержимое
        for (int i = 0; i < listSolverQuEq.size(); i++) { // цикл по элементам коллекции-списка
            s.append(listSolverQuEq.get(i)); // добавляем в тестовую переменную результаты по каждрму уравнению
        }
        return s.toString();
    }

}
