package data_structures.queues.array_queue;

public class MyQueue {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(billEnd);

        queue.remove();
        queue.remove();

        queue.add(mikeWilson);

        queue.printQueue();
        System.out.println("peaking: " + queue.peek());
        System.out.println("removing: " + queue.remove());
        System.out.println("peaking: " + queue.peek());
    }
}
