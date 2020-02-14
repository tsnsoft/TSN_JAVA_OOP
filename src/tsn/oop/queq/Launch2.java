package tsn.oop.queq;

public class Launch2 {

    public static void main(String[] args) {
        // Пример работы с классом с вложенным классом
        ListSolverQuEq listSolverQuEq = new ListSolverQuEq();
        listSolverQuEq.addQuEq(-12, 33, 14);
        listSolverQuEq.addQuEq(-2, 3, 4);
        listSolverQuEq.addQuEq(22, -3, 55);
        System.out.println(listSolverQuEq);
    }

}
