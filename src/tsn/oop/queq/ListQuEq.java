package tsn.oop.queq;

import java.util.ArrayList;
import java.util.List;

// Класс списка квадратных уравнеий с их решениями
public class ListQuEq {

    private List<QuEq> listQuEq; // Список объектов квадратных уравнений

    // Секция инициализации класса
    {
        listQuEq = new ArrayList<>(); 
    }

    // Доступ к списку объектов-уравнений
    public List<QuEq> getListQuEq() {
        return listQuEq;
    }

    // Переопрелеление методы распечатки объекта
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < listQuEq.size(); i++) {
            s.append(listQuEq.get(i));
        }
        return s.toString();
    }

}
