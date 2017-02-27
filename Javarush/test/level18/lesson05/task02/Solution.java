package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            FileInputStream inputStream = new FileInputStream(read.readLine());
            int count = 0;
            while (inputStream.available() > 0)
            {
                int data = inputStream.read();
                if (data == 44)
                {
                    count++;
                }
            }

            System.out.println(count);
            inputStream.close();
            read.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
