package tsn.oop.queq;

public class Launch2 {

    public static void main(String[] args) {
        // Пример работы с классом с вложенным классом
        ListQuEq listQuEq = new ListQuEq();
        listQuEq.getListQuEq().add(new QuEq(-12, 33, 14));
        listQuEq.getListQuEq().add(new QuEq(-2, 3, 4));
        listQuEq.getListQuEq().add(new QuEq(22, -3, 55));
        System.out.println(listQuEq);
    }

}
