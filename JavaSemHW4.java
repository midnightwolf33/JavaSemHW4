import java.util.ArrayDeque;

public class task1 {

    public static ArrayDeque<Integer> getReversDeque(int count) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            int rand = (int) (Math.random() * (100 - 1));
            deque.addFirst(rand);
        }
        System.out.println(deque);

        for (int i = 0; i < count; i++) {
            reverseDeque.addFirst(deque.getFirst());
            deque.removeFirst();
        }
        return reverseDeque;
    }

    public static void main(String[] args) {

        System.out.println(getReversDeque(10));

    }

}

// #2

public class Main {
    public static void main(String[] args) {
        ex1();

        ex2();
    }


    public static void ex1(){
        System.out.println("Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.");
        var lst = new LinkedList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        System.out.println("Исходный список:\t" + lst.toString());
        System.out.println("Перевернутый список:\t" + new Ex1<Integer>().reverse(lst));
        System.out.println();
    }

    public static void ex2(){
        System.out.println("Реализуйте очередь с помощью LinkedList со следующими методами:");
        System.out.println("enqueue() - помещает элемент в конец очереди");
        System.out.println("dequeue() - возвращает первый элемент из очереди и удаляет его");
        System.out.println("first() - возвращает первый элемент из очереди, не удаляя.");
        var queue = new Ex2<Integer>();
        System.out.println("Добавляем в очередь цифры 1, 2, 3, 4");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.print("Очередь: \t");
        queue.printQueueToConsole();
        System.out.println("Получаем первый элемент без удаления:\t" + queue.first());
        System.out.print("Очередь: \t");
        queue.printQueueToConsole();
        System.out.println("Получаем первый элемент с удалением:\t" + queue.dequeue());
        System.out.print("Очередь: \t");
        queue.printQueueToConsole();
        System.out.println();
    }
}
