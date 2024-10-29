import hashmap.HashMapUtil;
import listperformance.ListPerformanceTest;
import removeduplicates.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Пример работы с HashMap.
        // Создание исходного HashMap, где ключи - это целые числа, а значения - строки.
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "one");
        originalMap.put(2, "two");
        originalMap.put(3, "three");

        // Обмен ключей и значений с помощью метода из HashMapUtil.
        // Используется метод swapKeysAndValues, который меняет местами ключи и значения.
        HashMap<String, Integer> swappedMap = HashMapUtil.swapKeysAndValues(originalMap);

        // Выводим результирующий Map после обмена ключей и значений.
        System.out.println("Обмен ключей и значений HashMap:");
        for (Map.Entry<String, Integer> entry : swappedMap.entrySet()) {
            // Выводим каждую пару ключ-значение
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("----------------------");

        // Тест производительности списков.
        System.out.println("Тест производительности списков:");
        // Создаём экземпляр класса ListPerformanceTest для проведения тестирования.
        ListPerformanceTest performanceTest = new ListPerformanceTest();
        // Запускаем тест с 1000000 элементами и 1000 итерациями доступа.
        performanceTest.runTest(1000000, 1000);

        System.out.println("----------------------");

        // Удаление дубликатов.
        System.out.println("Удаление дубликатов:");
        // Создаем ArrayList и добавляем строки, включая дубликаты.
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");  // Дубликат
        list.add("orange");
        list.add("banana");  // Дубликат

        // Вызываем метод для удаления дубликатов
        // Результат сохраняется в переменной uniqueList
        ArrayList<String> uniqueList = RemoveDuplicates.removeDuplicates(list);

        // Выводим результат на экран, отображая уникальные строки
        System.out.println("Unique List: " + uniqueList); // Вывод: [apple, banana, orange]
    }
}

