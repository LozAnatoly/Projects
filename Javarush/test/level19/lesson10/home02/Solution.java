package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SortedMap<String, Double> map = new TreeMap<>();
        String s = null;

        while ((s = reader.readLine()) != null)
        {
            String key = s.split(" ")[0];
            Double value = Double.parseDouble(s.split(" ")[1]);
            Double currentValue = map.get(key);

            if (currentValue == null) currentValue = 0.0;
            map.put(key, value + currentValue);
        }
        reader.close();

        Double max = Double.MIN_VALUE;
        Double value;
        for (String s1 : map.keySet()) {
            value = map.get(s1);
            if (value > max) {
                max = value;
            }
        }

        for (String s2 : map.keySet()) {
            value = map.get(s2);

            if (value == max) {
                System.out.println(s2);
            }
        }
    }
}
