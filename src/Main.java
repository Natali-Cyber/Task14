
package main;

import hashmap.HashMapUtil;
import listperformance.ListPerformanceTest;
import removeduplicates.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Пример работы с HashMap
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "one");
        originalMap.put(2, "two");
        originalMap.put(3, "three");

        HashMap<String, Integer> swappedMap = HashMapUtil.swapKeysAndValues(originalMap);
        System.out.println("Swapped HashMap:");
        for (Map.Entry<String, Integer> entry : swappedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Тест производительности списков
        ListPerformanceTest performanceTest = new ListPerformanceTest();
        performanceTest.runTest(1000000, 1000);

        // Удаление дубликатов
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");  // Дубликат
        list.add("orange");
        list.add("banana");  // Дубликат

        ArrayList<String> uniqueList = RemoveDuplicates.removeDuplicates(list);
        System.out.println("Unique List: " + uniqueList);
    }
}

