import java.util.HashMap;
import java.util.Map;

public class HashMapUtil {
    // Метод для замены ключей и значений в HashMap
    public static HashMap<String, Integer> swapKeysAndValues(HashMap<Integer, String> map) {
        // Создаём новый HashMap для хранения перевернутых пар ключ-значение.
        HashMap<String, Integer> swappedMap = new HashMap<>();

        // Перебираем все записи оригинальной мапы.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            // Добавляем значение как новый ключ и ключ как новое значение.
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        // Возвращаем новый HashMap с перевернутыми парами.
        return swappedMap;
    }
}
