package listperformance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// метод для тестирования производительности списков
public class ListPerformanceTest {

    /**
     * Метод для тестирования производительности доступа по индексу в ArrayList и LinkedList.
     *
     * @param size        Количество элементов в списках.
     * @param iterations  Число выборок элементов из списков.
     */
    public void runTest(int size, int iterations) {
        Random random = new Random(); // В методе создается экземпляр Random.

        // Создание и заполнение ArrayList:
        // Создаётся объект ArrayList, который заполняется случайными числами в цикле for.
        // Используем random.nextInt(), чтобы получать случайные целые числа.
        List<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt());
        }

        // Создание и заполнение LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt());
        }

        // Измерение времени доступа к элементам в ArrayList
        // Сначала фиксируется текущее время в наносекундах с помощью System.nanoTime().
        // Затем выполняется iterations количество вызовов метода get(index) на arrayList со случайными индексами.
        // Сохраняется общее время, потраченное на доступы к элементам.
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int index = random.nextInt(size);
            arrayList.get(index); // Доступ по индексу
        }
        long arrayListTime = System.nanoTime() - startTime;

        // Измерение времени доступа к элементам в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int index = random.nextInt(size);
            linkedList.get(index); // Доступ по индексу
        }
        long linkedListTime = System.nanoTime() - startTime;

        // Вывод результатов в наносекуундах.
        System.out.println("ArrayList доступ: " + arrayListTime + " нс");
        System.out.println("LinkedList доступ: " + linkedListTime + " нс");

        // Предположение о различиях.
        // На основе полученных значений делается вывод о том, какой из списков быстрее.
        if (arrayListTime < linkedListTime) {
            System.out.println("ArrayList быстрее, потому что доступ по индексу осуществляется за O(1).");
        } else {
            System.out.println("LinkedList быстрее, потому что может быть случайный набор элементов.");
        }
    }
}
