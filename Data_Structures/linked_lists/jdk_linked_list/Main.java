import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);

        System.out.println(list.size());
        for(Employee node: list) {
            System.out.println(node.toString());
        }

        list.addLast(mikeWilson);
        System.out.println(list.size());
        for(Employee node: list) {
            System.out.println(node.toString());
        }

        list.removeFirst();
        System.out.println(list.size());
        for(Employee node: list) {
            System.out.println(node.toString());
        }

        list.removeLast();
        System.out.println(list.size());
        for(Employee node: list) {
            System.out.println(node.toString());
        }
    }
}