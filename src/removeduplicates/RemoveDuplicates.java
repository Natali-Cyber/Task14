package removeduplicates;

import java.util.ArrayList;
import java.util.HashSet;

// Класс для удаления дубликатов из списка строк
public class RemoveDuplicates {

    // Метод для удаления дубликатов
    // ArrayList<String> list – входной список строк, из которого нужно удалить дубликаты.
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        // Создание HashSet для хранения уникальных строк. Эта коллекция автоматически игнорирует дубликаты.
        HashSet<String> set = new HashSet<>();
        // Новый список для хранения результата
        // Переменная result служит для хранения уникальных строк в том же порядке, в котором они были в исходном списке.
        ArrayList<String> result = new ArrayList<>();

        // Проходим по всем строкам в исходном списке list.
        for (String str : list) {
            // Метод add возвращает true, если строка была добавлена (т.е. она не была ранее в set),
            // и false, если строка уже есть.
            // Мы добавляем строку в result, если она уникальна.
            if (set.add(str)) {
                // Добавляем её в результирующий список
                result.add(str);
            }
        }

        // Возвращаем список без дубликатов
        return result;
    }
}
