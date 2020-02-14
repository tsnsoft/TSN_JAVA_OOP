package tsn.oop.queq;

import java.util.ArrayList;
import java.util.List;

// Класс списка квадратных уравнеий с их решениями
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
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < listSolverQuEq.size(); i++) {
            s.append(listSolverQuEq.get(i));
        }
        return s.toString();
    }

}
